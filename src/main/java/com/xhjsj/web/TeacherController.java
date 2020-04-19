package com.xhjsj.web;

import com.github.pagehelper.Page;
import com.xhjsj.domain.*;
import com.xhjsj.repository.PushRepository;
import com.xhjsj.repository.SysUserRepository;
import com.xhjsj.repository.TeacherApplyRepository;
import com.xhjsj.service.ExperimentInfoService;
import com.xhjsj.service.StudentApplyService;
import com.xhjsj.service.TeacherApplyService;
import com.xhjsj.service.impl.JpushService;
import com.xhjsj.utils.AjaxResult;
import com.xhjsj.utils.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@Api(tags = "教师功能相关接口(已完善)")
@RequestMapping("/tea")
public class TeacherController {
    @Resource
    TeacherApplyService    teacherApplyService;
    @Resource
    ExperimentInfoService  experimentInfoServiceImpl;
    @Resource
    StudentApplyService    studentApplyServiceImpl;
    @Resource
    TeacherApplyRepository teacherApplyRepository;
    @Autowired
    JpushService jpushService;
    @Resource
    PushRepository pushRepository;
    @Resource
    SysUserRepository sysUserRepository;


    /**
     * 教师提交实验室预约申请大致流程：
     * 1.点击申请实验室-选择要预约的实验-选择时间点-根据时间点或者时间范围查询出所有可被预约的空教室供教师选择
     * 2.点击提交申请，回显申请的申请单数据
     * 3.提交完态改至（实验管理员待审核）
     */
    @PostMapping("/findEmptyRoom")
    @ApiOperation(value = "查询空教室", notes = "根据教师选择的时间点和实验名查询出该时段的空教室")
    public AjaxResult applyExp(@RequestParam(value = "sDate", required = true) String startDate,
                               @RequestParam(value = "eDate", required = true) String endDate,
                               @RequestParam(value = "sTime", required = true) String sTime,
                               @RequestParam(value = "eTime", required = true) String eTime) {
        //首先在教师实验申请表查询出要预约的时间点已被占用的教室
        Date start = DateUtils.stringToDate2(startDate);
        Date end = DateUtils.stringToDate2(endDate);
        Integer sT = Integer.valueOf(sTime);
        Integer eT = Integer.valueOf(eTime);
        //List<TeacherApply> strings = teacherApplyService.timeSelect(start, end);
        List<TeacherApply> strings=teacherApplyService.timeSelect2(start,end,sT,eT);
        List<String> l = new ArrayList<>();
        for (TeacherApply s : strings) {
            l.add(s.getrNumber());
        }
        for (String rNum : l
        ) {
            System.out.println(rNum);
        }
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("dataList", teacherApplyService.SelectAllByNotsampleNum(l));
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }

    /**
     *
     * @author Jaykcy
     * @date 2020/3/21/021  16:14
     * @return com.xhjsj.utils.AjaxResult
     * 提交教师实验申请
     */
    @PostMapping("/commitExpApply")
    @ApiOperation(value = "提交教师实验申请", httpMethod = "POST")
    public AjaxResult addApply(@RequestBody TeacherApply apply) {
        TeacherApply t_e_apply=new TeacherApply();
        String teaApplyNum = DateUtils.getTeaApplyNum();
        t_e_apply.setReqNumber(teaApplyNum);
        t_e_apply.settNumber(apply.gettNumber());
        t_e_apply.settName(apply.gettName());
        t_e_apply.seteName(apply.geteName());
        t_e_apply.setSection(apply.getSection());
        t_e_apply.setrNumber(apply.getrNumber());
        t_e_apply.setrNowPer(0);
        t_e_apply.setrMaxPer(apply.getrMaxPer());
        t_e_apply.setStatus("申请提交(教师)");
        t_e_apply.setsDate(apply.getsDate());
        t_e_apply.seteDate(apply.geteDate());
        t_e_apply.setsTime(apply.getsTime());
        t_e_apply.seteTime(apply.geteTime());
        t_e_apply.setRemark(apply.getRemark());

        TeacherApply save = teacherApplyService.save(t_e_apply);
        AjaxResult ajaxResult = AjaxResult.success();
        if (save != null) {
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "教师实验申请提交成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "教师实验申请提交失败，请检查数据");
            ajaxResult.put("success", false);
        }
        return ajaxResult;

    }


    @PostMapping("/commitExpApplys")
    @ApiOperation(value = "提交教师实验申请（提交多条）", httpMethod = "POST")
    public AjaxResult addApplys(@RequestBody List<TeacherApply> apply) {
        TeacherApply save = null;
        String teaApplyNum1 = DateUtils.getTeaApplyNum();
        int i=0;
        for (TeacherApply t:apply) {
            int num = apply.indexOf(t);
            String teaApplyNum = DateUtils.getTeaApplyNum();
            TeacherApply t_e_apply=new TeacherApply();
            t_e_apply.settNumber(t.gettNumber());
            t_e_apply.settName(t.gettName());
            t_e_apply.seteName(t.geteName());
            t_e_apply.setSection(t.getSection());
            t_e_apply.setrNumber(t.getrNumber());
            t_e_apply.setrNowPer(0);
            t_e_apply.setrMaxPer(t.getrMaxPer());
            t_e_apply.setStatus("申请提交(教师)");
            t_e_apply.setsDate(t.getsDate());
            t_e_apply.seteDate(t.geteDate());
            t_e_apply.setsTime(t.getsTime());
            t_e_apply.seteTime(t.geteTime());
            t_e_apply.setRemark(t.getRemark());
            if(num==0){
                t_e_apply.setReqNumber(teaApplyNum1);
                t_e_apply.setAttriText01("0");
            }else{
                t_e_apply.setReqNumber(teaApplyNum);
                t_e_apply.setAttriText01(teaApplyNum1);
            }
            t_e_apply.setAttriNumber01(++i);
            save=teacherApplyService.save(t_e_apply);
        }
        AjaxResult ajaxResult = AjaxResult.success();
        if (save != null) {
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "教师实验申请提交成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "教师实验申请提交失败，请检查数据");
            ajaxResult.put("success", false);
        }
        return ajaxResult;

    }

    /**
     *
     * @author Jaykcy
     * @date 2020/3/21/021  16:15
     * @return java.util.List<com.xhjsj.domain.StudentApply>
     * 教师根据教师号查询自己申请的实验
     */
    @GetMapping("/findExpApllyByTeaNum")
    @ApiImplicitParam(name = "tNumber", value = "教师编号", required = true, paramType = "query", dataType = "String")
    @ApiOperation(value = "根据教师号查询自己申请的实验", httpMethod = "GET")
    public AjaxResult findExpApllyByTeaNum(@RequestParam(value = "tNumber", required = true) String tNumber) {
        List<TeacherApply> list = teacherApplyService.findAllByTNumber(tNumber,1);
        AjaxResult ajaxResult = AjaxResult.success();
        if (list != null) {
            ajaxResult.put("dataList", list);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "教师实验申请查询成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "未查询出该教师的实验申请");
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }

    @GetMapping("/selectAllExp")
    @ApiOperation(value = "查询实验表中所有实验", httpMethod = "GET")
    public AjaxResult selectAllExp() {
        List<ExperimentInfo> list = experimentInfoServiceImpl.findAll();
        AjaxResult ajaxResult = AjaxResult.success();
        if (list.size()!=0) {
            ajaxResult.put("dataList", list);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "实验信息查询成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "未查询出相关实验信息");
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }

    /*************教师审核实验相关方法*********************/
    /**
     *
     * @author Jaykcy
     * @date 2020/3/21/021  19:10
     * 1.已审核
     * 2.待审核
     */

    @GetMapping("/auditedApply")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tNumber", value = "教师编号", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "查询教师名下已审核的学生实验申请", httpMethod = "GET")
    public AjaxResult auditedApply(@RequestParam(value = "tNumber", required = true) String tNumber,
                                   @RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum) {
        Integer pn=Integer.valueOf(pageNum);
        List<StudentApply> check = new ArrayList<>();
        List<TeacherApply> list = teacherApplyService.findAllByTNumber(tNumber,pn);
        //for (TeacherApply teacherApply : list) {
        List<StudentApply> apply = studentApplyServiceImpl.findByENameAndStatusAndETName(list.get(0).geteName(), "申请通过(教师)", list.get(0).gettName());
        List<StudentApply> apply1 = studentApplyServiceImpl.findByENameAndStatusAndETName(list.get(0).geteName(), "申请通过(管理员)", list.get(0).gettName());
        check.addAll(apply);
        check.addAll(apply1);
        //}
        AjaxResult ajaxResult = AjaxResult.success();
        if (check.size()!=0) {
            ajaxResult.put("dataList", check);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "学生实验申请查询成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "未查询出该教师名下已审核的学生实验申请");
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }

    //待审批的学生实验申请
    @PostMapping("/auditingApply")
    @ApiOperation(value = "查询教师名下待审核的学生实验申请", httpMethod = "POST")
    public AjaxResult auditingApply(@RequestBody AuditingApply auditingApply) {

        Integer pn=Integer.valueOf(auditingApply.getPageNum());
        List<StudentApply> check = new ArrayList<>();
        List<TeacherApply> list = teacherApplyService.findAllByTNumber(auditingApply.gettNumber(),pn);
        System.out.println(list);
        if(auditingApply.geteName()!=null){
            //for (TeacherApply teacherApply : list) {
            Page<StudentApply> apply = studentApplyServiceImpl.findByENameAndStatusAndETName(auditingApply.geteName(), "申请提交(学生)", list.get(0).gettName());
            Page<StudentApply> apply1 = studentApplyServiceImpl.findByENameAndStatusAndETName(auditingApply.geteName(), "申请退回(管理员)", list.get(0).gettName());
            System.out.println("aa");
            check.addAll(apply);
            check.addAll(apply1);
            //}
        }else{
            //for (TeacherApply teacherApply : list) {
            Page<StudentApply> apply = studentApplyServiceImpl.findByENameAndStatusAndETName(list.get(0).geteName(), "申请提交(学生)", list.get(0).gettName());
            Page<StudentApply> apply1 = studentApplyServiceImpl.findByENameAndStatusAndETName(list.get(0).geteName(), "申请退回(管理员)", list.get(0).gettName());
            System.out.println("bb");
            check.addAll(apply);
            check.addAll(apply1);
            //}
        }
        System.out.println(check);
        AjaxResult ajaxResult = AjaxResult.success();
        if (check.size()!=0) {
            ajaxResult.put("dataList", check);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "学生实验申请查询成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "未查询出该教师名下待审核的学生实验申请");
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }

    @PostMapping("/updateTeaApplyStatus")
    @ApiImplicitParam(name = "reqNumber", value = "教师实验申请单号", required = true, paramType = "query", dataType = "String")
    @ApiOperation(value = "教师取消实验申请", httpMethod = "POST")
    public AjaxResult updateTeaApplyStatus(@RequestParam(value = "reqNumber", required = true) String reqNumber) {
        List<TeacherApply> teacherApply = teacherApplyService.findExpDetailByT(reqNumber);
        AjaxResult ajaxResult = AjaxResult.success();
        TeacherApply save = null;
        for (TeacherApply t:teacherApply) {
            if(!"申请提交(教师)".equals(t.getStatus())){
                ajaxResult.put("result", "N");
                ajaxResult.put("message", "由于申请已被实验管理员同意，取消失败！，请联系实验管理员");
                ajaxResult.put("success", false);
                return ajaxResult;
            }else{
                t.setStatus("申请取消(教师)");
                save = teacherApplyRepository.save(t);
            }
        }
        if (save != null) {
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "教师实验申请取消成功！");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "教师实验申请取消失败,请联系实验管理员！");
            ajaxResult.put("success", false);
        }
        return ajaxResult;

    }

    @PostMapping("/updateStuApplyStatus")
    @ApiImplicitParam(name = "reqNumber", value = "学生实验申请单号", required = true, paramType = "query", dataType = "String")
    @ApiOperation(value = "审批学生实验申请状态（7：审核通过  8：审核退回）", httpMethod = "POST")
    public AjaxResult updateStuApplyStatus(@RequestParam(value = "reqNumber", required = true) String reqNumber,
                                           @RequestParam(value = "status", required = true) String status) {
        String s="";
        String messType="";
        if("7".equals(status)){
            s="申请通过(教师)";
            messType="通过通知";
        }else if(("8".equals(status))){
            s="申请退回(教师)";
            messType="退回通知";
        }
        AjaxResult ajaxResult = AjaxResult.success();
        if (teacherApplyService.updateSeaStatus(reqNumber, s) != 0) {
            StudentApply applyByReqNumber = studentApplyServiceImpl.findAllByReqNumber(reqNumber);
            String title ="实验申请状态有更新";
            String content = "你的实验申请："+applyByReqNumber.geteName()+" 状态已变为："+s;
            Map<String, String> extrasMap = new HashMap<String, String>();
            Push p =new Push();
            p.setReqnumber(reqNumber);
            p.setRole("student");
            p.setMessagetype(messType);
            p.setMessage(content);
            p.setReaded(false);
            p.setReceiver(applyByReqNumber.getsNumber());
            p.setCreatedBy((sysUserRepository.findByUserName(applyByReqNumber.geteTName())).getAccount());
            extrasMap.put("extras",p.toString());
            pushRepository.save(p);
            jpushService.sendPush(title, content, extrasMap, applyByReqNumber.getsNumber());
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "学生实验申请单："+reqNumber+"审批成功");
            ajaxResult.put("success", true);
            return ajaxResult;
        }else{
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "学生实验申请单："+reqNumber+"審批失敗，教室已达到最大预约数！");
            ajaxResult.put("success", false);
        }
        return ajaxResult;

    }


    /****************教师查询实验申请相关方法组合**********************/
    /**
    * 1.申请单号
    * 2.申请状态
     * 3.教室编号
     * */
    @GetMapping("/likeQueryExpApplyByTeaNum")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tNumber", value = "教师编号", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "keywords", value = "模糊查询值", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pageSize", value = "每页几条", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "教师模糊查询名下实验申请(带分页，默认值：当前页：1  每页长度：10)", httpMethod = "GET")
    public AjaxResult likeQueryExpApplyByTeaNum(@RequestParam(value = "tNumber", required = true) String tNumber,
                                                @RequestParam(value = "keywords", required = false) String keywords,
                                                @RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum,
                                                @RequestParam(value = "pageSize", required = false,defaultValue = "10") String pageSize)
    {
        Integer pn=Integer.valueOf(pageNum);
        Integer ps=Integer.valueOf(pageSize);
        System.out.println(pn);
        System.out.println(ps);
        System.out.println(keywords);
        List<TeacherApply> list = teacherApplyService.likeQueryExpApplyByTeaNumAndKeywords(tNumber,keywords,pn,ps);
        AjaxResult ajaxResult = AjaxResult.success();
        if (list.size()!=0) {
            ajaxResult.put("dataList", list);
            ajaxResult.put("result", "Y");
            ajaxResult.put("messagqueryExpApplyByTeaNumAndStatuse", "教师实验申请查询成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "未查询出该条件下教师的实验申请");
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }


    @GetMapping("/queryExpApplyByTeaNumAndStatus")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tNumber", value = "教师编号", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "status", value = "审批状态", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pageSize", value = "每页几条", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "教师根据状态查询自己名下的实验申请(带分页，默认值：当前页：1  每页长度：10)", httpMethod = "GET")
    public AjaxResult queryExpApplyByTeaNumAndStatus(@RequestParam(value = "tNumber", required = true) String tNumber,
                                                     @RequestParam(value = "status", required = false) String status,
                                                     @RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum,
                                                     @RequestParam(value = "pageSize", required = false,defaultValue = "10") String pageSize)
    {
        Integer pn=Integer.valueOf(pageNum);
        Integer ps=Integer.valueOf(pageSize);
        String s="";
        switch(status){
            case "0" :
                s="";
                break;
            case "1" :
                s="申请提交(教师)";
                break;
            case "2" :
                s="申请取消(教师)";
                break;
            case "3" :
                s="申请通过(管理员)";
                break;
            case "4" :
                s="申请退回(管理员)";
                break;
        }
        List<TeacherApply> list = teacherApplyService.likeQueryExpApplyByTeaNum(tNumber,null,s,null,pn,ps);
        AjaxResult ajaxResult = AjaxResult.success();
        if (list.size()!=0) {
            ajaxResult.put("dataList", list);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "教师实验申请查询成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "未查询出该教师状态为："+s+"的实验申请");
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }
}

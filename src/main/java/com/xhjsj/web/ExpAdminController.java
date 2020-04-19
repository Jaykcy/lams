package com.xhjsj.web;

import com.xhjsj.domain.Push;
import com.xhjsj.domain.StudentApply;
import com.xhjsj.domain.TeacherApply;
import com.xhjsj.repository.PushRepository;
import com.xhjsj.service.ExpAdminService;
import com.xhjsj.service.StudentApplyService;
import com.xhjsj.service.SysAdminService;
import com.xhjsj.service.TeacherApplyService;
import com.xhjsj.service.impl.JpushService;
import com.xhjsj.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@Api(tags = "实验管理员相关接口(已完善)")
@RequestMapping("/expAdmin")
public class ExpAdminController {
    @Resource
    private SysAdminService adminService;

    @Resource
    private ExpAdminService expAdminService;

    @Resource
    StudentApplyService studentApplyService;

    @Resource
    TeacherApplyService teacherApplyService;

    @Resource
    PushRepository pushRepository;

    @Autowired
    JpushService jpushService;

    /**
     * 1.查询所有老师的教学实验申请（可介入状态的修改）
     * 2.查询所有学生的教学实验申请（不可介入状态的修改），
     * 但是可以对所有状态为“申请通过(教师）”的学生实验申请表进行审批
     */

    @GetMapping("/selectAllTeaExpApply")
    @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String")
    @ApiOperation(value = "查询所有教师提交的教学实验申请", httpMethod = "GET")
    public AjaxResult selectAllTExpApply(@RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum) {
        Integer pn=Integer.valueOf(pageNum);
        AjaxResult ajaxResult = AjaxResult.success();
        if (!expAdminService.selectAllTExpApply(pn).isEmpty()) {
            ajaxResult.put("dataList", expAdminService.selectAllTExpApply(pn));
            ajaxResult.put("message", "查询成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
        }else{
            ajaxResult.put("message", "未查询出待审核的教师实验申请");
            ajaxResult.put("success", false);
            ajaxResult.put("result", "N");
        }
        return ajaxResult;
    }

    @GetMapping("/selectAllStuExpApply")
    @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String")
    @ApiOperation(value = "查询所有教师审核通过的学生实验申请", httpMethod = "GET")
    public AjaxResult selectAllSExpApply(@RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum) {
        Integer pn=Integer.valueOf(pageNum);
        AjaxResult ajaxResult = AjaxResult.success();
        if (!expAdminService.selectAllSExpApply(pn).isEmpty()) {
            ajaxResult.put("dataList", expAdminService.selectAllSExpApply(pn));
            ajaxResult.put("message", "查询成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
            return ajaxResult;
        }
        ajaxResult.put("message", "未查询出待审核的学生实验申请");
        ajaxResult.put("success", false);
        ajaxResult.put("result", "N");
        return ajaxResult;
    }

    /*******************实验管理员部分**********************/
    @GetMapping("/selectAllTExpApply")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "t_name", value = "教师姓名", defaultValue = "", required = true),
            @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "通过教师姓名查询所有'申请提交（教师）'的教学实验申请", httpMethod = "GET")
    public AjaxResult selectAllTExpApplyByName(@RequestParam(value = "t_name", required = true) String t_name,
                                               @RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum) {
        Integer pn=Integer.valueOf(pageNum);
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        if (t_name.equals("")) {
            ajaxResult.put("dataList", expAdminService.selectAllTExpApply(pn));
            return ajaxResult;
        } else {
            ajaxResult.put("dataList", expAdminService.selectAllSExpApplyBytName(t_name));
            return ajaxResult;
        }
    }

    @GetMapping("/selectAllSExpApplyByName")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "s_name", value = "学生姓名", defaultValue = "", required = true,dataType = "String"),
            @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "通过学生姓名查询所有'申请通过（教师）'的学生教学实验申请", httpMethod = "GET")
    public AjaxResult selectAllSExpApplyByName(@RequestParam(value = "s_name", required = true) String s_name,
                                               @RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum) {
        Integer pn=Integer.valueOf(pageNum);
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        if (s_name.equals("")) {
            ajaxResult.put("dataList", expAdminService.selectAllSExpApply(pn));
            return ajaxResult;
        } else {
            ajaxResult.put("dataList", expAdminService.selectAllSExpApplyBysName(s_name));
            return ajaxResult;
        }
    }


    /**
     * 实验管理员对教师申请单状态进行更新（页面ist参数：申请单号，数字3：申请通过；数字4：申请不通过；其他：申请取消）
     *
     * @param
     * @return java.lang.String
     * @author Jaykcy
     * @date 2019/11/21/021  22:59
     */
    @PostMapping("/updateTeaApplyStatus")
    @ApiOperation(value = "实验管理员对教师申请单状态进行更新", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "reqNumber", value = "申请单编号", defaultValue = ""),
            @ApiImplicitParam(name = "status", value = "操作标志（3：通过  4：驳回）", defaultValue = "1", required = true)
    })
    public AjaxResult updateTeaApplyStatus(@RequestParam(value = "reqNumber", required = true) String reqNumber,
                                           @RequestParam(value = "status", required = true) String status) {
        AjaxResult ajaxResult = AjaxResult.success();
        String s = getString(status);
        String messType="";
        if("申请通过(管理员)".equals(s)){
            messType="通过通知";
        }else{
            messType="退回通知";
        }
        if (expAdminService.updateTeasStatus(reqNumber, s) != null) {
            TeacherApply applyByReqNumber = teacherApplyService.findAllByReqNumber(reqNumber);
            String title ="实验申请状态有更新";
            String content = "你的实验申请："+applyByReqNumber.geteName()+" 状态已变为："+s;
            Map<String, String> extrasMap = new HashMap<String, String>();
            Push p =new Push();
            p.setReqnumber(reqNumber);
            p.setRole("teacher");
            p.setMessagetype(messType);
            p.setMessage(content);
            p.setReaded(false);
            p.setReceiver(applyByReqNumber.gettNumber());
            p.setCreatedBy("expAdmin");
            extrasMap.put("extras",p.toString());
            pushRepository.save(p);
            jpushService.sendPush(title, content, extrasMap, applyByReqNumber.gettNumber());
            ajaxResult.put("message", "单号:" + reqNumber + " 状态更新成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
            return ajaxResult;
        }
        ajaxResult.put("message", "单号:" + reqNumber + " 更新失败");
        ajaxResult.put("success", false);
        ajaxResult.put("result", "N");
        return ajaxResult;
    }

    public String getString(String status_code) {
        //0 审核中  1审核通过  2审核驳回  3申请取消  4申请超时
        String status = "";
        if (!status_code.isEmpty() && status_code.equals("3")) {
            status = "申请通过(管理员)";
        } else if (status_code.equals("4")) {
            status = "申请退回(管理员)";
        } else {
            status = "申请取消(管理员)";
        }
        return status;
    }

    /**
     * 实验管理员对学生申请单状态进行更新
     *
     * @param
     * @return java.lang.String
     * @author Jaykcy
     * @date 2019/11/23/023  16:26
     */
    @PostMapping("/updateStuApplyStatus")
    @ApiOperation(value = "实验管理员对学生申请单状态进行更新", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "reqNumber", value = "申请单编号", defaultValue = "", required = true),
            @ApiImplicitParam(name = "status", value = "操作标志（9：审核通过  10：审核驳回 ）", defaultValue = "9", required = true)
    })
    public AjaxResult updateStuApplyStatus(@RequestParam(value = "reqNumber", required = true) String reqNumber,
                                           @RequestParam(value = "status", required = true) String status) {
        AjaxResult ajaxResult = AjaxResult.success();
        String messType="";
        switch(status){
            case "9" :
                status="申请通过(管理员)";
                messType="通过通知";
                break; //可选
            case "10" :
                status="申请退回(管理员)";
                messType="退回通知";
                break; //可选
        }
        if (expAdminService.updateSeaStatus(reqNumber, status) != 0) {
            StudentApply applyByReqNumber = studentApplyService.findAllByReqNumber(reqNumber);
            String title ="实验申请状态有更新";
            String content = "你的实验申请："+reqNumber+" 状态已变为："+status;
            Map<String, String> extrasMap = new HashMap<String, String>();
            Push p =new Push();
            p.setReqnumber(reqNumber);
            p.setRole("student");
            p.setMessagetype(messType);
            p.setMessage(content);
            p.setReaded(false);
            p.setReceiver(applyByReqNumber.getsNumber());
            p.setCreatedBy("expAdmin");
            extrasMap.put("extras",p.toString());
            pushRepository.save(p);
            jpushService.sendPush(title, content, extrasMap, applyByReqNumber.getsNumber());
            ajaxResult.put("message", "单号:" + reqNumber + " 状态更新成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
            return ajaxResult;
        }
        ajaxResult.put("message", "单号:" + reqNumber + " 状态更新失败，请重试！");
        ajaxResult.put("success", false);
        ajaxResult.put("result", "N");
        return ajaxResult;
    }
}

package com.xhjsj.web;


import com.xhjsj.domain.StudentApply;
import com.xhjsj.service.StudentApplyService;
import com.xhjsj.service.StudentService;
import com.xhjsj.service.TeacherApplyService;
import com.xhjsj.utils.AjaxResult;
import com.xhjsj.utils.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/*
* 包含用户为学生的所有控制层方法
    学生功能模块：学生用户只有输入正确的用户名和密码，才能成功登陆。以学生身份登陆后，可以申请进入开放实验室做实验，
* 也可以查询已有预约的实验室，查询申请开放实验的状态。分为两个子模块：(考虑加密-MD5)
	开放实验申请：学生根据自己的需要申请预约开放性实验，实验管理员对学生提交的申请进行审核。查询已经申请的开放实验状态，
    包括审核通过、审核退回、取消的预约、已经完成的预约实验和实验中的一些违约等。
	修改密码
* */
@RestController
@Api(tags = "学生功能相关接口（已完善）")
@RequestMapping("/stu")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private TeacherApplyService teacherApplyService;
    @Resource
    private StudentApplyService studentApplyService;


    /***********************************查询************************************/
    /**
     * 学生端查询所有可预约的实验（即就是所有教室申请实验表中状态为"审请通过(管理员)"）
     * （目前业务中要求每个学生仅能预约1个）
     * 首先需要查询该学生是否已有预约，已有预约则在页面提示仅能有一个实验预约
     * 当返回值为null：需要在页面提示：你已有实验的预约申请产生，不可再次申请！！
     */
    @GetMapping("/findAllCanApplyExp")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sNumber", value = "学号", required = true),
            @ApiImplicitParam(name = "pageNum", value = "当前页数页", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation("学生端查询所有可预约的实验")
    public AjaxResult findAllCanApplyExp(@RequestParam(value = "sNumber", required = true) String sNumber,
                                         @RequestParam(value = "pageNum", required = false,defaultValue = "1") String pageNum) {
        Integer pn=Integer.valueOf(pageNum);
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        ajaxResult.put("dataList", teacherApplyService.queryExpApplyT());
        return ajaxResult;
    }

    /**
     * 学生端查询自己预约的申请目前的状态（目前业务中要求每个学生仅能预约1个）
     * 如果没有查出，则提示：无相应的预约信息，请先预约实验
     */
    @GetMapping("/findExpStatus")
    @ApiOperation("学生端查询自己预约的申请目前的状态,如果没有查出，则提示：无相应的预约信息，请先预约实验")
    @ApiImplicitParam(name = "sNumber", value = "学号", required = true, paramType = "query", dataType = "String")
    public AjaxResult findOnesExpStatus(@RequestParam(value = "sNumber", required = true) String sNumber) {
        AjaxResult ajaxResult = AjaxResult.success();
        List<StudentApply> studentApply = studentService.findOnesApplyStutus(sNumber);
        if (studentApply.size()==0) {
            ajaxResult.put("message", "未查询出相关预约记录");
            ajaxResult.put("success", false);
            ajaxResult.put("result", "N");
            return ajaxResult;
        } else {
            ajaxResult.put("message", "查询成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
            ajaxResult.put("dataList", studentApply);
        }
        return ajaxResult;
    }


    /***********************************提交预约申请************************************/

    /**
     * 学生端提交预约申请的实验名称，提交成功：申请已提交，请等待教师和管理员审核
     *
     * @param
     * @return java.lang.String
     * @author Jaykcy
     * @date 2019/11/20 22:19
     */
    @PostMapping("/applyExp")
    @ApiOperation("学生端提交预约申请的实验名称，提交成功：申请已提交，请等待教师和管理员审核")
    public AjaxResult applyExp(@RequestBody StudentApply apply) {
        AjaxResult ajaxResult = AjaxResult.success();
        //学生提交实验申请时先判断是否已产生了一条实验申请，如果有，返回这条实验申请，没有则提交至数据库
        //先根据前台传来的教师申请单号以及学生编号查询学生是否已申请过这条实验
        String tApplyReqNum = apply.getAttriText01();
        String sNum=apply.getsNumber();
        System.out.println(apply.toString());
        List<StudentApply> bysNumberAndtApplyReqNum = studentApplyService.findBysNumberAndAttriText01(sNum, tApplyReqNum);
        StudentApply stu = new StudentApply();
        stu.setReqNumber(DateUtils.getStuApplyNum());
        stu.setsNumber(apply.getsNumber());
        stu.setsName(apply.getsName());
        stu.setsMajor(apply.getsMajor());
        stu.seteNumber(apply.geteNumber());
        stu.seteName(apply.geteName());
        stu.seteTName(apply.geteTName());
        stu.seteStarttime(apply.geteStarttime());
        stu.seteEndtime(apply.geteEndtime());
        stu.setStatus("申请提交(学生)");
        stu.setAttriText01(apply.getAttriText01());
        Integer code = studentService.insertOneExp(stu);
        if (code != null && code > 0) {
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "申请已提交，请等待教师和管理员审核");
        } else if(bysNumberAndtApplyReqNum.size()>0) {
            ajaxResult.put("success", false);
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "申请提交失败，你已申请过该实验，请勿重新申请！");
        }
        return ajaxResult;
    }

    /**
     * 学生取消实验申请
     *
     * @param
     * @return java.lang.String
     * @author Jaykcy
     * @date 2019/11/21/021  22:03
     */
    @PostMapping("/cancelApply")
    @ApiOperation("学生取消实验申请")
    @ApiImplicitParam(name = "reqNumber", value = "申请单号", defaultValue = "", required = true)
    public AjaxResult cancelApply(@RequestParam(value = "reqNumber", required = true) String reqNumber) {
        AjaxResult ajaxResult = AjaxResult.success();
        Integer code = studentService.cancelApply(reqNumber);
        if (code != 0) {
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "申请取消成功");
        } else {
            ajaxResult.put("success", false);
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "申请取消失败");
        }
        //TODO 临近实验则不允许取消，后期可对此增加（取消某一规定时间内有效预约）
        return ajaxResult;
    }


}

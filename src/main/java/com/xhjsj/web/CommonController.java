package com.xhjsj.web;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhjsj.domain.StudentApply;
import com.xhjsj.domain.SysUser;
import com.xhjsj.domain.TeacherApply;
import com.xhjsj.repository.StudentApplyRepository;
import com.xhjsj.repository.SysUserRepository;
import com.xhjsj.service.StudentApplyService;
import com.xhjsj.service.TeacherApplyService;
import com.xhjsj.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/common")
@Api(tags = "公共功能相关接口")
public class CommonController {
    @Resource
    TeacherApplyService teacherApplyService;

    @Resource
    StudentApplyService studentApplyService;

    @Resource
    SysUserRepository sysUserRepository;

    @Resource
    StudentApplyRepository studentApplyRepository;

    @GetMapping("/likeQueryExpApplyT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tNumber", value = "教师编号", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "tName", value = "教师名", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "status", value = "审批状态", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "rNumber", value = "教室编号", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "eName", value = "实验名", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "模糊查询实验申请(教师实验申请表)", httpMethod = "GET")
    public AjaxResult likeQueryExpApplyT(@RequestParam(value = "tNumber", required = false) String tNumber,
                                         @RequestParam(value = "tName", required = false) String tName,
                                         @RequestParam(value = "status", required = false) String status,
                                         @RequestParam(value = "rNumber", required = false) String rNumber,
                                         @RequestParam(value = "eName", required = false) String eName)
    {
        switch(status){
            case "3" :
                status="申请通过(管理员)";
                break; //可选
            case "4" :
                status="申请退回(管理员)";
                break; //可选
            case "1" :
                status="申请提交(教师)";
                break; //可选
            case "2" :
                status="申请取消(教师)";
                break; //可选
        }
        List<TeacherApply> list = teacherApplyService.likeQueryExpApplyT(tNumber,tName,status,rNumber,eName);
        AjaxResult ajaxResult = AjaxResult.success();
        if (list.size()!=0) {
            ajaxResult.put("dataList", list);
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "教师实验申请查询成功");
            ajaxResult.put("success", true);
        } else {
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "未查询出满足该条件的实验申请");
            ajaxResult.put("fail", false);
        }
        return ajaxResult;
    }


    @GetMapping("/getExpDetailByT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "reqNumber", value = "教师申请单号", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "模糊查询实验申请(教师实验申请表)", httpMethod = "GET")
    public AjaxResult getExpDetailByT(@RequestParam(value = "reqNumber", required = true) String reqNumber)
    {
        AjaxResult ajaxResult=new AjaxResult();
        ajaxResult.put("dataList", teacherApplyService.getExpDetailByT(reqNumber));
        ajaxResult.put("result", "Y");
        ajaxResult.put("message", "教师实验申请明细查询成功");
        ajaxResult.put("success", true);
        return ajaxResult;
    }

    @PostMapping("/changePass")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "用户名", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "oldPass", value = "原密码", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "newPass", value = "新密码", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "repeatNewPass", value = "确认密码", required = true, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "修改密码", httpMethod = "POST")
    public AjaxResult changePass(@RequestParam(value = "account", required = true) String account,
                                 @RequestParam(value = "oldPass", required = true) String oldPass,
                                 @RequestParam(value = "newPass", required = true) String newPass,
                                 @RequestParam(value = "repeatNewPass", required = true) String repeatNewPass) {
        AjaxResult ajaxResult=new AjaxResult();
        if(!newPass.equals(repeatNewPass)){
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "两次密码输入不一致，请检查后重新输入！");
            ajaxResult.put("success", false);
        }else{
            SysUser sysuser = sysUserRepository.findByAccount(account);
            String password = sysuser.getPassword();
            System.out.println("原密码："+password);
            if(password.equals(oldPass)){
                sysUserRepository.updatePasswordByAccount(account,newPass);
                //密码修改成功
                System.out.println("新密码："+newPass +"修改成功");
                ajaxResult.put("result", "Y");
                ajaxResult.put("message", "新密码："+newPass +"修改成功");
                ajaxResult.put("success", true);
            }else{
                //原密码不正确
                ajaxResult.put("result", "N");
                ajaxResult.put("message", "原密码不正确！");
                ajaxResult.put("success", false);
            }

        }
        return ajaxResult;
    }



    @GetMapping("/likeQueryExpApplyS")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "keywords", value = "关键字", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "模糊查询实验申请(學生实验申请表)", httpMethod = "GET")
    public AjaxResult likeQueryExpApplyS(@RequestParam(value = "keywords", required = false) String keywords,
                                         @RequestParam(value = "pageNum", required = true) String pageNum)
    {
        Integer pn = Integer.valueOf(pageNum);
        PageHelper.startPage(pn,2);
        AjaxResult ajaxResult=new AjaxResult();
        if(!("").equals(keywords)){
            //全表查寻，带分页
            ajaxResult.put("dataList", studentApplyRepository.findAll());
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "学生实验申请查询成功");
            ajaxResult.put("success", true);
        }
        ajaxResult.put("dataList", studentApplyService.findByKeywords(keywords,pn));
        ajaxResult.put("result", "Y");
        ajaxResult.put("message", "学生实验申请模糊查询成功");
        ajaxResult.put("success", true);
        return ajaxResult;
    }

    @GetMapping("/getAllPassedExpByTNumber")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tNumber", value = "教师编号", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "模糊查询实验申请(學生实验申请表)", httpMethod = "GET")
    public AjaxResult getAllPassedExpByTNumber(@RequestParam(value = "keywords", required = false)String tNumber){
        AjaxResult ajaxResult=new AjaxResult();
        //ajaxResult.put("dataList", teacherApplyService.;
        ajaxResult.put("result", "Y");
        ajaxResult.put("message", "学生实验申请模糊查询成功");
        ajaxResult.put("success", true);
        return null;
    }

    //公共方法：查询教师实验申请详情
    @GetMapping("/getExpByReqNumber")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tNumber", value = "教师编号", required = false, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "模糊查询实验申请(學生实验申请表)", httpMethod = "GET")
    public AjaxResult getExpByReqNumber(@RequestParam(value = "keywords", required = false)String tNumber){
        AjaxResult ajaxResult=new AjaxResult();
        //ajaxResult.put("dataList", teacherApplyService.;
        ajaxResult.put("result", "Y");
        ajaxResult.put("message", "学生实验申请模糊查询成功");
        ajaxResult.put("success", true);
        return null;
    }


    @GetMapping("/getExpInfo")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "用户名", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "role", value = "角色", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "date", value = "日期", required = true, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "根据账号，角色，日期查询实验信息", httpMethod = "GET")
    public AjaxResult getExpInfo(@RequestParam(value = "account", required = true)String account,
                                 @RequestParam(value = "role", required = true)String role,
                                 @RequestParam(value = "date", required = true)String date){
        AjaxResult ajaxResult=new AjaxResult();
        if("student".equals(role)){
            Page<StudentApply> studentApply = studentApplyService.findByAccount(account);
            String teaApplyReq = studentApply.get(0).getAttriText01();
            List<TeacherApply> teacherApply = teacherApplyService.getExpInfo(teaApplyReq,date);
            //查询指定日期下的学生实验信息
            if(teacherApply!=null){
                ajaxResult.put("dataList", teacherApply);

            }
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "学生实验申请详细查询成功");
            ajaxResult.put("success", true);
        }else{
            //查询指定日期下的教师实验信息
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "学生实验申请模糊查询成功");
            ajaxResult.put("success", true);
        }
        return ajaxResult;
    }


}

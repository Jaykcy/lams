package com.xhjsj.web;


import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.xhjsj.domain.SysUser;
import com.xhjsj.repository.SysUserRepository;
import com.xhjsj.service.SysAdminService;
import com.xhjsj.utils.AjaxResult;
import com.xhjsj.utils.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@RestController
@Api(tags = "系统管理员相关接口")
@RequestMapping("/sysAdmin")
public class SysAdminController {
    @Resource
    private SysAdminService sysAdminService;

    @Resource
    private SysUserRepository sysUserRepository;
    /*******************系统管理员**************************/
    /**
     * 系统管理员：
     * 只设有一个账号管理整个系统，
     * 系统管理员可以进行登陆、修改自己的密码，
     * 以及对实验室项目信息、学生的基本信息、
     * 教师的基本信息进行必要的增加、删除和修改，并且管理和发布系统公告。
     */
    //1.系统管理员查询所有实验信息
    @GetMapping("/selectAllExpInfo")
    @ApiOperation(value = "系统管理员查询所有实验信息", httpMethod = "GET")
    public AjaxResult selectAllExpInfo() {
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("dataList", sysAdminService.selectAllExpInfo());
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }

    //  系统管理员查询所有教室信息
    @GetMapping("/selectAllRoomInfo")
    @ApiOperation(value = "系统管理员查询所有教室信息", httpMethod = "GET")
    public AjaxResult selectAllRoomInfo() {
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("dataList", sysAdminService.selectAllRoomInfo());
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }
    //2.系统管理员增加实验室项目信息（实验信息，教室信息）
    //3.系统管理员删除实验室项目信息
    //4.系统管理员修改实验室项目信息
    //模糊查询用户表 参数：关键字，分页参数
    @GetMapping("/likeQueryUserInfo")
    @ApiOperation(value = "模糊查询用户表(关键字为空查询所有用户信息)", httpMethod = "GET")
    public AjaxResult likeQueryUserInfo(@RequestParam(value = "keywords", required = false) String keywords,
                                        @RequestParam(value = "pageNum", required = false, defaultValue = "1") String pageNum) {
        AjaxResult ajaxResult = AjaxResult.success();
        Integer pagenum = Integer.valueOf(pageNum);
        if(keywords==null){
            ajaxResult.put("dataList",sysUserRepository.findAll());
        }else{
            ajaxResult.put("dataList",sysAdminService.likeQueryUserInfo(keywords,pagenum));
        }
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }

    //系统管理员新增用户信息
    @PostMapping("/addSysUser")
    @ApiOperation(value = "系统管理员新增用户信息", httpMethod = "POST")
    public AjaxResult addSysUser(@RequestBody SysUser sysuser) {
        SysUser user = new SysUser();
        user.setAccount(sysuser.getAccount());
        user.setUserName(sysuser.getUserName());
        user.setSex(sysuser.getSex());
        user.setEmployeeNumber(sysuser.getEmployeeNumber());
        user.setMajor(sysuser.getMajor());
        user.setuClass(sysuser.getuClass());
        user.setRole(sysuser.getRole());
        user.setDeptName(sysuser.getDeptName());
        sysAdminService.addSysUser(user);
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("message", sysuser.getRole()+":"+sysuser.getUserName()+"添加成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }

    //系统管理员删除用户信息（包含单个删除和批量删除）
    @PostMapping("/delSysUser")
    @ApiOperation(value = "系统管理员删除用户信息", httpMethod = "POST")
    @ApiImplicitParam(name = "account", value = "用户名",required = true)
    public AjaxResult delSysUser(@RequestParam(value = "account", required = true) String account) {
        //如果id中不包含， 则为单个删除，否则需要遍历批量删除
        AjaxResult ajaxResult = AjaxResult.success();
        String accounts = StringUtil.getSqlInStrByStrArray(account);
        System.out.println(account);
        System.out.println(accounts);
        Integer flag = sysAdminService.delectByAccounts(accounts);
        if(flag!=0){
            ajaxResult.put("message", "用户删除成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
        }else{
            ajaxResult.put("message", "用户删除失败");
            ajaxResult.put("success", false);
            ajaxResult.put("result", "N");
        }
        return ajaxResult;
    }

    //系统管理员修改用户信息
    @PostMapping("/upSysUser")
    @ApiOperation(value = "系统管理员修改用户信息", httpMethod = "POST")
    public AjaxResult upSysUser(@RequestBody SysUser SysUser) {
        sysAdminService.upSysUser(SysUser);
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("message", SysUser.getUserName() + " 信息更新成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }

    /*******************系统管理员**************************/


    @PostMapping("/expor")
    @ApiOperation(value = "系统管理员批量导入用户信息", httpMethod = "POST")
    public AjaxResult expocel(HttpServletResponse response) throws IOException {
        AjaxResult ajaxResult = AjaxResult.success();
        ExcelWriter writer = null;
        OutputStream outputStream = response.getOutputStream();
        try {
            //添加响应头信息
            response.setHeader("Content-disposition", "attachment; filename=" + "用户信息.xls");
            response.setContentType("application/msexcel;charset=UTF-8");//设置类型
            response.setHeader("Pragma", "No-cache");//设置头
            response.setHeader("Cache-Control", "no-cache");//设置头
            response.setDateHeader("Expires", 0);//设置日期头

            //实例化 ExcelWriter
            writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLS, true);

            //实例化表单
            Sheet sheet = new Sheet(1, 0, SysUser.class);
            sheet.setSheetName("目录");

            //获取数据
            List<SysUser> sysUserList = sysUserRepository.findAll();

            //输出
            writer.write(sysUserList, sheet);
            writer.finish();
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.getOutputStream().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ajaxResult.put("message", "用户信息导出成功！");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }

}

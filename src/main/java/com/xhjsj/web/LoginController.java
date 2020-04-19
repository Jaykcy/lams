package com.xhjsj.web;


import com.xhjsj.service.LoginService;
import com.xhjsj.service.PushService;
import com.xhjsj.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "登录功能相关接口(已完善)")
public class LoginController {

    @Resource
    LoginService loginService;

    @Resource
    PushService pushService;

    /**
     * 用户登录
     * @author Jaykcy
     * @date 2020/2/24/024  15:15
     * @return com.xhjsj.utils.AjaxResult
     */
    @PostMapping(value = "/login")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pass", value = "密码", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "role", value = "角色", required = true, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "用户登陆",notes="根据用户名、密码和角色判断该用户是否存在")
    public AjaxResult selectAllTExpApply(@RequestParam(value = "name", required = true) String account,
                                         @RequestParam(value = "pass", required = true) String password,
                                         @RequestParam(value = "role", required = true) String role)
    {
        AjaxResult ajaxResult = AjaxResult.success();
        System.out.println(account+" "+password+" "+role);
        boolean flag=loginService.checkUser(account,password,role);
        System.out.println(flag);
        if(flag){
            ajaxResult.put("dataList",loginService.sysUser(account));
            ajaxResult.put("message", "登陆成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
        }else{
            ajaxResult.put("message", loginService.errorMess(account));
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }


}

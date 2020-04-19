package com.xhjsj.web;

import com.xhjsj.repository.PushRepository;
import com.xhjsj.service.PushService;
import com.xhjsj.utils.AjaxResult;
import com.xhjsj.utils.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "消息推送相关接口(已完善)")
@RequestMapping("/push")
//预留的消息推送控制层
//包括相关数据的CRUD  根据role和receiver查询出相关数据进行操作
public class PushController {
    @Resource
    PushRepository PushRepository;

    @Resource
    PushService pushService;

    @GetMapping("/findPushInfoByAccount")
    @ApiImplicitParam(name = "account", value = "用户名", defaultValue = "", required = true)
    public AjaxResult findPushInfoByAccount(@RequestParam(value = "account", required = true) String account) {
        AjaxResult ajaxResult = new AjaxResult();
        System.out.println("外部"+account);
        ajaxResult.put("dataList", pushService.findPushInfoByAccount(account));
        ajaxResult.put("result", "Y");
        ajaxResult.put("message", "消息推送内容查询成功");
        ajaxResult.put("success", true);
        return ajaxResult;
    }

    @GetMapping("/updateReaded")
    @ApiImplicitParam(name = "id", value = "推送内容ID（包含批量更新）", defaultValue = "", required = true)
    public AjaxResult updateReaded(@RequestParam(value = "id", required = true) String ids) {
        AjaxResult ajaxResult = new AjaxResult();
        String id = StringUtil.getSqlInStrByStrArray(ids);
        Integer flag = pushService.updateReaded(id);
        if(flag!=0){
            ajaxResult.put("result", "Y");
            ajaxResult.put("message", "消息推送内容读取状态更新成功");
            ajaxResult.put("success", true);
        }else{
            ajaxResult.put("result", "N");
            ajaxResult.put("message", "消息推送内容读取状态更新失败");
            ajaxResult.put("success", false);
        }
        return ajaxResult;
    }
}

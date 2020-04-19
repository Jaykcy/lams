package com.xhjsj.web;

import com.xhjsj.domain.SysConfig;
import com.xhjsj.service.SysConfigService;
import com.xhjsj.utils.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "系统配置功能相关接口(V1.0)")
public class SysConfigController {
    @Resource
    private SysConfigService sysConfigService;

    @PostMapping(value = "/saveOrUpdateSchdule")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "键", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "value", value = "值", required = true, paramType = "query", dataType = "String")
    })
    @ApiOperation(value = "配置作息时间表",notes="根据key、判断是新增还是更新")
    public AjaxResult saveOrUpdateSchduleSysConfig(@RequestParam(value = "key", required = true) String key,
                                         @RequestParam(value = "value", required = true) String value)
    {
        AjaxResult ajaxResult = AjaxResult.success();
        System.out.println(key);
        //根据key查询数据库中是否存在该key，如果存在，则进行更新操作
        List<SysConfig> selectValueByKey=sysConfigService.selectValueByKey(key);
        //不存在则进行新增操作
        if(selectValueByKey.size()==0){
            sysConfigService.insertValueAndKey(key,value);
            ajaxResult.put("dataList",sysConfigService.selectValueByKey(key));
            ajaxResult.put("message", "配置新增成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
        }else{
            //存在则进行更新操作
            sysConfigService.updateValueByKey(key, value);
            ajaxResult.put("dataList",sysConfigService.selectValueByKey(key));
            ajaxResult.put("message", "配置更新成功");
            ajaxResult.put("success", true);
            ajaxResult.put("result", "Y");
        }
        return ajaxResult;
    }
    @GetMapping(value = "/getSettingValue")
    @ApiImplicitParam(name = "key", value = "键", required = true, paramType = "query", dataType = "String")
    @ApiOperation(value = "根据key获取value",httpMethod = "GET")
    public AjaxResult GetSettingValue(@RequestParam(value = "key", required = true) String key) {
        AjaxResult ajaxResult = AjaxResult.success();
        ajaxResult.put("dataList", JSONArray.fromObject(sysConfigService.selectValueByKey(key)));
        ajaxResult.put("message", "查询成功");
        ajaxResult.put("success", true);
        ajaxResult.put("result", "Y");
        return ajaxResult;
    }

}

package com.xhjsj.web;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.xhjsj.domain.SysUser;
import com.xhjsj.repository.SysUserRepository;
import com.xhjsj.service.SysUserService;
import com.xhjsj.service.impl.JpushService;
import com.xhjsj.utils.AjaxResult;
import com.xhjsj.utils.ExcelListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Controller
public class TestController {
    @Resource
    private SysUserRepository sysUserRepository;
    @Resource
    private SysUserService sysUserService;
    @Autowired
    JpushService jpushService;

    @RequestMapping("/getSysUser")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "8") int pageSize) {
        System.out.println("============================");
        Page<SysUser> users=sysUserService.getSysUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<SysUser> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("sysUser", users);


        return "sysuser";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("sysUser",sysUserRepository.findAll());
        return "index";
    }


    //使用easyexcel,需要自定义实现AnalysisEventListener接口.
    //easyexcel会帮助我们读取数据.我们再将读取的数据封装到List中,
    //再在控制器中,获取easyexcel帮我们读取到的数据,在对数据进行类型转换和封装,最后插入到数据库即可.
    @RequestMapping("/import")
    @ResponseBody
    public AjaxResult importExcel(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("导入成功");
        InputStream inputStream = file.getInputStream();
        //实例化实现了AnalysisEventListener接口的类
        ExcelListener listener = new ExcelListener();
        //传入参数
        ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);
        //读取信息
        excelReader.read(new Sheet(1, 1, SysUser.class));

        //获取数据
        List<Object> list = listener.getDatas();

        List<SysUser> catagoryList = new ArrayList<SysUser>();
        SysUser sysuser = new SysUser();
        AjaxResult ajaxResult = AjaxResult.success();
        //转换数据类型,并插入到数据库
        for (int i = 0; i < list.size(); i++) {
            sysuser = (SysUser) list.get(i);
            try {
                sysUserService.inserSysUser(sysuser);
            } catch (Exception e) {
                ajaxResult.put("result", "N");
                ajaxResult.put("message", "用户信息导入失败，失败原因：用户表中已有相关用户，请检查后重新上传！");
                ajaxResult.put("success", false);
                return ajaxResult;
            }
        }
        ajaxResult.put("dataList", list);
        ajaxResult.put("result", "Y");
        ajaxResult.put("message", "用户信息导入成功！");
        ajaxResult.put("success", true);
        return ajaxResult;
    }

    @RequestMapping("/JPushTest")
    public String JPushTest(){
        String title ="Hello 这是一条测试推送~~~";
        String content = "测试推送内容";
        Map<String, String> extrasMap = new HashMap<String, String>();
        //此Map必须创建和实例化，但可以不添加内容
        extrasMap.put("extras","{\n" +
                "  \"attriNumber01\": 0,\n" +
                "  \"attriNumber02\": 0,\n" +
                "  \"attriText01\": \"string\",\n" +
                "  \"attriText02\": \"string\",\n" +
                "  \"createDate\": \"2020-04-11T07:10:18.318Z\",\n" +
                "  \"eDate\": \"2020-04-11T07:10:18.318Z\",\n" +
                "  \"eName\": \"string\",\n" +
                "  \"eTime\": 0,\n" +
                "  \"id\": 0,\n" +
                "  \"rMaxPer\": 0,\n" +
                "  \"rNowPer\": 0,\n" +
                "  \"rNumber\": \"string\",\n" +
                "  \"remark\": \"string\",\n" +
                "  \"reqNumber\": \"string\",\n" +
                "  \"sDate\": \"2020-04-11T07:10:18.318Z\",\n" +
                "  \"sTime\": 0,\n" +
                "  \"section\": \"string\",\n" +
                "  \"status\": \"string\",\n" +
                "  \"tName\": \"string\",\n" +
                "  \"tNumber\": \"string\",\n" +
                "  \"updateDate\": \"2020-04-11T07:10:18.318Z\"\n" +
                "}");

        //方式一：服务端控制推送内容方式
        jpushService.sendPush(title, content, extrasMap, "T20190001");
        //方式二：服务端控制推送并带返回值得方式
        //jpushService.sendPushWithCallback(title, content, extrasMap, "你业务中的别名1");
        //方式三：服务端仅推送内容，客户端自定义显示的方式
        // jpushService.sendCustomPush(title, content, extrasMap, "你业务中的别名1");
        return "pushSuccess";
    }
}

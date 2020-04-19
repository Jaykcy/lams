package com.xhjsj.service;


import com.xhjsj.domain.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LoginService {
    //登陆相关验证接口
    boolean checkUser(String account,String pass,String role);
    List<SysUser> sysUser(String account);
    String errorMess(String account);
}

package com.xhjsj.service.impl;

import com.xhjsj.domain.StudentApplyExample;
import com.xhjsj.domain.SysUser;
import com.xhjsj.domain.SysUserExample;
import com.xhjsj.mapper.StudentApplyMapper;
import com.xhjsj.mapper.SysUserMapper;
import com.xhjsj.repository.SysUserRepository;
import com.xhjsj.repository.TeacherInfoRepository;
import com.xhjsj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    SysUserRepository sysUserRepository;
    @Resource
    private SysUserMapper sysUserMapper;


    @Override
    public boolean checkUser(String account, String pass, String role) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(pass);
        criteria.andRoleEqualTo(role);
        List<SysUser> sysUser = sysUserMapper.selectByExample(sysUserExample);
        if(sysUser.size()==0){
            return false;
        }
        return true;
    }

    @Override
    public List<SysUser> sysUser(String account) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andAccountEqualTo(account);
        return sysUserMapper.selectByExample(sysUserExample);
    }

    @Override
    public String errorMess(String account) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andAccountEqualTo(account);
        List<SysUser> sysUser1 = sysUserMapper.selectByExample(sysUserExample);
        if(sysUser1.size()==0){
            return "用户不存在";
        }else{
            return "密码或身份验证错误";
        }
    }
}

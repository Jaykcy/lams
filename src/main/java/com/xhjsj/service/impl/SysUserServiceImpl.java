package com.xhjsj.service.impl;

import com.xhjsj.domain.SysUser;
import com.xhjsj.mapper.SysUserMapper;
import com.xhjsj.repository.SysUserRepository;
import com.xhjsj.service.SysUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private SysUserRepository sysUserRepository;
    @Override
    public Integer inserSysUser(SysUser sysUser) {
        return sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public Page<SysUser> getSysUserList(int pageNum, int pageSize) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<SysUser> users = sysUserRepository.findAll(pageable);
        return users;
    }
}

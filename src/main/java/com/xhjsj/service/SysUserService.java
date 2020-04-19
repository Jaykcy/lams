package com.xhjsj.service;

import com.xhjsj.domain.SysUser;
import org.springframework.data.domain.Page;

public interface SysUserService {
    Integer inserSysUser(SysUser sysUser);

    Page<SysUser> getSysUserList(int pageNum, int pageSize);
}

package com.xhjsj.repository;

import com.github.pagehelper.Page;
import com.xhjsj.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface SysUserRepository extends JpaRepository<SysUser, Integer> {
    SysUser findByAccount(String account);

    SysUser findByUserName(String userName);

    @Modifying
    @Query("update SysUser su set su.password=?2 where  su.account=?1")
    void updatePasswordByAccount(String account, String password);

    Page<SysUser> findAll();
}

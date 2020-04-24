package com.xhjsj.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhjsj.domain.*;
import com.xhjsj.mapper.*;
import com.xhjsj.repository.AdminInfoRepository;
import com.xhjsj.repository.StudentApplyRepository;
import com.xhjsj.service.SysAdminService;
import com.xhjsj.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysAdminServiceImpl implements SysAdminService {
    @Resource
    private StudentInfoMapper    studentInfoMapper;
    @Resource
    private TeacherInfoMapper    teacherInfoMapper;
    @Resource
    private ExperimentInfoMapper experimentInfoMapper;
    @Resource
    private RoomInfoMapper       roomInfoMapper;
    @Resource
    private SysUserMapper sysUserMapper;
    @Autowired
    StudentApplyRepository studentApplyRepository;
    @Autowired
    AdminInfoRepository    adminInfoRepository;

    @Override
    public List<StudentInfo> selectAllStuInfo() {
        return studentInfoMapper.selectByExample(null);
    }

    @Override
    public List<TeacherInfo> selectAllTeaInfo() {
        return teacherInfoMapper.selectByExample(null);
    }

    @Override
    public List<ExperimentInfo> selectAllExpInfo() {
        return experimentInfoMapper.selectByExample(null);
    }

    @Override
    public Page<RoomInfo> selectAllRoomInfo() {
        return roomInfoMapper.selectByExample(null);
    }

    @Override
    public List<TeacherInfo> selectTeaInfoByTname(String t_name) {
        TeacherInfoExample teacherInfoExample = new TeacherInfoExample();
        TeacherInfoExample.Criteria criteria = teacherInfoExample.createCriteria();
        criteria.andTNameEqualTo(t_name);
        return teacherInfoMapper.selectByExample(teacherInfoExample);
    }

    @Override
    public List<StudentInfo> selectStuInfoBySname(String s_name) {
        StudentInfoExample studentInfoExample = new StudentInfoExample();
        StudentInfoExample.Criteria criteria = studentInfoExample.createCriteria();
        criteria.andSNameEqualTo(s_name);
        return studentInfoMapper.selectByExample(studentInfoExample);
    }

    @Override
    public Integer addSysUser(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public Integer delectByAccounts(String accounts) {
        return sysUserMapper.delectByAccounts(StringUtil.toStrArray(accounts));
    }
    @Override
    public Integer upSysUser(SysUser sysuser) {
        return sysUserMapper.updateByPrimaryKeySelective(sysuser);
    }
    @Override
    public Page<SysUser> likeQueryUserInfo(String keywords,Integer pageNum) {
        String key="%"+keywords+"%";
        PageHelper.startPage(pageNum,10);
        return sysUserMapper.likeByKeywords(key);
    }
}

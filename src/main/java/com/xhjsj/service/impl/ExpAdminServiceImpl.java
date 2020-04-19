package com.xhjsj.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhjsj.domain.StudentApply;
import com.xhjsj.domain.StudentApplyExample;
import com.xhjsj.domain.TeacherApply;
import com.xhjsj.domain.TeacherApplyExample;
import com.xhjsj.mapper.*;
import com.xhjsj.service.ExpAdminService;
import com.xhjsj.utils.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ExpAdminServiceImpl implements ExpAdminService {

    @Resource
    private TeacherApplyMapper   teacherApplyMapper;
    @Resource
    private StudentApplyMapper   studentApplyMapper;
    @Resource
    private StudentInfoMapper    studentInfoMapper;
    @Resource
    private TeacherInfoMapper    teacherInfoMapper;
    @Resource
    private ExperimentInfoMapper experimentInfoMapper;
    @Resource
    private RoomInfoMapper       roomInfoMapper;
    @Override
    public Page<TeacherApply> selectAllTExpApply(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        teacherApplyExample.setOrderByClause("e_name ASC,t_number ASC");
        criteria.andStatusEqualTo("申请提交(教师)");
        criteria.andAttriText01EqualTo("0");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        criteria.andEDateGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return teacherApplyMapper.selectByExample(teacherApplyExample);
    }

    @Override
    public Page<StudentApply> selectAllSExpApply(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andStatusEqualTo("申请通过(教师)");
        studentApplyExample.setOrderByClause("'e_name' ASC,s_number ASC");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        criteria.andEStarttimeGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return studentApplyMapper.selectByExample(studentApplyExample);
    }

    @Override
    public List<TeacherApply> selectAllSExpApplyBytName(String tName) {
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        criteria.andTNameEqualTo(tName);
        criteria.andStatusEqualTo("申请提交(教师)");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        criteria.andEDateGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return teacherApplyMapper.selectByExample(teacherApplyExample);
    }

    @Override
    public List<StudentApply> selectAllSExpApplyBysName(String sName) {
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andSNameEqualTo(sName);
        criteria.andStatusEqualTo("申请通过(教师)");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        criteria.andEStarttimeGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return studentApplyMapper.selectByExample(studentApplyExample);
    }

    @Override
    public Integer updateTeaStatus(String r_num, String status) {
        TeacherApply teaApply = new TeacherApply();
        System.out.println(r_num + "  and " + status);
        teaApply.setStatus(status);
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        criteria.andReqNumberEqualTo(r_num);
        return teacherApplyMapper.updateByExampleSelective(teaApply, teacherApplyExample);
    }

    @Override
    public Integer updateTeasStatus(String r_num, String status) {
        return teacherApplyMapper.updateTeasStatus(r_num,status);
    }

    /***
     *
     * @author Jaykcy
     * @date 2019/12/12/012  22:30
     * @param
     * @return java.lang.Integer
     */
    @Override
    public Integer updateSeaStatus(String r_num, String status) {
        StudentApply studentApply = new StudentApply();
        studentApply.setStatus(status);
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andReqNumberEqualTo(r_num);
        return studentApplyMapper.updateByExampleSelective(studentApply, studentApplyExample);
    }
}

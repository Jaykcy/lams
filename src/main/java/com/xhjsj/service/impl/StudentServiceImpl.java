package com.xhjsj.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhjsj.domain.*;
import com.xhjsj.mapper.StudentApplyMapper;
import com.xhjsj.mapper.TeacherApplyMapper;
import com.xhjsj.repository.StudentInfoRepository;
import com.xhjsj.service.StudentService;
import com.xhjsj.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private TeacherApplyMapper teacherApplyMapper;
    @Resource
    private StudentApplyMapper studentApplyMapper;

    @Override
    public List<TeacherApply> finExpByRnum(String r_num) {
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        criteria.andRNumberEqualTo(r_num);
        return teacherApplyMapper.selectByExample(teacherApplyExample);
    }

    @Override
    public Integer insertOneExp(StudentApply stuapply) {
        return studentApplyMapper.insertSelective(stuapply);
    }

    @Override
    public Integer cancelApply(String r_num) {
        StudentApply stu = new StudentApply();
        stu.setStatus("申请取消(学生)");
        stu.setAttriNumber01(7);
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andReqNumberEqualTo(r_num);
        return studentApplyMapper.updateByExampleSelective(stu, studentApplyExample);
    }

    @Override
    public Page<StudentApply> findOnesApplyExp(String s_num) {
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andSNumberEqualTo(s_num);
        criteria.andStatusNotEqualTo("申请取消(学生)");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        criteria.andEStarttimeGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return studentApplyMapper.selectByExample(studentApplyExample);
    }

    @Override
    public Page<StudentApply> findOnesApplyStutus(String s_num) {
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andSNumberEqualTo(s_num);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        criteria.andEStarttimeGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return studentApplyMapper.selectByExample(studentApplyExample);
    }

    @Override
    public Page<StudentApply> findOnesApplyExp(String s_num, String status) {
        String s="";
        switch(status){
            case "5" :
                s="申请提交(学生)";
                break; //可选
            case "6" :
                s="申请取消(学生)";
                break; //可选
            case "7" :
                s="申请通过(教师)";
                break; //可选
            case "8" :
                s="申请退回(教师)";
                break; //可选
            case "9" :
                s="申请通过(管理员)";
                break; //可选
            case "10" :
                s="申请退回(管理员)";
                break; //可选
        }
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        if("0".equals(status)){
            criteria.andSNumberEqualTo(s_num);
        }else{
            criteria.andSNumberEqualTo(s_num);
            criteria.andStatusEqualTo(s);
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        criteria.andEStarttimeGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return studentApplyMapper.selectByExample(studentApplyExample);
    }

    @Override
    public Page<TeacherApply> findAllCanApplyExp(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        criteria.andStatusEqualTo("申请通过(管理员)");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        criteria.andEDateGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return teacherApplyMapper.selectByExample(teacherApplyExample);
    }

    @Autowired
    StudentInfoRepository studentInfoRepository;

    @Override
    public StudentInfo findBySName(String name) {
        return studentInfoRepository.findBySName(name);
    }

    @Override
    public StudentInfo findBySNumber(String number) {
        return studentInfoRepository.findBySNumber(number);
    }

    @Override
    public StudentInfo save(StudentInfo student) {
        return studentInfoRepository.save(student);
    }
}

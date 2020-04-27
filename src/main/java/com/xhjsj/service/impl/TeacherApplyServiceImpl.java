package com.xhjsj.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhjsj.domain.*;
import com.xhjsj.mapper.RoomInfoMapper;
import com.xhjsj.mapper.StudentApplyMapper;
import com.xhjsj.mapper.TeacherApplyMapper;
import com.xhjsj.repository.StudentApplyRepository;
import com.xhjsj.repository.TeacherApplyRepository;
import com.xhjsj.service.TeacherApplyService;
import com.xhjsj.utils.DateUtils;
import com.xhjsj.utils.RoomMax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class TeacherApplyServiceImpl implements TeacherApplyService {
    @Autowired
    TeacherApplyRepository teacherApplyRepository;

    @Autowired
    StudentApplyRepository studentApplyRepository;

    @Resource
    TeacherApplyMapper teacherApplyMapper;

    @Resource
    RoomInfoMapper roomInfoMapper;

    @Resource
    private StudentApplyMapper studentApplyMapper;

    @Override
    public List<TeacherApply> findAllByEDate(Date time) {
        return teacherApplyRepository.findAllByEDate(time);
    }

    @Override
    public Page<TeacherApply> findAllByTNumber(String s,Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        return teacherApplyRepository.findAllByTNumber(s);
    }

    @Override
    public Page<TeacherApply> likeQueryExpApplyByTeaNum(String tNum, String reqNumber, String status, String rNum,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        criteria.andTNumberEqualTo(tNum);
        criteria.andAttriText01EqualTo("0");
        if(reqNumber!=null){
            criteria.andReqNumberLike(reqNumber);
        }
        if(status!=null){
            criteria.andStatusLike(status);
        }
        if(rNum!=null){
            criteria.andRNumberLike(rNum);
        }
        return teacherApplyMapper.selectByExample(teacherApplyExample);
    }

    @Override
    public List<TeacherApply> likeQueryExpApplyT(String tNum, String tName, String status, String rNum, String eName) {
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        if(tNum!=null){
            criteria.andTNumberLike(tNum);
        }
        if(tName!=null){
            criteria.andTNameLike(tName);
        }
        if(status!=null){
            criteria.andStatusLike(status);
        }
        if(rNum!=null){
            criteria.andRNumberLike(rNum);
        }
        if(eName!=null){
            criteria.andENameLike(eName);
        }
        return teacherApplyMapper.selectByExample(teacherApplyExample);
    }

    @Override
    public Page<TeacherApply> likeQueryExpApplyByTeaNumAndKeywords(String tNum, String keywords, Integer pageNum, Integer pageSize) {
        String kw="";
        if(keywords!=null){
            kw="%"+keywords+"%";
        }else{
            kw=null;
        }
        PageHelper.startPage(pageNum, pageSize);
        return teacherApplyMapper.likeQueryExpApplyByTeaNumAndKeywords(tNum,kw);
    }

    @Override
    public Integer updateSeaStatus(String r_num, String status) {
        StudentApply studentApply = new StudentApply();
        studentApply.setStatus(status);
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andReqNumberEqualTo(r_num);
        StudentApply s = studentApplyRepository.findAllByReqNumber(r_num);
        String t_name=s.geteTName();
        String e_name=s.geteName();
        //更新该实验的已申请人数
        TeacherApply t = new TeacherApply();
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria teacriteria = teacherApplyExample.createCriteria();
        teacriteria.andTNameEqualTo(t_name);
        teacriteria.andENameEqualTo(e_name);
        List<TeacherApply> teacherApply = teacherApplyMapper.selectByExample(teacherApplyExample);
        Integer beforePer = teacherApply.get(0).getrNowPer();
        Integer nowPer = 0;
        if("申请通过(教师)".equals(status)){
            nowPer = beforePer + 1;
        }else{
            nowPer = beforePer;
        }
        Integer maxPer=teacherApply.get(0).getrMaxPer();
        System.out.println(nowPer);
        System.out.println(maxPer);
        System.out.println(RoomMax.judgeCanApply(nowPer,maxPer));
        if(!RoomMax.judgeCanApply(nowPer,maxPer)){
            StudentApply stuApply = new StudentApply();
            stuApply.setStatus("申请退回(教师)");
            stuApply.setAttriText01("退回原因：该教室已达到最大申请数，请联系相关教师！");
            studentApplyMapper.updateByExampleSelective(stuApply,studentApplyExample);
            return 0;
        }else{
            t.setrNowPer(nowPer);
            teacherApplyMapper.updateByExampleSelective(t, teacherApplyExample);
        }
        return studentApplyMapper.updateByExampleSelective(studentApply, studentApplyExample);
    }
    @Override
    public List<TeacherApply> getExpDetailByT(String reqNumber) {
        return teacherApplyMapper.getExpDetailByT(reqNumber);
    }

    @Override
    public List<TeacherApply> findExpDetailByT(String reqNumber) {
        return teacherApplyMapper.findExpDetailByT(reqNumber);
    }

    @Override
    public List<TeacherApply> queryExpApplyT() {
        TeacherApplyExample teacherApplyExample = new TeacherApplyExample();
        TeacherApplyExample.Criteria criteria = teacherApplyExample.createCriteria();
        criteria.andStatusEqualTo("申请通过(管理员)");
        criteria.andAttriText01EqualTo("0");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        criteria.andEDateGreaterThan((DateUtils.stringToDate(df.format(new Date()))));
        return teacherApplyMapper.selectByExample(teacherApplyExample);
}

    @Override
    public List<TeacherApply> getExpInfo(String reqNumber, String date) {
        return teacherApplyMapper.getExpInfo(reqNumber,date);
    }

    @Override
    public List<TeacherApply> findByAccount(String account, String date) {
        return teacherApplyMapper.findByAccount(account, date);
    }

    @Override
    public TeacherApply save(TeacherApply apply) {
        TeacherApply save = teacherApplyRepository.save(apply);
        return save;
    }

    @Override
    public TeacherApply findAllByReqNumber(String reqNumber) {
        return teacherApplyRepository.findAllByReqNumber(reqNumber).get(0);
    }

    @Override
    public List<TeacherApply> timeSelect(Date startTime,Date endTime) {
        return teacherApplyMapper.timeSelect(startTime,endTime);
    }

    @Override
    public List<TeacherApply> timeSelect2(Date sDate, Date eDate, Integer sTime, Integer eTime) {
        return teacherApplyMapper.timeSelect2(sDate,eDate,sTime,eTime);
    }

    @Override
    public List<RoomInfo> SelectAllByNotsampleNum(List<String> item) {
        return roomInfoMapper.SelectAllByNotsampleNum(item);
    }
}

package com.xhjsj.service;

import com.github.pagehelper.Page;
import com.xhjsj.domain.RoomInfo;
import com.xhjsj.domain.TeacherApply;

import java.util.Date;
import java.util.List;

public interface TeacherApplyService {
    List<TeacherApply> findAllByEDate(Date time);

    Page<TeacherApply> findAllByTNumber(String s,Integer pageNum);

    TeacherApply save(TeacherApply apply);

    TeacherApply findAllByReqNumber(String reqNumber);

    List<TeacherApply> timeSelect(Date startTime,Date endTime);

    List<TeacherApply> timeSelect2(Date sDate,Date eDate,Integer sTime,Integer eTime);

    List<RoomInfo> SelectAllByNotsampleNum(List<String> item);

    List<TeacherApply> likeQueryExpApplyByTeaNum(String tNum,String reqNumber,String status,String rNum,Integer pageNum, Integer pageSize);
    List<TeacherApply> likeQueryExpApplyT(String tNum,String tName,String status,String rNum,String eName);
    Page<TeacherApply> likeQueryExpApplyByTeaNumAndKeywords(String tNum, String keywords, Integer pageNum, Integer pageSize);
    Integer updateSeaStatus(String r_num, String status);

    List<TeacherApply> getExpDetailByT(String reqNumber);

    List<TeacherApply> findExpDetailByT(String reqNumber);

    List<TeacherApply> queryExpApplyT();

    List<TeacherApply> getExpInfo(String reqNumber,String date);



}

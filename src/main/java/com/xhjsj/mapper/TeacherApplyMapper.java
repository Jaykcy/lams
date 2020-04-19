package com.xhjsj.mapper;

import com.github.pagehelper.Page;
import com.xhjsj.domain.TeacherApply;
import com.xhjsj.domain.TeacherApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TeacherApplyMapper {
    int countByExample(TeacherApplyExample example);

    int deleteByExample(TeacherApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherApply record);

    int insertSelective(TeacherApply record);

    Page<TeacherApply> selectByExample(TeacherApplyExample example);

    TeacherApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherApply record, @Param("example") TeacherApplyExample example);

    int updateByExample(@Param("record") TeacherApply record, @Param("example") TeacherApplyExample example);

    int updateByPrimaryKeySelective(TeacherApply record);

    int updateByPrimaryKey(TeacherApply record);

    List<TeacherApply> timeSelect(Date startTime, Date endTime);
    List<TeacherApply> timeSelect2(Date sDate, Date eDate, Integer sTime, Integer eTime);
    Page<TeacherApply> likeQueryExpApplyByTeaNumAndKeywords(String tNum, String keywords);
    List<TeacherApply> getExpDetailByT(String reqNumber);

    List<TeacherApply> findExpDetailByT(String reqNumber);

    int updateTeasStatus(String reqNumber, String status);

}
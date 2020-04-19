package com.xhjsj.mapper;

import com.github.pagehelper.Page;
import com.xhjsj.domain.StudentApply;
import com.xhjsj.domain.StudentApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentApplyMapper {
    int countByExample(StudentApplyExample example);

    int deleteByExample(StudentApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentApply record);

    int insertSelective(StudentApply record);

    Page<StudentApply> selectByExample(StudentApplyExample example);

    StudentApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentApply record, @Param("example") StudentApplyExample example);

    int updateByExample(@Param("record") StudentApply record, @Param("example") StudentApplyExample example);

    int updateByPrimaryKeySelective(StudentApply record);

    int updateByPrimaryKey(StudentApply record);

    Page<StudentApply> likeByKeywords(String keywords);
}
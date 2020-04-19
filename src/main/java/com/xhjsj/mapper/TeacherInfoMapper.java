package com.xhjsj.mapper;

import com.xhjsj.domain.TeacherInfo;
import com.xhjsj.domain.TeacherInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int countByExample(TeacherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int deleteByExample(TeacherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int deleteByPrimaryKey(Integer tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int insert(TeacherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int insertSelective(TeacherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    List<TeacherInfo> selectByExample(TeacherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    TeacherInfo selectByPrimaryKey(Integer tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByExample(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByPrimaryKeySelective(TeacherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByPrimaryKey(TeacherInfo record);
}
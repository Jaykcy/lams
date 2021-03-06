package com.xhjsj.mapper;

import com.xhjsj.domain.StudentInfo;
import com.xhjsj.domain.StudentInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int countByExample(StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int deleteByExample(StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int deleteByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int insert(StudentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int insertSelective(StudentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    List<StudentInfo> selectByExample(StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    StudentInfo selectByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByPrimaryKeySelective(StudentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByPrimaryKey(StudentInfo record);
}
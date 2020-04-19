package com.xhjsj.service;

import com.github.pagehelper.Page;
import com.xhjsj.domain.StudentApply;
import com.xhjsj.domain.StudentInfo;
import com.xhjsj.domain.TeacherApply;

import java.util.List;

public interface StudentService {
    /**
     * 学生端查询所有可预约的实验信息
     */
    Page<TeacherApply> findAllCanApplyExp(Integer pageNum);

    /**
     * 查询自已已提交的预约申请信息
     */
    Page<StudentApply> findOnesApplyExp(String s_num);
    Page<StudentApply> findOnesApplyExp(String s_num,String status);

    /**
     * @param [r_num]
     * @return TeacherApply
     * @author Jaykcy
     * @date 2019/11/21/021  21:21
     */
    List<TeacherApply> finExpByRnum(String r_num);

    /**
     * @param [stuapply]
     * @return java.lang.Integer
     * @author Jaykcy
     * @date 2019/11/21/021  22:04
     */
    Integer insertOneExp(StudentApply stuapply);

    Integer cancelApply(String r_num);

    StudentInfo findBySName(String name);

    StudentInfo findBySNumber(String number);

    StudentInfo save(StudentInfo student);
    Page<StudentApply> findOnesApplyStutus(String s_num);
}

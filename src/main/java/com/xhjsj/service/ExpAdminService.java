package com.xhjsj.service;

import com.github.pagehelper.Page;
import com.xhjsj.domain.StudentApply;
import com.xhjsj.domain.TeacherApply;

import java.util.List;

public interface ExpAdminService {
    /**
     * 管理员查询所有教师实验申请单
     *
     * @param []
     * @return java.util.List<TeacherApply>
     * @author Jaykcy
     * @date 2019/11/21/021  22:47
     */
    Page<TeacherApply> selectAllTExpApply(Integer pageNum);

    /**
     * 查询所有状态的"申请通过"(教师)的学生申请单
     *
     * @param []
     * @return java.util.List<StudentApply>
     * @author Jaykcy
     * @date 2019/11/23/023  16:09
     */
    Page<StudentApply> selectAllSExpApply(Integer pageNum);

    List<TeacherApply> selectAllSExpApplyBytName(String tName);

    List<StudentApply> selectAllSExpApplyBysName(String sName);

    /**
     * 实验管理员更新教师申请单状态
     *
     * @param [r_num]
     * @return java.lang.Integer
     * @author Jaykcy
     * @date 2019/11/21/021  23:05
     */
    Integer updateTeaStatus(String r_num, String status);

    Integer updateTeasStatus(String r_num, String status);

    /**
     * 实验管理员更新学生申请单状态
     *
     * @param [r_num, status]
     * @return java.lang.Integer
     * @author Jaykcy
     * @date 2019/11/23/023  16:21
     */
    Integer updateSeaStatus(String r_num, String status);
}

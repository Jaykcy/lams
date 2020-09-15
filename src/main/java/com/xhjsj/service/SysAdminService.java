package com.xhjsj.service;

import com.github.pagehelper.Page;
import com.xhjsj.domain.*;

import java.util.List;

public interface SysAdminService {


    /**
     * 系统管理员查询所有学生信息
     *
     * @param []
     * @return java.util.List<StudentInfo>
     * @author Jaykcy
     * @date 2019/11/25/025  21:59
     */
    List<StudentInfo> selectAllStuInfo();

    /**
     * 系统管理员查询所有教师信息
     *
     * @param []
     * @return java.util.List<TeacherInfo>
     * @author Jaykcy
     * @date 2019/11/25/025  22:11
     */
    List<TeacherInfo> selectAllTeaInfo();

    /**
     * 系统管理员查询所有实验课程信息
     *
     * @param []
     * @return java.util.List<ExperimentInfo>
     * @author Jaykcy
     * @date 2019/11/25/025  22:13
     */
    List<ExperimentInfo> selectAllExpInfo();

    Page<RoomInfo> selectAllRoomInfo();

    Integer upRoomInfo(Integer id,RoomInfo roomInfo);

    Integer addRoomInfo(RoomInfo roomInfo);

    Integer delRoomInfo(Integer id);

    List<TeacherInfo> selectTeaInfoByTname(String t_name);

    List<StudentInfo> selectStuInfoBySname(String s_name);


    /***
     *系统管理员对学生信息进行维护（增删改）
     * @author Jaykcy
     * @date 2019/12/10/010  21:48
     * @param
     * @return
     */

    Integer addSysUser(SysUser sysuser);

    Integer delectByAccounts(String accounts);

    Integer upSysUser(SysUser sysUser);


    Page<SysUser> likeQueryUserInfo(String keywords,Integer pageNum);
}

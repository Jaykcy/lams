package com.xhjsj.mapper;

import com.xhjsj.domain.SysNotice;
import com.xhjsj.domain.SysNoticeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int countByExample(SysNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int deleteByExample(SysNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int insert(SysNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int insertSelective(SysNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    List<SysNotice> selectByExample(SysNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    SysNotice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysNotice record, @Param("example") SysNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int updateByExample(@Param("record") SysNotice record, @Param("example") SysNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int updateByPrimaryKeySelective(SysNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    int updateByPrimaryKey(SysNotice record);
}
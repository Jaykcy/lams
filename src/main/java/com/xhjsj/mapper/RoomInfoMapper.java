package com.xhjsj.mapper;

import com.github.pagehelper.Page;
import com.xhjsj.domain.RoomInfo;
import com.xhjsj.domain.RoomInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int countByExample(RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int deleteByExample(RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int insert(RoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int insertSelective(RoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    Page<RoomInfo> selectByExample(RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") RoomInfo record, @Param("example") RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 17 15:05:10 CST 2019
     */
    int updateByExample(@Param("record") RoomInfo record, @Param("example") RoomInfoExample example);

    List<RoomInfo> SelectAllByNotsampleNum(List<String> item);
}
package com.xhjsj.mapper;

import com.xhjsj.domain.Push;
import com.xhjsj.domain.PushExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PushMapper {
    int countByExample(PushExample example);

    int deleteByExample(PushExample example);

    int insert(Push record);

    int insertSelective(Push record);

    List<Push> selectByExample(PushExample example);

    int updateByExampleSelective(@Param("record") Push record, @Param("example") PushExample example);

    int updateByExample(@Param("record") Push record, @Param("example") PushExample example);

    Integer updateById(String ids);
}
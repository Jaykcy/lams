package com.xhjsj.service;

import com.xhjsj.domain.SysConfig;

import java.util.List;

public interface SysConfigService {
    /**
     * 根据key值查询是否存在
     * @author Jaykcy
     * @date 2020/3/3/003  20:54
     * @param key,value
     * @return
     */
    public List<SysConfig> selectValueByKey(String key);
    public Integer updateValueByKey(String key, String value);
    public Integer insertValueAndKey(String key, String value);
}

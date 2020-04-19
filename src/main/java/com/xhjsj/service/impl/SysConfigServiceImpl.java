package com.xhjsj.service.impl;

import com.xhjsj.domain.SysConfig;
import com.xhjsj.domain.SysConfigExample;
import com.xhjsj.domain.SysUserExample;
import com.xhjsj.mapper.SysConfigMapper;
import com.xhjsj.service.SysConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysConfigServiceImpl implements SysConfigService {

    @Resource
    private SysConfigMapper sysConfigMapper;
    @Override
    public List<SysConfig> selectValueByKey(String key) {
        SysConfigExample sysConfigExample = new SysConfigExample();
        SysConfigExample.Criteria criteria = sysConfigExample.createCriteria();
        criteria.andConfigKeyEqualTo(key);
        return sysConfigMapper.selectByExample(sysConfigExample);
    }

    @Override
    public Integer updateValueByKey(String key, String value) {
        SysConfig sysConfig=new SysConfig();
        sysConfig.setConfigValue(value);
        SysConfigExample sysConfigExample = new SysConfigExample();
        SysConfigExample.Criteria criteria = sysConfigExample.createCriteria();
        criteria.andConfigKeyEqualTo(key);
        return sysConfigMapper.updateByExampleSelective(sysConfig,sysConfigExample);
    }

    @Override
    public Integer insertValueAndKey(String key, String value) {
        SysConfig sysConfig=new SysConfig();
        sysConfig.setConfigKey(key);
        sysConfig.setConfigValue(value);
        return sysConfigMapper.insert(sysConfig);
    }
}

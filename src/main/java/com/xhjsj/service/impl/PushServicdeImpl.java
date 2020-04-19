package com.xhjsj.service.impl;


import com.xhjsj.domain.Push;
import com.xhjsj.domain.PushExample;
import com.xhjsj.mapper.PushMapper;
import com.xhjsj.service.PushService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PushServicdeImpl implements PushService {
    @Resource
    private PushMapper pushMapper;

    @Override
    public List<Push> findPushInfoByAccount(String Account) {
        PushExample pushExample = new PushExample();
        PushExample.Criteria criteria = pushExample.createCriteria();
        criteria.andReceiverEqualTo(Account);
        System.out.println("内部"+Account);
        return pushMapper.selectByExample(pushExample);
    }

    @Override
    public Integer updateReaded(String id) {
        return pushMapper.updateById(id);
    }
}

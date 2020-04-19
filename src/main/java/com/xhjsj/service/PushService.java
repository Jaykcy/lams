package com.xhjsj.service;

import com.xhjsj.domain.Push;

import java.util.List;

public interface PushService {

    List<Push> findPushInfoByAccount(String Account);

    Integer updateReaded(String id);
}

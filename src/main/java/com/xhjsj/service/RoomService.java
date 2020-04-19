package com.xhjsj.service;

import com.xhjsj.domain.RoomInfo;

import java.util.List;

public interface RoomService {
    List<RoomInfo> findAll();

    RoomInfo findByRNumber(String rnumber);
}

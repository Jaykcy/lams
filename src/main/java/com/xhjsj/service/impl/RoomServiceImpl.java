package com.xhjsj.service.impl;

import com.xhjsj.domain.RoomInfo;
import com.xhjsj.repository.RoomInfoRepository;
import com.xhjsj.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomInfoRepository roomInfoRepository;

    @Override
    public List<RoomInfo> findAll() {
        return roomInfoRepository.findAll();
    }

    @Override
    public RoomInfo findByRNumber(String rnumber) {
        return roomInfoRepository.findAllByRNumber(rnumber).get(0);
    }
}

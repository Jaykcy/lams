package com.xhjsj.repository;

import com.xhjsj.domain.RoomInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomInfoRepository extends JpaRepository<RoomInfo, Integer> {

    List<RoomInfo> findAllByRNumber(String rnumber);
}

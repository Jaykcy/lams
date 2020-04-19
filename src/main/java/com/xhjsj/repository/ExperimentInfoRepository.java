package com.xhjsj.repository;

import com.xhjsj.domain.ExperimentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperimentInfoRepository extends JpaRepository<ExperimentInfo, Integer> {
    List<ExperimentInfo> findAllByEName(String s);
}

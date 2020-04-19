package com.xhjsj.service;

import com.xhjsj.domain.ExperimentInfo;

import java.util.List;

public interface ExperimentInfoService {
    List<ExperimentInfo> findAll();

    ExperimentInfo findByEName(String s);
}

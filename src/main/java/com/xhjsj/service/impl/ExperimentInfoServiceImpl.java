package com.xhjsj.service.impl;

import com.xhjsj.domain.ExperimentInfo;
import com.xhjsj.repository.ExperimentInfoRepository;
import com.xhjsj.service.ExperimentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperimentInfoServiceImpl implements ExperimentInfoService {
    @Autowired
    ExperimentInfoRepository experimentInfoRepository;

    @Override
    public List<ExperimentInfo> findAll() {
        return experimentInfoRepository.findAll();
    }

    @Override
    public ExperimentInfo findByEName(String s) {
        return experimentInfoRepository.findAllByEName(s).get(0);
    }
}

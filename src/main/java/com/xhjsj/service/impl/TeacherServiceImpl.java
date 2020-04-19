package com.xhjsj.service.impl;

import com.xhjsj.domain.TeacherInfo;
import com.xhjsj.mapper.TeacherApplyMapper;
import com.xhjsj.repository.TeacherInfoRepository;
import com.xhjsj.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherInfoRepository teacherInfoRepository;

    @Override
    public TeacherInfo findByTName(String name) {
        return teacherInfoRepository.findByTName(name);
    }

    @Override
    public TeacherInfo findByTNumber(String number) {
        return teacherInfoRepository.findByTNumber(number);
    }

    @Override
    public TeacherInfo save(TeacherInfo teacher) {
        return teacherInfoRepository.save(teacher);
    }
}

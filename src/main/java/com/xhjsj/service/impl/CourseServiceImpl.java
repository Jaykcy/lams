package com.xhjsj.service.impl;

import com.xhjsj.domain.CourseInfo;
import com.xhjsj.repository.CourseInfoRepository;
import com.xhjsj.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseInfoRepository courseInfoRepository;

    @Override
    public List<CourseInfo> findAllByCDate(Date date) {
        return courseInfoRepository.findAllByCDate(date);
    }
}

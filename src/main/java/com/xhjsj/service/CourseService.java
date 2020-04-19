package com.xhjsj.service;

import com.xhjsj.domain.CourseInfo;

import java.util.Date;
import java.util.List;

public interface CourseService {
    List<CourseInfo> findAllByCDate(Date date);
}

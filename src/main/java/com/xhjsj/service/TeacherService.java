package com.xhjsj.service;

import com.xhjsj.domain.TeacherInfo;

public interface TeacherService {
    TeacherInfo findByTName(String name);

    TeacherInfo findByTNumber(String number);

    TeacherInfo save(TeacherInfo teacher);
}

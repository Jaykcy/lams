package com.xhjsj.repository;

import com.xhjsj.domain.TeacherInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherInfoRepository extends JpaRepository<TeacherInfo, Integer> {
    TeacherInfo findByTName(String name);

    TeacherInfo findByTNumber(String number);
}

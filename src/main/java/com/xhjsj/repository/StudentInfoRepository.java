package com.xhjsj.repository;

import com.xhjsj.domain.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfoRepository extends JpaRepository<StudentInfo, Integer> {
    StudentInfo findBySName(String name);

    StudentInfo findBySNumber(String number);
}

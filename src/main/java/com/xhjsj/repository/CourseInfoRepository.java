package com.xhjsj.repository;

import com.xhjsj.domain.CourseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CourseInfoRepository extends JpaRepository<CourseInfo, Integer> {
    List<CourseInfo> findAllByCDate(Date date);
}

package com.xhjsj.repository;

import com.github.pagehelper.Page;
import com.xhjsj.domain.TeacherApply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TeacherApplyRepository extends JpaRepository<TeacherApply, Integer> {
    List<TeacherApply> findAllByEDate(Date time);

    Page<TeacherApply> findAllByTNumber(String s);

    List<TeacherApply> findAllByReqNumber(String reqNumber);
}

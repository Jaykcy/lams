package com.xhjsj.repository;

import com.xhjsj.domain.StudentApply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentApplyRepository extends JpaRepository<StudentApply, Integer> {
    List<StudentApply> findAllByENumberAndStatus(String remark, String status);

    StudentApply findAllByReqNumber(String reqNumber);

    List<StudentApply> findByRemarkAndStatusAndAttriText01(String remark, String s, String s1);

    List<StudentApply> findAll();

    List<StudentApply> findBysNumberAndAttriText01(String sNumber, String tApplyReqNum);
}

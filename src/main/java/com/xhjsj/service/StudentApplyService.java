package com.xhjsj.service;

import com.github.pagehelper.Page;
import com.xhjsj.domain.StudentApply;

import java.util.List;

public interface StudentApplyService {
    List<StudentApply> findAllByENumber(String remark, String status);

    List<StudentApply> findAllByENumberAndStatus(String remark);

    StudentApply findAllByReqNumber(String reqNumber);

    List<StudentApply> findAllByENumberAndStatus(String s, String remark);

    Page<StudentApply> findByENameAndStatusAndETName(String eName, String s, String eTName);

    Page<StudentApply> findByKeywords(String keywords, Integer pageNum);

    List<StudentApply> findBysNumberAndAttriText01(String sNumber,String tApplyReqNum);
}

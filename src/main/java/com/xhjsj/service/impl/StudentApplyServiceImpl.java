package com.xhjsj.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhjsj.domain.StudentApply;
import com.xhjsj.domain.StudentApplyExample;
import com.xhjsj.mapper.StudentApplyMapper;
import com.xhjsj.repository.StudentApplyRepository;
import com.xhjsj.service.StudentApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentApplyServiceImpl implements StudentApplyService {
    @Autowired
    StudentApplyRepository studentApplyRepository;
    @Resource
    StudentApplyMapper studentApplyMapper;

    @Override
    public List<StudentApply> findAllByENumber(String remark, String status) {
        return studentApplyRepository.findAllByENumberAndStatus(remark, status);
    }

    @Override
    public List<StudentApply> findAllByENumberAndStatus(String remark) {
        return studentApplyRepository.findAllByENumberAndStatus(remark, "申请提交(学生)");
    }

    @Override
    public StudentApply findAllByReqNumber(String reqNumber) {
        return studentApplyRepository.findAllByReqNumber(reqNumber);
    }

    @Override
    public List<StudentApply> findAllByENumberAndStatus(String s, String remark) {
        return studentApplyRepository.findByRemarkAndStatusAndAttriText01(remark, "申请提交(学生)", s);
    }

    @Override
    public Page<StudentApply> findByENameAndStatusAndETName(String eName, String s, String eTName) {
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        studentApplyExample.setOrderByClause("'e_name ASC,s_number ASC'");
        //criteria.andENameEqualTo(eName);
        criteria.andETNameEqualTo(eTName);
        criteria.andStatusEqualTo(s);
        return studentApplyMapper.selectByExample(studentApplyExample);
    }

    @Override
    public Page<StudentApply> findByKeywords(String keywords, Integer pageNum) {
        String kw="";
        if(keywords!=null){
            kw="%"+keywords+"%";
        }else{
            kw=null;
        }
        PageHelper.startPage(pageNum,5);
        return studentApplyMapper.likeByKeywords(kw);
    }

    @Override
    public List<StudentApply> findBysNumberAndAttriText01(String sNumber, String tApplyReqNum) {
        StudentApplyExample studentApplyExample = new StudentApplyExample();
        StudentApplyExample.Criteria criteria = studentApplyExample.createCriteria();
        criteria.andSNumberEqualTo(sNumber);
        criteria.andAttriText01EqualTo(tApplyReqNum);
        criteria.andStatusNotLike("取消");
        return studentApplyMapper.selectByExample(studentApplyExample);
    }
}

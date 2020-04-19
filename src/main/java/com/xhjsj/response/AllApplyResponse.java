package com.xhjsj.response;

import com.xhjsj.domain.TeacherApply;

import java.util.List;

public class AllApplyResponse {
    List<TeacherApply> list;
    String             flag;

    public List<TeacherApply> getList() {
        return list;
    }

    public void setList(List<TeacherApply> list) {
        this.list = list;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}

package com.xhjsj.request;

import com.xhjsj.domain.AdminInfo;
import com.xhjsj.domain.StudentInfo;
import com.xhjsj.domain.TeacherInfo;

public class AllUser {
    StudentInfo student;
    TeacherInfo teacher;
    AdminInfo   admin;

    public StudentInfo getStudent() {
        return student;
    }

    public void setStudent(StudentInfo student) {
        this.student = student;
    }

    public TeacherInfo getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherInfo teacher) {
        this.teacher = teacher;
    }

    public AdminInfo getAdmin() {
        return admin;
    }

    public void setAdmin(AdminInfo admin) {
        this.admin = admin;
    }
}

package com.xhjsj.enums;

//登录类型
//普通用户登录，管理员登录,商户登录
public enum LoginType {
    STUDENT("Student"), TEACHER("Teacher"), ADMINS("Admin");
    private String type;

    private LoginType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type.toString();
    }
}

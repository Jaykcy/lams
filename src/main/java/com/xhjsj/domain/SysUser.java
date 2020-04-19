package com.xhjsj.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_user")
public class SysUser extends BaseRowModel implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ACCOUNT")
    @ExcelProperty(value = "用户名", index = 0)
    private String account;

    @ExcelProperty(value = "密码", index = 1)
    @Column(name = "PASSWORD")
    private String password;

    @ExcelProperty(value = "姓名", index = 2)
    @Column(name = "USER_NAME")
    private String userName;

    @ExcelProperty(value = "性别", index = 3)
    @Column(name = "SEX")
    private String sex;

    @ExcelProperty(value = "邮箱", index = 4)
    @Column(name = "EMAIL")
    private String email;

    @ExcelProperty(value = "学号/工号", index = 5)
    @Column(name = "EMPLOYEE_NUMBER")
    private String employeeNumber;

    @ExcelProperty(value = "学生专业", index = 6)
    @Column(name = "MAJOR")
    private String major;

    @ExcelProperty(value = "学生班级", index = 7)
    @Column(name = "U_CLASS")
    private String uClass;

    @ExcelProperty(value = "角色", index = 8)
    @Column(name = "ROLE")
    private String role;

    @ExcelProperty(value = "所属学院", index = 9)
    @Column(name = "DEPT_NAME")
    private String deptName;

    @ExcelProperty(value = "联系方式", index = 10)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;


    @Column(name = "IS_USED")
    private String isUsed;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column(name = "ATTRI_TEXT01")
    private String attriText01;
    @Column(name = "ATTRI_TEXT02")
    private String attriText02;
    @Column(name = "ATTRI_TEXT03")
    private String attriText03;
    @Column(name = "ATTRI_NUMBER01")
    private Integer attriNumber01;
    @Column(name = "ATTRI_NUMBER02")
    private Integer attriNumber02;
    @Column(name = "ATTRI_NUMBER03")
    private Integer attriNumber03;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getuClass() {
        return uClass;
    }

    public void setuClass(String uClass) {
        this.uClass = uClass == null ? null : uClass.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getAttriText01() {
        return attriText01;
    }

    public void setAttriText01(String attriText01) {
        this.attriText01 = attriText01 == null ? null : attriText01.trim();
    }

    public String getAttriText02() {
        return attriText02;
    }

    public void setAttriText02(String attriText02) {
        this.attriText02 = attriText02 == null ? null : attriText02.trim();
    }

    public String getAttriText03() {
        return attriText03;
    }

    public void setAttriText03(String attriText03) {
        this.attriText03 = attriText03 == null ? null : attriText03.trim();
    }

    public Integer getAttriNumber01() {
        return attriNumber01;
    }

    public void setAttriNumber01(Integer attriNumber01) {
        this.attriNumber01 = attriNumber01;
    }

    public Integer getAttriNumber02() {
        return attriNumber02;
    }

    public void setAttriNumber02(Integer attriNumber02) {
        this.attriNumber02 = attriNumber02;
    }

    public Integer getAttriNumber03() {
        return attriNumber03;
    }

    public void setAttriNumber03(Integer attriNumber03) {
        this.attriNumber03 = attriNumber03;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", major='" + major + '\'' +
                ", uClass='" + uClass + '\'' +
                ", role='" + role + '\'' +
                ", deptName='" + deptName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", attriText01='" + attriText01 + '\'' +
                ", attriText02='" + attriText02 + '\'' +
                ", attriText03='" + attriText03 + '\'' +
                ", attriNumber01=" + attriNumber01 +
                ", attriNumber02=" + attriNumber02 +
                ", attriNumber03=" + attriNumber03 +
                '}';
    }
}
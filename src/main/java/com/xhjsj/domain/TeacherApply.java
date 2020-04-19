package com.xhjsj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_e_apply")
@ApiModel(description = "教师实验申请表")
public class TeacherApply implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "req_number")
    private String reqNumber;
    @Column(name = "t_number")
    private String tNumber;
    @Column(name = "t_name")
    private String tName;
    @Column(name = "e_name")
    private String eName;
    @Column(name = "section")
    private String section;
    @Column(name = "r_number")
    private String rNumber;
    @Column(name = "r_now_per")
    private Integer rNowPer;
    @Column(name = "r_max_per")
    private Integer rMaxPer;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "update_date")
    private Date updateDate;
    @Column(name = "status")
    private String status;
    @Column(name = "s_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date sDate;
    @Column(name = "e_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date eDate;
    @Column(name = "s_time")
    private Integer sTime;
    @Column(name = "e_time")
    private Integer eTime;
    @Column(name = "remark")
    private String remark;
    @Column(name = "attri_text01")
    private String attriText01;
    @Column(name = "attri_text02")
    private String attriText02;
    @Column(name = "attri_number01")
    private Integer attriNumber01;
    @Column(name = "attri_number02")
    private Integer attriNumber02;
    private static final long serialVersionUID = 1L;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReqNumber() {
        return reqNumber;
    }

    public void setReqNumber(String reqNumber) {
        this.reqNumber = reqNumber == null ? null : reqNumber.trim();
    }

    public String gettNumber() {
        return tNumber;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber == null ? null : tNumber.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }

    public Integer getrNowPer() {
        return rNowPer;
    }

    public void setrNowPer(Integer rNowPer) {
        this.rNowPer = rNowPer;
    }

    public Integer getrMaxPer() {
        return rMaxPer;
    }

    public void setrMaxPer(Integer rMaxPer) {
        this.rMaxPer = rMaxPer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }

    public Integer getsTime() {
        return sTime;
    }

    public void setsTime(Integer sTime) {
        this.sTime = sTime;
    }

    public Integer geteTime() {
        return eTime;
    }

    public void seteTime(Integer eTime) {
        this.eTime = eTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}
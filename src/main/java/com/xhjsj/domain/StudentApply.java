package com.xhjsj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "s_e_apply")
public class StudentApply implements Serializable {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "req_number")
    private String reqNumber;

    @Column(name = "s_number")
    private String sNumber;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_major")
    private String sMajor;

    @Column(name = "e_number")
    private String eNumber;

    @Column(name = "e_name")
    private String eName;

    @Column(name = "e_t_name")
    private String eTName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Column(name = "e_starttime")
    private Date eStarttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Column(name = "e_endtime")
    private Date eEndtime;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "status")
    private String status;

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

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber == null ? null : sNumber.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor == null ? null : sMajor.trim();
    }

    public String geteNumber() {
        return eNumber;
    }

    public void seteNumber(String eNumber) {
        this.eNumber = eNumber == null ? null : eNumber.trim();
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteTName() {
        return eTName;
    }

    public void seteTName(String eTName) {
        this.eTName = eTName == null ? null : eTName.trim();
    }

    public Date geteStarttime() {
        return eStarttime;
    }

    public void seteStarttime(Date eStarttime) {
        this.eStarttime = eStarttime;
    }

    public Date geteEndtime() {
        return eEndtime;
    }

    public void seteEndtime(Date eEndtime) {
        this.eEndtime = eEndtime;
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
package com.xhjsj.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "push")
public class Push implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "reqnumber")
    private String reqnumber;

    @Column(name = "role")
    private String role;

    @Column(name = "messagetype")
    private String messagetype;

    @Column(name = "message")
    private String message;

    @Column(name = "readed")
    private Boolean readed;

    @Column(name = "receiver")
    private String receiver;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "reason")
    private String reason;

    private Date createdDate;

    private Date updatedDate;

    private String attriText01;

    private String attriText02;

    private String attriText03;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReqnumber() {
        return reqnumber;
    }

    public void setReqnumber(String reqnumber) {
        this.reqnumber = reqnumber == null ? null : reqnumber.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype == null ? null : messagetype.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Boolean getReaded() {
        return readed;
    }

    public void setReaded(Boolean readed) {
        this.readed = readed;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
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

    @Override
    public String toString() {
        return "Push{" +
                "id=" + id +
                ", reqnumber='" + reqnumber + '\'' +
                ", role='" + role + '\'' +
                ", messagetype='" + messagetype + '\'' +
                ", message='" + message + '\'' +
                ", readed=" + readed +
                ", receiver='" + receiver + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", reason='" + reason + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
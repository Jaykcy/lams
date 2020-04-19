package com.xhjsj.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "admin_info")
public class AdminInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.a_id
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Integer aId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.a_number
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "a_number")
    private String aNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.a_name
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "a_name")
    private String aName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.a_pass
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "a_pass")
    private String aPass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.a_email
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "a_email")
    private String aEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.a_role
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "a_role")
    private String aRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.create_date
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.update_date
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.attri_text01
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "attri_text01")
    private String attriText01;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.attri_text02
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "attri_text02")
    private String attriText02;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.attri_number01
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "attri_number01")
    private Integer attriNumber01;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.attri_number02
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    @Column(name = "attri_number02")
    private Integer attriNumber02;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.a_id
     *
     * @return the value of admin_info.a_id
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public Integer getaId() {
        return aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.a_id
     *
     * @param aId the value for admin_info.a_id
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setaId(Integer aId) {
        this.aId = aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.a_number
     *
     * @return the value of admin_info.a_number
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getaNumber() {
        return aNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.a_number
     *
     * @param aNumber the value for admin_info.a_number
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setaNumber(String aNumber) {
        this.aNumber = aNumber == null ? null : aNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.a_name
     *
     * @return the value of admin_info.a_name
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getaName() {
        return aName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.a_name
     *
     * @param aName the value for admin_info.a_name
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.a_pass
     *
     * @return the value of admin_info.a_pass
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getaPass() {
        return aPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.a_pass
     *
     * @param aPass the value for admin_info.a_pass
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setaPass(String aPass) {
        this.aPass = aPass == null ? null : aPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.a_email
     *
     * @return the value of admin_info.a_email
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getaEmail() {
        return aEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.a_email
     *
     * @param aEmail the value for admin_info.a_email
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setaEmail(String aEmail) {
        this.aEmail = aEmail == null ? null : aEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.a_role
     *
     * @return the value of admin_info.a_role
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getaRole() {
        return aRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.a_role
     *
     * @param aRole the value for admin_info.a_role
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setaRole(String aRole) {
        this.aRole = aRole == null ? null : aRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.create_date
     *
     * @return the value of admin_info.create_date
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.create_date
     *
     * @param createDate the value for admin_info.create_date
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.update_date
     *
     * @return the value of admin_info.update_date
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.update_date
     *
     * @param updateDate the value for admin_info.update_date
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.attri_text01
     *
     * @return the value of admin_info.attri_text01
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getAttriText01() {
        return attriText01;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.attri_text01
     *
     * @param attriText01 the value for admin_info.attri_text01
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setAttriText01(String attriText01) {
        this.attriText01 = attriText01 == null ? null : attriText01.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.attri_text02
     *
     * @return the value of admin_info.attri_text02
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getAttriText02() {
        return attriText02;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.attri_text02
     *
     * @param attriText02 the value for admin_info.attri_text02
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setAttriText02(String attriText02) {
        this.attriText02 = attriText02 == null ? null : attriText02.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.attri_number01
     *
     * @return the value of admin_info.attri_number01
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public Integer getAttriNumber01() {
        return attriNumber01;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.attri_number01
     *
     * @param attriNumber01 the value for admin_info.attri_number01
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setAttriNumber01(Integer attriNumber01) {
        this.attriNumber01 = attriNumber01;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.attri_number02
     *
     * @return the value of admin_info.attri_number02
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public Integer getAttriNumber02() {
        return attriNumber02;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.attri_number02
     *
     * @param attriNumber02 the value for admin_info.attri_number02
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setAttriNumber02(Integer attriNumber02) {
        this.attriNumber02 = attriNumber02;
    }
}
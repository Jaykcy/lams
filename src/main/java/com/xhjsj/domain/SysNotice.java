package com.xhjsj.domain;

import java.io.Serializable;
import java.util.Date;

public class SysNotice implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.id
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.n_num
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private String nNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.n_content
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private String nContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.create_date
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.update_date
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.attri_text01
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private String attriText01;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.attri_text02
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private String attriText02;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_notice
     *
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.id
     *
     * @return the value of sys_notice.id
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.id
     *
     * @param id the value for sys_notice.id
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.n_num
     *
     * @return the value of sys_notice.n_num
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public String getnNum() {
        return nNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.n_num
     *
     * @param nNum the value for sys_notice.n_num
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public void setnNum(String nNum) {
        this.nNum = nNum == null ? null : nNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.n_content
     *
     * @return the value of sys_notice.n_content
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public String getnContent() {
        return nContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.n_content
     *
     * @param nContent the value for sys_notice.n_content
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.create_date
     *
     * @return the value of sys_notice.create_date
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.create_date
     *
     * @param createDate the value for sys_notice.create_date
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.update_date
     *
     * @return the value of sys_notice.update_date
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.update_date
     *
     * @param updateDate the value for sys_notice.update_date
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.attri_text01
     *
     * @return the value of sys_notice.attri_text01
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public String getAttriText01() {
        return attriText01;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.attri_text01
     *
     * @param attriText01 the value for sys_notice.attri_text01
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public void setAttriText01(String attriText01) {
        this.attriText01 = attriText01 == null ? null : attriText01.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.attri_text02
     *
     * @return the value of sys_notice.attri_text02
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public String getAttriText02() {
        return attriText02;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.attri_text02
     *
     * @param attriText02 the value for sys_notice.attri_text02
     * @mbggenerated Mon Nov 25 22:42:41 CST 2019
     */
    public void setAttriText02(String attriText02) {
        this.attriText02 = attriText02 == null ? null : attriText02.trim();
    }
}
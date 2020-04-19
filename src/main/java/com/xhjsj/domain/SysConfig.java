package com.xhjsj.domain;

import java.io.Serializable;
import java.util.Date;

public class SysConfig implements Serializable {
    private Integer id;

    private String modular;

    private String configKey;

    private String configValue;

    private String remark;

    private Date updateDate;

    private String attriText01;

    private String attriText02;

    private String attriText03;

    private String attriText04;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModular() {
        return modular;
    }

    public void setModular(String modular) {
        this.modular = modular == null ? null : modular.trim();
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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

    public String getAttriText04() {
        return attriText04;
    }

    public void setAttriText04(String attriText04) {
        this.attriText04 = attriText04 == null ? null : attriText04.trim();
    }
}
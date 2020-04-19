package com.xhjsj.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModularIsNull() {
            addCriterion("MODULAR is null");
            return (Criteria) this;
        }

        public Criteria andModularIsNotNull() {
            addCriterion("MODULAR is not null");
            return (Criteria) this;
        }

        public Criteria andModularEqualTo(String value) {
            addCriterion("MODULAR =", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotEqualTo(String value) {
            addCriterion("MODULAR <>", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularGreaterThan(String value) {
            addCriterion("MODULAR >", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularGreaterThanOrEqualTo(String value) {
            addCriterion("MODULAR >=", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularLessThan(String value) {
            addCriterion("MODULAR <", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularLessThanOrEqualTo(String value) {
            addCriterion("MODULAR <=", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularLike(String value) {
            addCriterion("MODULAR like", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotLike(String value) {
            addCriterion("MODULAR not like", value, "modular");
            return (Criteria) this;
        }

        public Criteria andModularIn(List<String> values) {
            addCriterion("MODULAR in", values, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotIn(List<String> values) {
            addCriterion("MODULAR not in", values, "modular");
            return (Criteria) this;
        }

        public Criteria andModularBetween(String value1, String value2) {
            addCriterion("MODULAR between", value1, value2, "modular");
            return (Criteria) this;
        }

        public Criteria andModularNotBetween(String value1, String value2) {
            addCriterion("MODULAR not between", value1, value2, "modular");
            return (Criteria) this;
        }

        public Criteria andConfigKeyIsNull() {
            addCriterion("CONFIG_KEY is null");
            return (Criteria) this;
        }

        public Criteria andConfigKeyIsNotNull() {
            addCriterion("CONFIG_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andConfigKeyEqualTo(String value) {
            addCriterion("CONFIG_KEY =", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotEqualTo(String value) {
            addCriterion("CONFIG_KEY <>", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyGreaterThan(String value) {
            addCriterion("CONFIG_KEY >", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_KEY >=", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyLessThan(String value) {
            addCriterion("CONFIG_KEY <", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_KEY <=", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyLike(String value) {
            addCriterion("CONFIG_KEY like", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotLike(String value) {
            addCriterion("CONFIG_KEY not like", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyIn(List<String> values) {
            addCriterion("CONFIG_KEY in", values, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotIn(List<String> values) {
            addCriterion("CONFIG_KEY not in", values, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyBetween(String value1, String value2) {
            addCriterion("CONFIG_KEY between", value1, value2, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotBetween(String value1, String value2) {
            addCriterion("CONFIG_KEY not between", value1, value2, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigValueIsNull() {
            addCriterion("CONFIG_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andConfigValueIsNotNull() {
            addCriterion("CONFIG_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andConfigValueEqualTo(String value) {
            addCriterion("CONFIG_VALUE =", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotEqualTo(String value) {
            addCriterion("CONFIG_VALUE <>", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThan(String value) {
            addCriterion("CONFIG_VALUE >", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_VALUE >=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThan(String value) {
            addCriterion("CONFIG_VALUE <", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_VALUE <=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLike(String value) {
            addCriterion("CONFIG_VALUE like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotLike(String value) {
            addCriterion("CONFIG_VALUE not like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueIn(List<String> values) {
            addCriterion("CONFIG_VALUE in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotIn(List<String> values) {
            addCriterion("CONFIG_VALUE not in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueBetween(String value1, String value2) {
            addCriterion("CONFIG_VALUE between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotBetween(String value1, String value2) {
            addCriterion("CONFIG_VALUE not between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andAttriText01IsNull() {
            addCriterion("ATTRI_TEXT01 is null");
            return (Criteria) this;
        }

        public Criteria andAttriText01IsNotNull() {
            addCriterion("ATTRI_TEXT01 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriText01EqualTo(String value) {
            addCriterion("ATTRI_TEXT01 =", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotEqualTo(String value) {
            addCriterion("ATTRI_TEXT01 <>", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01GreaterThan(String value) {
            addCriterion("ATTRI_TEXT01 >", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT01 >=", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01LessThan(String value) {
            addCriterion("ATTRI_TEXT01 <", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01LessThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT01 <=", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01Like(String value) {
            addCriterion("ATTRI_TEXT01 like", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotLike(String value) {
            addCriterion("ATTRI_TEXT01 not like", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01In(List<String> values) {
            addCriterion("ATTRI_TEXT01 in", values, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotIn(List<String> values) {
            addCriterion("ATTRI_TEXT01 not in", values, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01Between(String value1, String value2) {
            addCriterion("ATTRI_TEXT01 between", value1, value2, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotBetween(String value1, String value2) {
            addCriterion("ATTRI_TEXT01 not between", value1, value2, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText02IsNull() {
            addCriterion("ATTRI_TEXT02 is null");
            return (Criteria) this;
        }

        public Criteria andAttriText02IsNotNull() {
            addCriterion("ATTRI_TEXT02 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriText02EqualTo(String value) {
            addCriterion("ATTRI_TEXT02 =", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotEqualTo(String value) {
            addCriterion("ATTRI_TEXT02 <>", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02GreaterThan(String value) {
            addCriterion("ATTRI_TEXT02 >", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT02 >=", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02LessThan(String value) {
            addCriterion("ATTRI_TEXT02 <", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02LessThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT02 <=", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02Like(String value) {
            addCriterion("ATTRI_TEXT02 like", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotLike(String value) {
            addCriterion("ATTRI_TEXT02 not like", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02In(List<String> values) {
            addCriterion("ATTRI_TEXT02 in", values, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotIn(List<String> values) {
            addCriterion("ATTRI_TEXT02 not in", values, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02Between(String value1, String value2) {
            addCriterion("ATTRI_TEXT02 between", value1, value2, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotBetween(String value1, String value2) {
            addCriterion("ATTRI_TEXT02 not between", value1, value2, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText03IsNull() {
            addCriterion("ATTRI_TEXT03 is null");
            return (Criteria) this;
        }

        public Criteria andAttriText03IsNotNull() {
            addCriterion("ATTRI_TEXT03 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriText03EqualTo(String value) {
            addCriterion("ATTRI_TEXT03 =", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03NotEqualTo(String value) {
            addCriterion("ATTRI_TEXT03 <>", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03GreaterThan(String value) {
            addCriterion("ATTRI_TEXT03 >", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT03 >=", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03LessThan(String value) {
            addCriterion("ATTRI_TEXT03 <", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03LessThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT03 <=", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03Like(String value) {
            addCriterion("ATTRI_TEXT03 like", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03NotLike(String value) {
            addCriterion("ATTRI_TEXT03 not like", value, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03In(List<String> values) {
            addCriterion("ATTRI_TEXT03 in", values, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03NotIn(List<String> values) {
            addCriterion("ATTRI_TEXT03 not in", values, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03Between(String value1, String value2) {
            addCriterion("ATTRI_TEXT03 between", value1, value2, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText03NotBetween(String value1, String value2) {
            addCriterion("ATTRI_TEXT03 not between", value1, value2, "attriText03");
            return (Criteria) this;
        }

        public Criteria andAttriText04IsNull() {
            addCriterion("ATTRI_TEXT04 is null");
            return (Criteria) this;
        }

        public Criteria andAttriText04IsNotNull() {
            addCriterion("ATTRI_TEXT04 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriText04EqualTo(String value) {
            addCriterion("ATTRI_TEXT04 =", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04NotEqualTo(String value) {
            addCriterion("ATTRI_TEXT04 <>", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04GreaterThan(String value) {
            addCriterion("ATTRI_TEXT04 >", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT04 >=", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04LessThan(String value) {
            addCriterion("ATTRI_TEXT04 <", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04LessThanOrEqualTo(String value) {
            addCriterion("ATTRI_TEXT04 <=", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04Like(String value) {
            addCriterion("ATTRI_TEXT04 like", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04NotLike(String value) {
            addCriterion("ATTRI_TEXT04 not like", value, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04In(List<String> values) {
            addCriterion("ATTRI_TEXT04 in", values, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04NotIn(List<String> values) {
            addCriterion("ATTRI_TEXT04 not in", values, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04Between(String value1, String value2) {
            addCriterion("ATTRI_TEXT04 between", value1, value2, "attriText04");
            return (Criteria) this;
        }

        public Criteria andAttriText04NotBetween(String value1, String value2) {
            addCriterion("ATTRI_TEXT04 not between", value1, value2, "attriText04");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package com.xhjsj.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentApplyExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReqNumberIsNull() {
            addCriterion("req_number is null");
            return (Criteria) this;
        }

        public Criteria andReqNumberIsNotNull() {
            addCriterion("req_number is not null");
            return (Criteria) this;
        }

        public Criteria andReqNumberEqualTo(String value) {
            addCriterion("req_number =", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberNotEqualTo(String value) {
            addCriterion("req_number <>", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberGreaterThan(String value) {
            addCriterion("req_number >", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberGreaterThanOrEqualTo(String value) {
            addCriterion("req_number >=", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberLessThan(String value) {
            addCriterion("req_number <", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberLessThanOrEqualTo(String value) {
            addCriterion("req_number <=", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberLike(String value) {
            addCriterion("req_number like", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberNotLike(String value) {
            addCriterion("req_number not like", value, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberIn(List<String> values) {
            addCriterion("req_number in", values, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberNotIn(List<String> values) {
            addCriterion("req_number not in", values, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberBetween(String value1, String value2) {
            addCriterion("req_number between", value1, value2, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andReqNumberNotBetween(String value1, String value2) {
            addCriterion("req_number not between", value1, value2, "reqNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNull() {
            addCriterion("s_number is null");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNotNull() {
            addCriterion("s_number is not null");
            return (Criteria) this;
        }

        public Criteria andSNumberEqualTo(String value) {
            addCriterion("s_number =", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotEqualTo(String value) {
            addCriterion("s_number <>", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThan(String value) {
            addCriterion("s_number >", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThanOrEqualTo(String value) {
            addCriterion("s_number >=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThan(String value) {
            addCriterion("s_number <", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThanOrEqualTo(String value) {
            addCriterion("s_number <=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLike(String value) {
            addCriterion("s_number like", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotLike(String value) {
            addCriterion("s_number not like", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberIn(List<String> values) {
            addCriterion("s_number in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotIn(List<String> values) {
            addCriterion("s_number not in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberBetween(String value1, String value2) {
            addCriterion("s_number between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotBetween(String value1, String value2) {
            addCriterion("s_number not between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNull() {
            addCriterion("s_major is null");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNotNull() {
            addCriterion("s_major is not null");
            return (Criteria) this;
        }

        public Criteria andSMajorEqualTo(String value) {
            addCriterion("s_major =", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotEqualTo(String value) {
            addCriterion("s_major <>", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThan(String value) {
            addCriterion("s_major >", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThanOrEqualTo(String value) {
            addCriterion("s_major >=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThan(String value) {
            addCriterion("s_major <", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThanOrEqualTo(String value) {
            addCriterion("s_major <=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLike(String value) {
            addCriterion("s_major like", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotLike(String value) {
            addCriterion("s_major not like", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorIn(List<String> values) {
            addCriterion("s_major in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotIn(List<String> values) {
            addCriterion("s_major not in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorBetween(String value1, String value2) {
            addCriterion("s_major between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotBetween(String value1, String value2) {
            addCriterion("s_major not between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andENumberIsNull() {
            addCriterion("e_number is null");
            return (Criteria) this;
        }

        public Criteria andENumberIsNotNull() {
            addCriterion("e_number is not null");
            return (Criteria) this;
        }

        public Criteria andENumberEqualTo(String value) {
            addCriterion("e_number =", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotEqualTo(String value) {
            addCriterion("e_number <>", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberGreaterThan(String value) {
            addCriterion("e_number >", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberGreaterThanOrEqualTo(String value) {
            addCriterion("e_number >=", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberLessThan(String value) {
            addCriterion("e_number <", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberLessThanOrEqualTo(String value) {
            addCriterion("e_number <=", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberLike(String value) {
            addCriterion("e_number like", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotLike(String value) {
            addCriterion("e_number not like", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberIn(List<String> values) {
            addCriterion("e_number in", values, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotIn(List<String> values) {
            addCriterion("e_number not in", values, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberBetween(String value1, String value2) {
            addCriterion("e_number between", value1, value2, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotBetween(String value1, String value2) {
            addCriterion("e_number not between", value1, value2, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andETNameIsNull() {
            addCriterion("e_t_name is null");
            return (Criteria) this;
        }

        public Criteria andETNameIsNotNull() {
            addCriterion("e_t_name is not null");
            return (Criteria) this;
        }

        public Criteria andETNameEqualTo(String value) {
            addCriterion("e_t_name =", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameNotEqualTo(String value) {
            addCriterion("e_t_name <>", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameGreaterThan(String value) {
            addCriterion("e_t_name >", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameGreaterThanOrEqualTo(String value) {
            addCriterion("e_t_name >=", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameLessThan(String value) {
            addCriterion("e_t_name <", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameLessThanOrEqualTo(String value) {
            addCriterion("e_t_name <=", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameLike(String value) {
            addCriterion("e_t_name like", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameNotLike(String value) {
            addCriterion("e_t_name not like", value, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameIn(List<String> values) {
            addCriterion("e_t_name in", values, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameNotIn(List<String> values) {
            addCriterion("e_t_name not in", values, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameBetween(String value1, String value2) {
            addCriterion("e_t_name between", value1, value2, "eTName");
            return (Criteria) this;
        }

        public Criteria andETNameNotBetween(String value1, String value2) {
            addCriterion("e_t_name not between", value1, value2, "eTName");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIsNull() {
            addCriterion("e_starttime is null");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIsNotNull() {
            addCriterion("e_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andEStarttimeEqualTo(Date value) {
            addCriterion("e_starttime =", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotEqualTo(Date value) {
            addCriterion("e_starttime <>", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeGreaterThan(Date value) {
            addCriterion("e_starttime >", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_starttime >=", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLessThan(Date value) {
            addCriterion("e_starttime <", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("e_starttime <=", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIn(List<Date> values) {
            addCriterion("e_starttime in", values, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotIn(List<Date> values) {
            addCriterion("e_starttime not in", values, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeBetween(Date value1, Date value2) {
            addCriterion("e_starttime between", value1, value2, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("e_starttime not between", value1, value2, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIsNull() {
            addCriterion("e_endtime is null");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIsNotNull() {
            addCriterion("e_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEEndtimeEqualTo(Date value) {
            addCriterion("e_endtime =", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotEqualTo(Date value) {
            addCriterion("e_endtime <>", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeGreaterThan(Date value) {
            addCriterion("e_endtime >", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_endtime >=", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLessThan(Date value) {
            addCriterion("e_endtime <", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("e_endtime <=", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIn(List<Date> values) {
            addCriterion("e_endtime in", values, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotIn(List<Date> values) {
            addCriterion("e_endtime not in", values, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeBetween(Date value1, Date value2) {
            addCriterion("e_endtime between", value1, value2, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("e_endtime not between", value1, value2, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            String status = "%"+value+"%";
            addCriterion("status not like", status, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAttriText01IsNull() {
            addCriterion("attri_text01 is null");
            return (Criteria) this;
        }

        public Criteria andAttriText01IsNotNull() {
            addCriterion("attri_text01 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriText01EqualTo(String value) {
            addCriterion("attri_text01 =", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotEqualTo(String value) {
            addCriterion("attri_text01 <>", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01GreaterThan(String value) {
            addCriterion("attri_text01 >", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01GreaterThanOrEqualTo(String value) {
            addCriterion("attri_text01 >=", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01LessThan(String value) {
            addCriterion("attri_text01 <", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01LessThanOrEqualTo(String value) {
            addCriterion("attri_text01 <=", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01Like(String value) {
            addCriterion("attri_text01 like", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotLike(String value) {
            addCriterion("attri_text01 not like", value, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01In(List<String> values) {
            addCriterion("attri_text01 in", values, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotIn(List<String> values) {
            addCriterion("attri_text01 not in", values, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01Between(String value1, String value2) {
            addCriterion("attri_text01 between", value1, value2, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText01NotBetween(String value1, String value2) {
            addCriterion("attri_text01 not between", value1, value2, "attriText01");
            return (Criteria) this;
        }

        public Criteria andAttriText02IsNull() {
            addCriterion("attri_text02 is null");
            return (Criteria) this;
        }

        public Criteria andAttriText02IsNotNull() {
            addCriterion("attri_text02 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriText02EqualTo(String value) {
            addCriterion("attri_text02 =", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotEqualTo(String value) {
            addCriterion("attri_text02 <>", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02GreaterThan(String value) {
            addCriterion("attri_text02 >", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02GreaterThanOrEqualTo(String value) {
            addCriterion("attri_text02 >=", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02LessThan(String value) {
            addCriterion("attri_text02 <", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02LessThanOrEqualTo(String value) {
            addCriterion("attri_text02 <=", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02Like(String value) {
            addCriterion("attri_text02 like", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotLike(String value) {
            addCriterion("attri_text02 not like", value, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02In(List<String> values) {
            addCriterion("attri_text02 in", values, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotIn(List<String> values) {
            addCriterion("attri_text02 not in", values, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02Between(String value1, String value2) {
            addCriterion("attri_text02 between", value1, value2, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriText02NotBetween(String value1, String value2) {
            addCriterion("attri_text02 not between", value1, value2, "attriText02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01IsNull() {
            addCriterion("attri_number01 is null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01IsNotNull() {
            addCriterion("attri_number01 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01EqualTo(Integer value) {
            addCriterion("attri_number01 =", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01NotEqualTo(Integer value) {
            addCriterion("attri_number01 <>", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01GreaterThan(Integer value) {
            addCriterion("attri_number01 >", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01GreaterThanOrEqualTo(Integer value) {
            addCriterion("attri_number01 >=", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01LessThan(Integer value) {
            addCriterion("attri_number01 <", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01LessThanOrEqualTo(Integer value) {
            addCriterion("attri_number01 <=", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01In(List<Integer> values) {
            addCriterion("attri_number01 in", values, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01NotIn(List<Integer> values) {
            addCriterion("attri_number01 not in", values, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01Between(Integer value1, Integer value2) {
            addCriterion("attri_number01 between", value1, value2, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01NotBetween(Integer value1, Integer value2) {
            addCriterion("attri_number01 not between", value1, value2, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02IsNull() {
            addCriterion("attri_number02 is null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02IsNotNull() {
            addCriterion("attri_number02 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02EqualTo(Integer value) {
            addCriterion("attri_number02 =", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02NotEqualTo(Integer value) {
            addCriterion("attri_number02 <>", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02GreaterThan(Integer value) {
            addCriterion("attri_number02 >", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02GreaterThanOrEqualTo(Integer value) {
            addCriterion("attri_number02 >=", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02LessThan(Integer value) {
            addCriterion("attri_number02 <", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02LessThanOrEqualTo(Integer value) {
            addCriterion("attri_number02 <=", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02In(List<Integer> values) {
            addCriterion("attri_number02 in", values, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02NotIn(List<Integer> values) {
            addCriterion("attri_number02 not in", values, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02Between(Integer value1, Integer value2) {
            addCriterion("attri_number02 between", value1, value2, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02NotBetween(Integer value1, Integer value2) {
            addCriterion("attri_number02 not between", value1, value2, "attriNumber02");
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
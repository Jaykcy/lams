package com.xhjsj.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherApplyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTNumberIsNull() {
            addCriterion("t_number is null");
            return (Criteria) this;
        }

        public Criteria andTNumberIsNotNull() {
            addCriterion("t_number is not null");
            return (Criteria) this;
        }

        public Criteria andTNumberEqualTo(String value) {
            addCriterion("t_number =", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotEqualTo(String value) {
            addCriterion("t_number <>", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberGreaterThan(String value) {
            addCriterion("t_number >", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberGreaterThanOrEqualTo(String value) {
            addCriterion("t_number >=", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberLessThan(String value) {
            addCriterion("t_number <", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberLessThanOrEqualTo(String value) {
            addCriterion("t_number <=", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberLike(String value) {
            String tNum="%"+value+"%";
            addCriterion("t_number like", tNum, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotLike(String value) {
            addCriterion("t_number not like", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberIn(List<String> values) {
            addCriterion("t_number in", values, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotIn(List<String> values) {
            addCriterion("t_number not in", values, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberBetween(String value1, String value2) {
            addCriterion("t_number between", value1, value2, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotBetween(String value1, String value2) {
            addCriterion("t_number not between", value1, value2, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            String tName="%"+value+"%";
            addCriterion("t_name like", tName, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
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
            String eName="%"+value+"%";
            addCriterion("e_name like", eName, "eName");
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

        public Criteria andSectionIsNull() {
            addCriterion("section is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("section is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(String value) {
            addCriterion("section =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(String value) {
            addCriterion("section <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(String value) {
            addCriterion("section >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(String value) {
            addCriterion("section >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(String value) {
            addCriterion("section <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(String value) {
            addCriterion("section <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLike(String value) {
            addCriterion("section like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotLike(String value) {
            addCriterion("section not like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<String> values) {
            addCriterion("section in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<String> values) {
            addCriterion("section not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(String value1, String value2) {
            addCriterion("section between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(String value1, String value2) {
            addCriterion("section not between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNull() {
            addCriterion("r_number is null");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNotNull() {
            addCriterion("r_number is not null");
            return (Criteria) this;
        }

        public Criteria andRNumberEqualTo(String value) {
            addCriterion("r_number =", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotEqualTo(String value) {
            addCriterion("r_number <>", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThan(String value) {
            addCriterion("r_number >", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThanOrEqualTo(String value) {
            addCriterion("r_number >=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThan(String value) {
            addCriterion("r_number <", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThanOrEqualTo(String value) {
            addCriterion("r_number <=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLike(String value) {
            String rNumber="%"+value+"%";
            addCriterion("r_number like", rNumber, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotLike(String value) {
            addCriterion("r_number not like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberIn(List<String> values) {
            addCriterion("r_number in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotIn(List<String> values) {
            addCriterion("r_number not in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberBetween(String value1, String value2) {
            addCriterion("r_number between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotBetween(String value1, String value2) {
            addCriterion("r_number not between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNowPerIsNull() {
            addCriterion("r_now_per is null");
            return (Criteria) this;
        }

        public Criteria andRNowPerIsNotNull() {
            addCriterion("r_now_per is not null");
            return (Criteria) this;
        }

        public Criteria andRNowPerEqualTo(Integer value) {
            addCriterion("r_now_per =", value, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerNotEqualTo(Integer value) {
            addCriterion("r_now_per <>", value, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerGreaterThan(Integer value) {
            addCriterion("r_now_per >", value, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_now_per >=", value, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerLessThan(Integer value) {
            addCriterion("r_now_per <", value, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerLessThanOrEqualTo(Integer value) {
            addCriterion("r_now_per <=", value, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerIn(List<Integer> values) {
            addCriterion("r_now_per in", values, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerNotIn(List<Integer> values) {
            addCriterion("r_now_per not in", values, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerBetween(Integer value1, Integer value2) {
            addCriterion("r_now_per between", value1, value2, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRNowPerNotBetween(Integer value1, Integer value2) {
            addCriterion("r_now_per not between", value1, value2, "rNowPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerIsNull() {
            addCriterion("r_max_per is null");
            return (Criteria) this;
        }

        public Criteria andRMaxPerIsNotNull() {
            addCriterion("r_max_per is not null");
            return (Criteria) this;
        }

        public Criteria andRMaxPerEqualTo(Integer value) {
            addCriterion("r_max_per =", value, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerNotEqualTo(Integer value) {
            addCriterion("r_max_per <>", value, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerGreaterThan(Integer value) {
            addCriterion("r_max_per >", value, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_max_per >=", value, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerLessThan(Integer value) {
            addCriterion("r_max_per <", value, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerLessThanOrEqualTo(Integer value) {
            addCriterion("r_max_per <=", value, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerIn(List<Integer> values) {
            addCriterion("r_max_per in", values, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerNotIn(List<Integer> values) {
            addCriterion("r_max_per not in", values, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerBetween(Integer value1, Integer value2) {
            addCriterion("r_max_per between", value1, value2, "rMaxPer");
            return (Criteria) this;
        }

        public Criteria andRMaxPerNotBetween(Integer value1, Integer value2) {
            addCriterion("r_max_per not between", value1, value2, "rMaxPer");
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
            String status="%"+value+"%";
            addCriterion("status like", status, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
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

        public Criteria andSDateIsNull() {
            addCriterion("s_date is null");
            return (Criteria) this;
        }

        public Criteria andSDateIsNotNull() {
            addCriterion("s_date is not null");
            return (Criteria) this;
        }

        public Criteria andSDateEqualTo(Date value) {
            addCriterionForJDBCDate("s_date =", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("s_date <>", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateGreaterThan(Date value) {
            addCriterionForJDBCDate("s_date >", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_date >=", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateLessThan(Date value) {
            addCriterionForJDBCDate("s_date <", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_date <=", value, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateIn(List<Date> values) {
            addCriterionForJDBCDate("s_date in", values, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("s_date not in", values, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_date between", value1, value2, "sDate");
            return (Criteria) this;
        }

        public Criteria andSDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_date not between", value1, value2, "sDate");
            return (Criteria) this;
        }

        public Criteria andEDateIsNull() {
            addCriterion("e_date is null");
            return (Criteria) this;
        }

        public Criteria andEDateIsNotNull() {
            addCriterion("e_date is not null");
            return (Criteria) this;
        }

        public Criteria andEDateEqualTo(Date value) {
            addCriterionForJDBCDate("e_date =", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("e_date <>", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateGreaterThan(Date value) {
            addCriterionForJDBCDate("e_date >", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("e_date >=", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateLessThan(Date value) {
            addCriterionForJDBCDate("e_date <", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("e_date <=", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateIn(List<Date> values) {
            addCriterionForJDBCDate("e_date in", values, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("e_date not in", values, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("e_date between", value1, value2, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("e_date not between", value1, value2, "eDate");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNull() {
            addCriterion("s_time is null");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNotNull() {
            addCriterion("s_time is not null");
            return (Criteria) this;
        }

        public Criteria andSTimeEqualTo(Integer value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(Integer value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(Integer value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(Integer value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(Integer value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<Integer> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<Integer> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(Integer value1, Integer value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andETimeIsNull() {
            addCriterion("e_time is null");
            return (Criteria) this;
        }

        public Criteria andETimeIsNotNull() {
            addCriterion("e_time is not null");
            return (Criteria) this;
        }

        public Criteria andETimeEqualTo(Integer value) {
            addCriterion("e_time =", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotEqualTo(Integer value) {
            addCriterion("e_time <>", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThan(Integer value) {
            addCriterion("e_time >", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_time >=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThan(Integer value) {
            addCriterion("e_time <", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThanOrEqualTo(Integer value) {
            addCriterion("e_time <=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeIn(List<Integer> values) {
            addCriterion("e_time in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotIn(List<Integer> values) {
            addCriterion("e_time not in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeBetween(Integer value1, Integer value2) {
            addCriterion("e_time between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotBetween(Integer value1, Integer value2) {
            addCriterion("e_time not between", value1, value2, "eTime");
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
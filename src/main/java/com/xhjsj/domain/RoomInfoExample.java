package com.xhjsj.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public RoomInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
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
            addCriterion("r_number like", value, "rNumber");
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

        public Criteria andRNameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("r_name =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("r_name >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("r_name <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("r_name like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("r_name not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("r_name in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "rName");
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room_info
     *
     * @mbggenerated do_not_delete_during_merge Sun Nov 24 14:34:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room_info
     *
     * @mbggenerated Sun Nov 24 14:34:09 CST 2019
     */
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
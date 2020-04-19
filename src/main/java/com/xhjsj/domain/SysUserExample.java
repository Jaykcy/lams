package com.xhjsj.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNull() {
            addCriterion("EMPLOYEE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNotNull() {
            addCriterion("EMPLOYEE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER =", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <>", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThan(String value) {
            addCriterion("EMPLOYEE_NUMBER >", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER >=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThan(String value) {
            addCriterion("EMPLOYEE_NUMBER <", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLike(String value) {
            addCriterion("EMPLOYEE_NUMBER like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotLike(String value) {
            addCriterion("EMPLOYEE_NUMBER not like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER not in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER not between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andUClassIsNull() {
            addCriterion("U_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andUClassIsNotNull() {
            addCriterion("U_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andUClassEqualTo(String value) {
            addCriterion("U_CLASS =", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassNotEqualTo(String value) {
            addCriterion("U_CLASS <>", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassGreaterThan(String value) {
            addCriterion("U_CLASS >", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassGreaterThanOrEqualTo(String value) {
            addCriterion("U_CLASS >=", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassLessThan(String value) {
            addCriterion("U_CLASS <", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassLessThanOrEqualTo(String value) {
            addCriterion("U_CLASS <=", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassLike(String value) {
            addCriterion("U_CLASS like", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassNotLike(String value) {
            addCriterion("U_CLASS not like", value, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassIn(List<String> values) {
            addCriterion("U_CLASS in", values, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassNotIn(List<String> values) {
            addCriterion("U_CLASS not in", values, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassBetween(String value1, String value2) {
            addCriterion("U_CLASS between", value1, value2, "uClass");
            return (Criteria) this;
        }

        public Criteria andUClassNotBetween(String value1, String value2) {
            addCriterion("U_CLASS not between", value1, value2, "uClass");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("ROLE is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("ROLE =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("ROLE <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("ROLE >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("ROLE <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("ROLE <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("ROLE like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("ROLE not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("ROLE in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("ROLE not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("ROLE between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("ROLE not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNull() {
            addCriterion("IS_USED is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("IS_USED is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(String value) {
            addCriterion("IS_USED =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(String value) {
            addCriterion("IS_USED <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(String value) {
            addCriterion("IS_USED >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_USED >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(String value) {
            addCriterion("IS_USED <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(String value) {
            addCriterion("IS_USED <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLike(String value) {
            addCriterion("IS_USED like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotLike(String value) {
            addCriterion("IS_USED not like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<String> values) {
            addCriterion("IS_USED in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<String> values) {
            addCriterion("IS_USED not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(String value1, String value2) {
            addCriterion("IS_USED between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(String value1, String value2) {
            addCriterion("IS_USED not between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("UPDATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("UPDATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterion("UPDATED_DATE =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterion("UPDATED_DATE <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterion("UPDATED_DATE >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATE >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterion("UPDATED_DATE <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATE <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterion("UPDATED_DATE in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterion("UPDATED_DATE not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATE between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATE not between", value1, value2, "updatedDate");
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

        public Criteria andAttriNumber01IsNull() {
            addCriterion("ATTRI_NUMBER01 is null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01IsNotNull() {
            addCriterion("ATTRI_NUMBER01 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01EqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER01 =", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01NotEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER01 <>", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01GreaterThan(Integer value) {
            addCriterion("ATTRI_NUMBER01 >", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01GreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER01 >=", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01LessThan(Integer value) {
            addCriterion("ATTRI_NUMBER01 <", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01LessThanOrEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER01 <=", value, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01In(List<Integer> values) {
            addCriterion("ATTRI_NUMBER01 in", values, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01NotIn(List<Integer> values) {
            addCriterion("ATTRI_NUMBER01 not in", values, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01Between(Integer value1, Integer value2) {
            addCriterion("ATTRI_NUMBER01 between", value1, value2, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber01NotBetween(Integer value1, Integer value2) {
            addCriterion("ATTRI_NUMBER01 not between", value1, value2, "attriNumber01");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02IsNull() {
            addCriterion("ATTRI_NUMBER02 is null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02IsNotNull() {
            addCriterion("ATTRI_NUMBER02 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02EqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER02 =", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02NotEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER02 <>", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02GreaterThan(Integer value) {
            addCriterion("ATTRI_NUMBER02 >", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02GreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER02 >=", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02LessThan(Integer value) {
            addCriterion("ATTRI_NUMBER02 <", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02LessThanOrEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER02 <=", value, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02In(List<Integer> values) {
            addCriterion("ATTRI_NUMBER02 in", values, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02NotIn(List<Integer> values) {
            addCriterion("ATTRI_NUMBER02 not in", values, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02Between(Integer value1, Integer value2) {
            addCriterion("ATTRI_NUMBER02 between", value1, value2, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber02NotBetween(Integer value1, Integer value2) {
            addCriterion("ATTRI_NUMBER02 not between", value1, value2, "attriNumber02");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03IsNull() {
            addCriterion("ATTRI_NUMBER03 is null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03IsNotNull() {
            addCriterion("ATTRI_NUMBER03 is not null");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03EqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER03 =", value, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03NotEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER03 <>", value, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03GreaterThan(Integer value) {
            addCriterion("ATTRI_NUMBER03 >", value, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03GreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER03 >=", value, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03LessThan(Integer value) {
            addCriterion("ATTRI_NUMBER03 <", value, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03LessThanOrEqualTo(Integer value) {
            addCriterion("ATTRI_NUMBER03 <=", value, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03In(List<Integer> values) {
            addCriterion("ATTRI_NUMBER03 in", values, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03NotIn(List<Integer> values) {
            addCriterion("ATTRI_NUMBER03 not in", values, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03Between(Integer value1, Integer value2) {
            addCriterion("ATTRI_NUMBER03 between", value1, value2, "attriNumber03");
            return (Criteria) this;
        }

        public Criteria andAttriNumber03NotBetween(Integer value1, Integer value2) {
            addCriterion("ATTRI_NUMBER03 not between", value1, value2, "attriNumber03");
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
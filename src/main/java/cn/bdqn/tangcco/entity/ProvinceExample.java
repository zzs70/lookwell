package cn.bdqn.tangcco.entity;

import java.util.ArrayList;
import java.util.List;

public class ProvinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvinceExample() {
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

        public Criteria andProvidIsNull() {
            addCriterion("provid is null");
            return (Criteria) this;
        }

        public Criteria andProvidIsNotNull() {
            addCriterion("provid is not null");
            return (Criteria) this;
        }

        public Criteria andProvidEqualTo(Integer value) {
            addCriterion("provid =", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotEqualTo(Integer value) {
            addCriterion("provid <>", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidGreaterThan(Integer value) {
            addCriterion("provid >", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("provid >=", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidLessThan(Integer value) {
            addCriterion("provid <", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidLessThanOrEqualTo(Integer value) {
            addCriterion("provid <=", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidIn(List<Integer> values) {
            addCriterion("provid in", values, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotIn(List<Integer> values) {
            addCriterion("provid not in", values, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidBetween(Integer value1, Integer value2) {
            addCriterion("provid between", value1, value2, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotBetween(Integer value1, Integer value2) {
            addCriterion("provid not between", value1, value2, "provid");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNull() {
            addCriterion("provname is null");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNotNull() {
            addCriterion("provname is not null");
            return (Criteria) this;
        }

        public Criteria andProvnameEqualTo(String value) {
            addCriterion("provname =", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotEqualTo(String value) {
            addCriterion("provname <>", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThan(String value) {
            addCriterion("provname >", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThanOrEqualTo(String value) {
            addCriterion("provname >=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThan(String value) {
            addCriterion("provname <", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThanOrEqualTo(String value) {
            addCriterion("provname <=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLike(String value) {
            addCriterion("provname like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotLike(String value) {
            addCriterion("provname not like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameIn(List<String> values) {
            addCriterion("provname in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotIn(List<String> values) {
            addCriterion("provname not in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameBetween(String value1, String value2) {
            addCriterion("provname between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotBetween(String value1, String value2) {
            addCriterion("provname not between", value1, value2, "provname");
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
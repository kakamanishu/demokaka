package com.example.demokaka.model;

import java.util.ArrayList;
import java.util.List;

public class RegulationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegulationExample() {
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

        public Criteria andRegulationIdIsNull() {
            addCriterion("Regulation_id is null");
            return (Criteria) this;
        }

        public Criteria andRegulationIdIsNotNull() {
            addCriterion("Regulation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegulationIdEqualTo(Integer value) {
            addCriterion("Regulation_id =", value, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdNotEqualTo(Integer value) {
            addCriterion("Regulation_id <>", value, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdGreaterThan(Integer value) {
            addCriterion("Regulation_id >", value, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Regulation_id >=", value, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdLessThan(Integer value) {
            addCriterion("Regulation_id <", value, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Regulation_id <=", value, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdIn(List<Integer> values) {
            addCriterion("Regulation_id in", values, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdNotIn(List<Integer> values) {
            addCriterion("Regulation_id not in", values, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdBetween(Integer value1, Integer value2) {
            addCriterion("Regulation_id between", value1, value2, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Regulation_id not between", value1, value2, "regulationId");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleIsNull() {
            addCriterion("Regulation_title is null");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleIsNotNull() {
            addCriterion("Regulation_title is not null");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleEqualTo(String value) {
            addCriterion("Regulation_title =", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleNotEqualTo(String value) {
            addCriterion("Regulation_title <>", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleGreaterThan(String value) {
            addCriterion("Regulation_title >", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Regulation_title >=", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleLessThan(String value) {
            addCriterion("Regulation_title <", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleLessThanOrEqualTo(String value) {
            addCriterion("Regulation_title <=", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleLike(String value) {
            addCriterion("Regulation_title like", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleNotLike(String value) {
            addCriterion("Regulation_title not like", value, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleIn(List<String> values) {
            addCriterion("Regulation_title in", values, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleNotIn(List<String> values) {
            addCriterion("Regulation_title not in", values, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleBetween(String value1, String value2) {
            addCriterion("Regulation_title between", value1, value2, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andRegulationTitleNotBetween(String value1, String value2) {
            addCriterion("Regulation_title not between", value1, value2, "regulationTitle");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(String value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(String value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(String value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(String value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(String value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLike(String value) {
            addCriterion("publish_time like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotLike(String value) {
            addCriterion("publish_time not like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<String> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<String> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(String value1, String value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(String value1, String value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andByMeetingIsNull() {
            addCriterion("By_Meeting is null");
            return (Criteria) this;
        }

        public Criteria andByMeetingIsNotNull() {
            addCriterion("By_Meeting is not null");
            return (Criteria) this;
        }

        public Criteria andByMeetingEqualTo(String value) {
            addCriterion("By_Meeting =", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingNotEqualTo(String value) {
            addCriterion("By_Meeting <>", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingGreaterThan(String value) {
            addCriterion("By_Meeting >", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingGreaterThanOrEqualTo(String value) {
            addCriterion("By_Meeting >=", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingLessThan(String value) {
            addCriterion("By_Meeting <", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingLessThanOrEqualTo(String value) {
            addCriterion("By_Meeting <=", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingLike(String value) {
            addCriterion("By_Meeting like", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingNotLike(String value) {
            addCriterion("By_Meeting not like", value, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingIn(List<String> values) {
            addCriterion("By_Meeting in", values, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingNotIn(List<String> values) {
            addCriterion("By_Meeting not in", values, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingBetween(String value1, String value2) {
            addCriterion("By_Meeting between", value1, value2, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andByMeetingNotBetween(String value1, String value2) {
            addCriterion("By_Meeting not between", value1, value2, "byMeeting");
            return (Criteria) this;
        }

        public Criteria andMainBodyIsNull() {
            addCriterion("main_body is null");
            return (Criteria) this;
        }

        public Criteria andMainBodyIsNotNull() {
            addCriterion("main_body is not null");
            return (Criteria) this;
        }

        public Criteria andMainBodyEqualTo(String value) {
            addCriterion("main_body =", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyNotEqualTo(String value) {
            addCriterion("main_body <>", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyGreaterThan(String value) {
            addCriterion("main_body >", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyGreaterThanOrEqualTo(String value) {
            addCriterion("main_body >=", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyLessThan(String value) {
            addCriterion("main_body <", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyLessThanOrEqualTo(String value) {
            addCriterion("main_body <=", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyLike(String value) {
            addCriterion("main_body like", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyNotLike(String value) {
            addCriterion("main_body not like", value, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyIn(List<String> values) {
            addCriterion("main_body in", values, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyNotIn(List<String> values) {
            addCriterion("main_body not in", values, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyBetween(String value1, String value2) {
            addCriterion("main_body between", value1, value2, "mainBody");
            return (Criteria) this;
        }

        public Criteria andMainBodyNotBetween(String value1, String value2) {
            addCriterion("main_body not between", value1, value2, "mainBody");
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
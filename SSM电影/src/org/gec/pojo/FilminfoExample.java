package org.gec.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FilminfoExample {
    @Override
    public String toString() {
        return "FilminfoExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilminfoExample() {
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

        public Criteria andFilmidIsNull() {
            addCriterion("FILMID is null");
            return (Criteria) this;
        }

        public Criteria andFilmidIsNotNull() {
            addCriterion("FILMID is not null");
            return (Criteria) this;
        }

        public Criteria andFilmidEqualTo(Integer value) {
            addCriterion("FILMID =", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotEqualTo(Integer value) {
            addCriterion("FILMID <>", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidGreaterThan(Integer value) {
            addCriterion("FILMID >", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILMID >=", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLessThan(Integer value) {
            addCriterion("FILMID <", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLessThanOrEqualTo(Integer value) {
            addCriterion("FILMID <=", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidIn(List<Integer> values) {
            addCriterion("FILMID in", values, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotIn(List<Integer> values) {
            addCriterion("FILMID not in", values, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidBetween(Integer value1, Integer value2) {
            addCriterion("FILMID between", value1, value2, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotBetween(Integer value1, Integer value2) {
            addCriterion("FILMID not between", value1, value2, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmnameIsNull() {
            addCriterion("FILMNAME is null");
            return (Criteria) this;
        }

        public Criteria andFilmnameIsNotNull() {
            addCriterion("FILMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilmnameEqualTo(String value) {
            addCriterion("FILMNAME =", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotEqualTo(String value) {
            addCriterion("FILMNAME <>", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameGreaterThan(String value) {
            addCriterion("FILMNAME >", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameGreaterThanOrEqualTo(String value) {
            addCriterion("FILMNAME >=", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLessThan(String value) {
            addCriterion("FILMNAME <", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLessThanOrEqualTo(String value) {
            addCriterion("FILMNAME <=", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLike(String value) {
            addCriterion("FILMNAME like", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotLike(String value) {
            addCriterion("FILMNAME not like", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameIn(List<String> values) {
            addCriterion("FILMNAME in", values, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotIn(List<String> values) {
            addCriterion("FILMNAME not in", values, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameBetween(String value1, String value2) {
            addCriterion("FILMNAME between", value1, value2, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotBetween(String value1, String value2) {
            addCriterion("FILMNAME not between", value1, value2, "filmname");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("TYPEID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("TYPEID =", value, "typeid");
            System.out.println("typeid: " + value+"****************");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("TYPEID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("TYPEID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPEID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("TYPEID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TYPEID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("TYPEID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("TYPEID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("TYPEID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPEID not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andActorIsNull() {
            addCriterion("ACTOR is null");
            return (Criteria) this;
        }

        public Criteria andActorIsNotNull() {
            addCriterion("ACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andActorEqualTo(String value) {
            addCriterion("ACTOR =", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotEqualTo(String value) {
            addCriterion("ACTOR <>", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorGreaterThan(String value) {
            addCriterion("ACTOR >", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorGreaterThanOrEqualTo(String value) {
            addCriterion("ACTOR >=", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLessThan(String value) {
            addCriterion("ACTOR <", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLessThanOrEqualTo(String value) {
            addCriterion("ACTOR <=", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLike(String value) {
            addCriterion("ACTOR like", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotLike(String value) {
            addCriterion("ACTOR not like", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorIn(List<String> values) {
            addCriterion("ACTOR in", values, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotIn(List<String> values) {
            addCriterion("ACTOR not in", values, "actor");
            return (Criteria) this;
        }

        public Criteria andActorBetween(String value1, String value2) {
            addCriterion("ACTOR between", value1, value2, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotBetween(String value1, String value2) {
            addCriterion("ACTOR not between", value1, value2, "actor");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("DIRECTOR is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("DIRECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("DIRECTOR =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("DIRECTOR <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("DIRECTOR >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTOR >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("DIRECTOR <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("DIRECTOR <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("DIRECTOR like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("DIRECTOR not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("DIRECTOR in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("DIRECTOR not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("DIRECTOR between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("DIRECTOR not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIsNull() {
            addCriterion("TICKETPRICE is null");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIsNotNull() {
            addCriterion("TICKETPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketpriceEqualTo(BigDecimal value) {
            addCriterion("TICKETPRICE =", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotEqualTo(BigDecimal value) {
            addCriterion("TICKETPRICE <>", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceGreaterThan(BigDecimal value) {
            addCriterion("TICKETPRICE >", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TICKETPRICE >=", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceLessThan(BigDecimal value) {
            addCriterion("TICKETPRICE <", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TICKETPRICE <=", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIn(List<BigDecimal> values) {
            addCriterion("TICKETPRICE in", values, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotIn(List<BigDecimal> values) {
            addCriterion("TICKETPRICE not in", values, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TICKETPRICE between", value1, value2, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TICKETPRICE not between", value1, value2, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
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
package com.zdd.risk.common.persistence.model;

import java.util.ArrayList;
import java.util.List;

public class RiskOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskOrderExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNull() {
            addCriterion("months is null");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNotNull() {
            addCriterion("months is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsEqualTo(Integer value) {
            addCriterion("months =", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotEqualTo(Integer value) {
            addCriterion("months <>", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThan(Integer value) {
            addCriterion("months >", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("months >=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThan(Integer value) {
            addCriterion("months <", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThanOrEqualTo(Integer value) {
            addCriterion("months <=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsIn(List<Integer> values) {
            addCriterion("months in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotIn(List<Integer> values) {
            addCriterion("months not in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsBetween(Integer value1, Integer value2) {
            addCriterion("months between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("months not between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("market is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("market is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(Integer value) {
            addCriterion("market =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(Integer value) {
            addCriterion("market <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(Integer value) {
            addCriterion("market >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(Integer value) {
            addCriterion("market >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(Integer value) {
            addCriterion("market <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(Integer value) {
            addCriterion("market <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<Integer> values) {
            addCriterion("market in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<Integer> values) {
            addCriterion("market not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(Integer value1, Integer value2) {
            addCriterion("market between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(Integer value1, Integer value2) {
            addCriterion("market not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("premium is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("premium is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(Integer value) {
            addCriterion("premium =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(Integer value) {
            addCriterion("premium <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(Integer value) {
            addCriterion("premium >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("premium >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(Integer value) {
            addCriterion("premium <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(Integer value) {
            addCriterion("premium <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<Integer> values) {
            addCriterion("premium in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<Integer> values) {
            addCriterion("premium not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(Integer value1, Integer value2) {
            addCriterion("premium between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("premium not between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIsNull() {
            addCriterion("free_ratio is null");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIsNotNull() {
            addCriterion("free_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andFreeRatioEqualTo(Integer value) {
            addCriterion("free_ratio =", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotEqualTo(Integer value) {
            addCriterion("free_ratio <>", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioGreaterThan(Integer value) {
            addCriterion("free_ratio >", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_ratio >=", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioLessThan(Integer value) {
            addCriterion("free_ratio <", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioLessThanOrEqualTo(Integer value) {
            addCriterion("free_ratio <=", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIn(List<Integer> values) {
            addCriterion("free_ratio in", values, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotIn(List<Integer> values) {
            addCriterion("free_ratio not in", values, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioBetween(Integer value1, Integer value2) {
            addCriterion("free_ratio between", value1, value2, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("free_ratio not between", value1, value2, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioIsNull() {
            addCriterion("surplus_ratio is null");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioIsNotNull() {
            addCriterion("surplus_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioEqualTo(Integer value) {
            addCriterion("surplus_ratio =", value, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioNotEqualTo(Integer value) {
            addCriterion("surplus_ratio <>", value, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioGreaterThan(Integer value) {
            addCriterion("surplus_ratio >", value, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_ratio >=", value, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioLessThan(Integer value) {
            addCriterion("surplus_ratio <", value, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_ratio <=", value, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioIn(List<Integer> values) {
            addCriterion("surplus_ratio in", values, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioNotIn(List<Integer> values) {
            addCriterion("surplus_ratio not in", values, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioBetween(Integer value1, Integer value2) {
            addCriterion("surplus_ratio between", value1, value2, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andSurplusRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_ratio not between", value1, value2, "surplusRatio");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNull() {
            addCriterion("guarantee is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNotNull() {
            addCriterion("guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeEqualTo(Integer value) {
            addCriterion("guarantee =", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotEqualTo(Integer value) {
            addCriterion("guarantee <>", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThan(Integer value) {
            addCriterion("guarantee >", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThanOrEqualTo(Integer value) {
            addCriterion("guarantee >=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThan(Integer value) {
            addCriterion("guarantee <", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThanOrEqualTo(Integer value) {
            addCriterion("guarantee <=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIn(List<Integer> values) {
            addCriterion("guarantee in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotIn(List<Integer> values) {
            addCriterion("guarantee not in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeBetween(Integer value1, Integer value2) {
            addCriterion("guarantee between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotBetween(Integer value1, Integer value2) {
            addCriterion("guarantee not between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andPeriodCostIsNull() {
            addCriterion("period_cost is null");
            return (Criteria) this;
        }

        public Criteria andPeriodCostIsNotNull() {
            addCriterion("period_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodCostEqualTo(Integer value) {
            addCriterion("period_cost =", value, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostNotEqualTo(Integer value) {
            addCriterion("period_cost <>", value, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostGreaterThan(Integer value) {
            addCriterion("period_cost >", value, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_cost >=", value, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostLessThan(Integer value) {
            addCriterion("period_cost <", value, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostLessThanOrEqualTo(Integer value) {
            addCriterion("period_cost <=", value, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostIn(List<Integer> values) {
            addCriterion("period_cost in", values, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostNotIn(List<Integer> values) {
            addCriterion("period_cost not in", values, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostBetween(Integer value1, Integer value2) {
            addCriterion("period_cost between", value1, value2, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodCostNotBetween(Integer value1, Integer value2) {
            addCriterion("period_cost not between", value1, value2, "periodCost");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNull() {
            addCriterion("periods is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNotNull() {
            addCriterion("periods is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsEqualTo(Byte value) {
            addCriterion("periods =", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotEqualTo(Byte value) {
            addCriterion("periods <>", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThan(Byte value) {
            addCriterion("periods >", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("periods >=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThan(Byte value) {
            addCriterion("periods <", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThanOrEqualTo(Byte value) {
            addCriterion("periods <=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsIn(List<Byte> values) {
            addCriterion("periods in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotIn(List<Byte> values) {
            addCriterion("periods not in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsBetween(Byte value1, Byte value2) {
            addCriterion("periods between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotBetween(Byte value1, Byte value2) {
            addCriterion("periods not between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsIsNull() {
            addCriterion("left_periods is null");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsIsNotNull() {
            addCriterion("left_periods is not null");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsEqualTo(Byte value) {
            addCriterion("left_periods =", value, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsNotEqualTo(Byte value) {
            addCriterion("left_periods <>", value, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsGreaterThan(Byte value) {
            addCriterion("left_periods >", value, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsGreaterThanOrEqualTo(Byte value) {
            addCriterion("left_periods >=", value, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsLessThan(Byte value) {
            addCriterion("left_periods <", value, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsLessThanOrEqualTo(Byte value) {
            addCriterion("left_periods <=", value, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsIn(List<Byte> values) {
            addCriterion("left_periods in", values, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsNotIn(List<Byte> values) {
            addCriterion("left_periods not in", values, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsBetween(Byte value1, Byte value2) {
            addCriterion("left_periods between", value1, value2, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andLeftPeriodsNotBetween(Byte value1, Byte value2) {
            addCriterion("left_periods not between", value1, value2, "leftPeriods");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostIsNull() {
            addCriterion("buyout_cost is null");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostIsNotNull() {
            addCriterion("buyout_cost is not null");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostEqualTo(Integer value) {
            addCriterion("buyout_cost =", value, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostNotEqualTo(Integer value) {
            addCriterion("buyout_cost <>", value, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostGreaterThan(Integer value) {
            addCriterion("buyout_cost >", value, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyout_cost >=", value, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostLessThan(Integer value) {
            addCriterion("buyout_cost <", value, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostLessThanOrEqualTo(Integer value) {
            addCriterion("buyout_cost <=", value, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostIn(List<Integer> values) {
            addCriterion("buyout_cost in", values, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostNotIn(List<Integer> values) {
            addCriterion("buyout_cost not in", values, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostBetween(Integer value1, Integer value2) {
            addCriterion("buyout_cost between", value1, value2, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andBuyoutCostNotBetween(Integer value1, Integer value2) {
            addCriterion("buyout_cost not between", value1, value2, "buyoutCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostIsNull() {
            addCriterion("credit_cost is null");
            return (Criteria) this;
        }

        public Criteria andCreditCostIsNotNull() {
            addCriterion("credit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCostEqualTo(Integer value) {
            addCriterion("credit_cost =", value, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostNotEqualTo(Integer value) {
            addCriterion("credit_cost <>", value, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostGreaterThan(Integer value) {
            addCriterion("credit_cost >", value, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_cost >=", value, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostLessThan(Integer value) {
            addCriterion("credit_cost <", value, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostLessThanOrEqualTo(Integer value) {
            addCriterion("credit_cost <=", value, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostIn(List<Integer> values) {
            addCriterion("credit_cost in", values, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostNotIn(List<Integer> values) {
            addCriterion("credit_cost not in", values, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostBetween(Integer value1, Integer value2) {
            addCriterion("credit_cost between", value1, value2, "creditCost");
            return (Criteria) this;
        }

        public Criteria andCreditCostNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_cost not between", value1, value2, "creditCost");
            return (Criteria) this;
        }

        public Criteria andPeriods2IsNull() {
            addCriterion("periods2 is null");
            return (Criteria) this;
        }

        public Criteria andPeriods2IsNotNull() {
            addCriterion("periods2 is not null");
            return (Criteria) this;
        }

        public Criteria andPeriods2EqualTo(Integer value) {
            addCriterion("periods2 =", value, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2NotEqualTo(Integer value) {
            addCriterion("periods2 <>", value, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2GreaterThan(Integer value) {
            addCriterion("periods2 >", value, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2GreaterThanOrEqualTo(Integer value) {
            addCriterion("periods2 >=", value, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2LessThan(Integer value) {
            addCriterion("periods2 <", value, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2LessThanOrEqualTo(Integer value) {
            addCriterion("periods2 <=", value, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2In(List<Integer> values) {
            addCriterion("periods2 in", values, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2NotIn(List<Integer> values) {
            addCriterion("periods2 not in", values, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2Between(Integer value1, Integer value2) {
            addCriterion("periods2 between", value1, value2, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriods2NotBetween(Integer value1, Integer value2) {
            addCriterion("periods2 not between", value1, value2, "periods2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2IsNull() {
            addCriterion("period_cost2 is null");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2IsNotNull() {
            addCriterion("period_cost2 is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2EqualTo(Integer value) {
            addCriterion("period_cost2 =", value, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2NotEqualTo(Integer value) {
            addCriterion("period_cost2 <>", value, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2GreaterThan(Integer value) {
            addCriterion("period_cost2 >", value, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2GreaterThanOrEqualTo(Integer value) {
            addCriterion("period_cost2 >=", value, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2LessThan(Integer value) {
            addCriterion("period_cost2 <", value, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2LessThanOrEqualTo(Integer value) {
            addCriterion("period_cost2 <=", value, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2In(List<Integer> values) {
            addCriterion("period_cost2 in", values, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2NotIn(List<Integer> values) {
            addCriterion("period_cost2 not in", values, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2Between(Integer value1, Integer value2) {
            addCriterion("period_cost2 between", value1, value2, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andPeriodCost2NotBetween(Integer value1, Integer value2) {
            addCriterion("period_cost2 not between", value1, value2, "periodCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2IsNull() {
            addCriterion("buyout_cost2 is null");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2IsNotNull() {
            addCriterion("buyout_cost2 is not null");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2EqualTo(Integer value) {
            addCriterion("buyout_cost2 =", value, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2NotEqualTo(Integer value) {
            addCriterion("buyout_cost2 <>", value, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2GreaterThan(Integer value) {
            addCriterion("buyout_cost2 >", value, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2GreaterThanOrEqualTo(Integer value) {
            addCriterion("buyout_cost2 >=", value, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2LessThan(Integer value) {
            addCriterion("buyout_cost2 <", value, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2LessThanOrEqualTo(Integer value) {
            addCriterion("buyout_cost2 <=", value, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2In(List<Integer> values) {
            addCriterion("buyout_cost2 in", values, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2NotIn(List<Integer> values) {
            addCriterion("buyout_cost2 not in", values, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2Between(Integer value1, Integer value2) {
            addCriterion("buyout_cost2 between", value1, value2, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andBuyoutCost2NotBetween(Integer value1, Integer value2) {
            addCriterion("buyout_cost2 not between", value1, value2, "buyoutCost2");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(String value) {
            addCriterion("creattime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(String value) {
            addCriterion("creattime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(String value) {
            addCriterion("creattime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("creattime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(String value) {
            addCriterion("creattime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(String value) {
            addCriterion("creattime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLike(String value) {
            addCriterion("creattime like", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotLike(String value) {
            addCriterion("creattime not like", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<String> values) {
            addCriterion("creattime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<String> values) {
            addCriterion("creattime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(String value1, String value2) {
            addCriterion("creattime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(String value1, String value2) {
            addCriterion("creattime not between", value1, value2, "creattime");
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
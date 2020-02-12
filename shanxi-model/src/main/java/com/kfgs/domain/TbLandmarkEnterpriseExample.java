package com.kfgs.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLandmarkEnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLandmarkEnterpriseExample() {
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

        public Criteria andEnterpriseIsNull() {
            addCriterion("enterprise is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIsNotNull() {
            addCriterion("enterprise is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEqualTo(String value) {
            addCriterion("enterprise =", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotEqualTo(String value) {
            addCriterion("enterprise <>", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGreaterThan(String value) {
            addCriterion("enterprise >", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise >=", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLessThan(String value) {
            addCriterion("enterprise <", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("enterprise <=", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLike(String value) {
            addCriterion("enterprise like", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotLike(String value) {
            addCriterion("enterprise not like", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIn(List<String> values) {
            addCriterion("enterprise in", values, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotIn(List<String> values) {
            addCriterion("enterprise not in", values, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBetween(String value1, String value2) {
            addCriterion("enterprise between", value1, value2, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotBetween(String value1, String value2) {
            addCriterion("enterprise not between", value1, value2, "enterprise");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNull() {
            addCriterion("trademark is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNotNull() {
            addCriterion("trademark is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkEqualTo(String value) {
            addCriterion("trademark =", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotEqualTo(String value) {
            addCriterion("trademark <>", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThan(String value) {
            addCriterion("trademark >", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("trademark >=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThan(String value) {
            addCriterion("trademark <", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThanOrEqualTo(String value) {
            addCriterion("trademark <=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLike(String value) {
            addCriterion("trademark like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotLike(String value) {
            addCriterion("trademark not like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkIn(List<String> values) {
            addCriterion("trademark in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotIn(List<String> values) {
            addCriterion("trademark not in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkBetween(String value1, String value2) {
            addCriterion("trademark between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotBetween(String value1, String value2) {
            addCriterion("trademark not between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberIsNull() {
            addCriterion("bulletin_number is null");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberIsNotNull() {
            addCriterion("bulletin_number is not null");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberEqualTo(String value) {
            addCriterion("bulletin_number =", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberNotEqualTo(String value) {
            addCriterion("bulletin_number <>", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberGreaterThan(String value) {
            addCriterion("bulletin_number >", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bulletin_number >=", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberLessThan(String value) {
            addCriterion("bulletin_number <", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberLessThanOrEqualTo(String value) {
            addCriterion("bulletin_number <=", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberLike(String value) {
            addCriterion("bulletin_number like", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberNotLike(String value) {
            addCriterion("bulletin_number not like", value, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberIn(List<String> values) {
            addCriterion("bulletin_number in", values, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberNotIn(List<String> values) {
            addCriterion("bulletin_number not in", values, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberBetween(String value1, String value2) {
            addCriterion("bulletin_number between", value1, value2, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andBulletinNumberNotBetween(String value1, String value2) {
            addCriterion("bulletin_number not between", value1, value2, "bulletinNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNull() {
            addCriterion("approval_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(String value) {
            addCriterion("approval_time =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(String value) {
            addCriterion("approval_time <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(String value) {
            addCriterion("approval_time >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("approval_time >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(String value) {
            addCriterion("approval_time <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(String value) {
            addCriterion("approval_time <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLike(String value) {
            addCriterion("approval_time like", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotLike(String value) {
            addCriterion("approval_time not like", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<String> values) {
            addCriterion("approval_time in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<String> values) {
            addCriterion("approval_time not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(String value1, String value2) {
            addCriterion("approval_time between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(String value1, String value2) {
            addCriterion("approval_time not between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionIsNull() {
            addCriterion("approval_institution is null");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionIsNotNull() {
            addCriterion("approval_institution is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionEqualTo(String value) {
            addCriterion("approval_institution =", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionNotEqualTo(String value) {
            addCriterion("approval_institution <>", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionGreaterThan(String value) {
            addCriterion("approval_institution >", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("approval_institution >=", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionLessThan(String value) {
            addCriterion("approval_institution <", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionLessThanOrEqualTo(String value) {
            addCriterion("approval_institution <=", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionLike(String value) {
            addCriterion("approval_institution like", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionNotLike(String value) {
            addCriterion("approval_institution not like", value, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionIn(List<String> values) {
            addCriterion("approval_institution in", values, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionNotIn(List<String> values) {
            addCriterion("approval_institution not in", values, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionBetween(String value1, String value2) {
            addCriterion("approval_institution between", value1, value2, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andApprovalInstitutionNotBetween(String value1, String value2) {
            addCriterion("approval_institution not between", value1, value2, "approvalInstitution");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeIsNull() {
            addCriterion("uniform_social_credit_code is null");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeIsNotNull() {
            addCriterion("uniform_social_credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeEqualTo(String value) {
            addCriterion("uniform_social_credit_code =", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeNotEqualTo(String value) {
            addCriterion("uniform_social_credit_code <>", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeGreaterThan(String value) {
            addCriterion("uniform_social_credit_code >", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("uniform_social_credit_code >=", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeLessThan(String value) {
            addCriterion("uniform_social_credit_code <", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("uniform_social_credit_code <=", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeLike(String value) {
            addCriterion("uniform_social_credit_code like", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeNotLike(String value) {
            addCriterion("uniform_social_credit_code not like", value, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeIn(List<String> values) {
            addCriterion("uniform_social_credit_code in", values, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeNotIn(List<String> values) {
            addCriterion("uniform_social_credit_code not in", values, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeBetween(String value1, String value2) {
            addCriterion("uniform_social_credit_code between", value1, value2, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniformSocialCreditCodeNotBetween(String value1, String value2) {
            addCriterion("uniform_social_credit_code not between", value1, value2, "uniformSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeIsNull() {
            addCriterion("corporate_representative is null");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeIsNotNull() {
            addCriterion("corporate_representative is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeEqualTo(String value) {
            addCriterion("corporate_representative =", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeNotEqualTo(String value) {
            addCriterion("corporate_representative <>", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeGreaterThan(String value) {
            addCriterion("corporate_representative >", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_representative >=", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeLessThan(String value) {
            addCriterion("corporate_representative <", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("corporate_representative <=", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeLike(String value) {
            addCriterion("corporate_representative like", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeNotLike(String value) {
            addCriterion("corporate_representative not like", value, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeIn(List<String> values) {
            addCriterion("corporate_representative in", values, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeNotIn(List<String> values) {
            addCriterion("corporate_representative not in", values, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeBetween(String value1, String value2) {
            addCriterion("corporate_representative between", value1, value2, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andCorporateRepresentativeNotBetween(String value1, String value2) {
            addCriterion("corporate_representative not between", value1, value2, "corporateRepresentative");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityIsNull() {
            addCriterion("period_of_validity is null");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityIsNotNull() {
            addCriterion("period_of_validity is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityEqualTo(String value) {
            addCriterion("period_of_validity =", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityNotEqualTo(String value) {
            addCriterion("period_of_validity <>", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityGreaterThan(String value) {
            addCriterion("period_of_validity >", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityGreaterThanOrEqualTo(String value) {
            addCriterion("period_of_validity >=", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityLessThan(String value) {
            addCriterion("period_of_validity <", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityLessThanOrEqualTo(String value) {
            addCriterion("period_of_validity <=", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityLike(String value) {
            addCriterion("period_of_validity like", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityNotLike(String value) {
            addCriterion("period_of_validity not like", value, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityIn(List<String> values) {
            addCriterion("period_of_validity in", values, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityNotIn(List<String> values) {
            addCriterion("period_of_validity not in", values, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityBetween(String value1, String value2) {
            addCriterion("period_of_validity between", value1, value2, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodOfValidityNotBetween(String value1, String value2) {
            addCriterion("period_of_validity not between", value1, value2, "periodOfValidity");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(String value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(String value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(String value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(String value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLike(String value) {
            addCriterion("enterprise_id like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotLike(String value) {
            addCriterion("enterprise_id not like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<String> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<String> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(String value1, String value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNull() {
            addCriterion("classification_id is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNotNull() {
            addCriterion("classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdEqualTo(String value) {
            addCriterion("classification_id =", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotEqualTo(String value) {
            addCriterion("classification_id <>", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThan(String value) {
            addCriterion("classification_id >", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("classification_id >=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThan(String value) {
            addCriterion("classification_id <", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThanOrEqualTo(String value) {
            addCriterion("classification_id <=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLike(String value) {
            addCriterion("classification_id like", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotLike(String value) {
            addCriterion("classification_id not like", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIn(List<String> values) {
            addCriterion("classification_id in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotIn(List<String> values) {
            addCriterion("classification_id not in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdBetween(String value1, String value2) {
            addCriterion("classification_id between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotBetween(String value1, String value2) {
            addCriterion("classification_id not between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdIsNull() {
            addCriterion("administrative_id is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdIsNotNull() {
            addCriterion("administrative_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdEqualTo(String value) {
            addCriterion("administrative_id =", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdNotEqualTo(String value) {
            addCriterion("administrative_id <>", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdGreaterThan(String value) {
            addCriterion("administrative_id >", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdGreaterThanOrEqualTo(String value) {
            addCriterion("administrative_id >=", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdLessThan(String value) {
            addCriterion("administrative_id <", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdLessThanOrEqualTo(String value) {
            addCriterion("administrative_id <=", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdLike(String value) {
            addCriterion("administrative_id like", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdNotLike(String value) {
            addCriterion("administrative_id not like", value, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdIn(List<String> values) {
            addCriterion("administrative_id in", values, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdNotIn(List<String> values) {
            addCriterion("administrative_id not in", values, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdBetween(String value1, String value2) {
            addCriterion("administrative_id between", value1, value2, "administrativeId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeIdNotBetween(String value1, String value2) {
            addCriterion("administrative_id not between", value1, value2, "administrativeId");
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
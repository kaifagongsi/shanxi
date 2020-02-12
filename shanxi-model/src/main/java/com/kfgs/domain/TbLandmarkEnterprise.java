package com.kfgs.domain;

import java.io.Serializable;
import java.util.Date;

public class TbLandmarkEnterprise implements Serializable {
    private Integer id;

    private String productName;

    private String enterprise;

    private String address;

    private String trademark;

    private String batch;

    private String bulletinNumber;

    private String approvalTime;

    private String approvalInstitution;

    private String uniformSocialCreditCode;

    private String corporateRepresentative;

    private String periodOfValidity;

    private Date createTime;

    private Integer isdelete;

    private String productId;

    private String enterpriseId;

    private String classificationId;

    private String administrativeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise == null ? null : enterprise.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark == null ? null : trademark.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getBulletinNumber() {
        return bulletinNumber;
    }

    public void setBulletinNumber(String bulletinNumber) {
        this.bulletinNumber = bulletinNumber == null ? null : bulletinNumber.trim();
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime == null ? null : approvalTime.trim();
    }

    public String getApprovalInstitution() {
        return approvalInstitution;
    }

    public void setApprovalInstitution(String approvalInstitution) {
        this.approvalInstitution = approvalInstitution == null ? null : approvalInstitution.trim();
    }

    public String getUniformSocialCreditCode() {
        return uniformSocialCreditCode;
    }

    public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
        this.uniformSocialCreditCode = uniformSocialCreditCode == null ? null : uniformSocialCreditCode.trim();
    }

    public String getCorporateRepresentative() {
        return corporateRepresentative;
    }

    public void setCorporateRepresentative(String corporateRepresentative) {
        this.corporateRepresentative = corporateRepresentative == null ? null : corporateRepresentative.trim();
    }

    public String getPeriodOfValidity() {
        return periodOfValidity;
    }

    public void setPeriodOfValidity(String periodOfValidity) {
        this.periodOfValidity = periodOfValidity == null ? null : periodOfValidity.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId == null ? null : classificationId.trim();
    }

    public String getAdministrativeId() {
        return administrativeId;
    }

    public void setAdministrativeId(String administrativeId) {
        this.administrativeId = administrativeId == null ? null : administrativeId.trim();
    }
}
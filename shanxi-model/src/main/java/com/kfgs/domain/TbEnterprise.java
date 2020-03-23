package com.kfgs.domain;

import java.io.Serializable;
import java.util.Date;

public class TbEnterprise implements Serializable {
    private Integer id;

    private String enterpriseName;

    private String enterpriseAddress;

    private String administrativeId;

    private Integer productId;

    private Date createTime;

    private Integer isdelete;

    private String brand;

    private String corporateRepresentative;

    private String approvalAnnouncementNoEnterprise;

    private String uniformSocialCreditCode;

    private String approvalAuthorityEnterprise;

    private String approvalYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress == null ? null : enterpriseAddress.trim();
    }

    public String getAdministrativeId() {
        return administrativeId;
    }

    public void setAdministrativeId(String administrativeId) {
        this.administrativeId = administrativeId == null ? null : administrativeId.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCorporateRepresentative() {
        return corporateRepresentative;
    }

    public void setCorporateRepresentative(String corporateRepresentative) {
        this.corporateRepresentative = corporateRepresentative == null ? null : corporateRepresentative.trim();
    }

    public String getApprovalAnnouncementNoEnterprise() {
        return approvalAnnouncementNoEnterprise;
    }

    public void setApprovalAnnouncementNoEnterprise(String approvalAnnouncementNoEnterprise) {
        this.approvalAnnouncementNoEnterprise = approvalAnnouncementNoEnterprise == null ? null : approvalAnnouncementNoEnterprise.trim();
    }

    public String getUniformSocialCreditCode() {
        return uniformSocialCreditCode;
    }

    public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
        this.uniformSocialCreditCode = uniformSocialCreditCode == null ? null : uniformSocialCreditCode.trim();
    }

    public String getApprovalAuthorityEnterprise() {
        return approvalAuthorityEnterprise;
    }

    public void setApprovalAuthorityEnterprise(String approvalAuthorityEnterprise) {
        this.approvalAuthorityEnterprise = approvalAuthorityEnterprise == null ? null : approvalAuthorityEnterprise.trim();
    }

    public String getApprovalYear() {
        return approvalYear;
    }

    public void setApprovalYear(String approvalYear) {
        this.approvalYear = approvalYear == null ? null : approvalYear.trim();
    }
}
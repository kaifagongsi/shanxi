package com.kfgs.domain;

import java.io.Serializable;
import java.util.Date;

public class TbEnterprise implements Serializable {
    private Integer id;

    private String name;

    private String address;

    private String administrativeInterval;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAdministrativeInterval() {
        return administrativeInterval;
    }

    public void setAdministrativeInterval(String administrativeInterval) {
        this.administrativeInterval = administrativeInterval == null ? null : administrativeInterval.trim();
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
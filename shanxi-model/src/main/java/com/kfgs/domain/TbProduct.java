package com.kfgs.domain;

import java.util.Date;

public class TbProduct {
    private Integer id;

    private String name;

    private String classificationid;

    private String administrativeArea;

    private Date createTime;

    private Integer isdelete;

    private String approvalYear;

    private String approvalAuthorityProduct;

    private String approvalAnnouncementNoProduct;

    private String provinceName;

    private String cityName;

    private String preliminaryExaminationBody;

    private String applicantOrganization;

    private String protectionScope;

    private String documentDefiningTheScopeOfProtection;

    private String technicalSpecifications;

    private String useOfSpecialSigns;

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

    public String getClassificationid() {
        return classificationid;
    }

    public void setClassificationid(String classificationid) {
        this.classificationid = classificationid == null ? null : classificationid.trim();
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea == null ? null : administrativeArea.trim();
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

    public String getApprovalYear() {
        return approvalYear;
    }

    public void setApprovalYear(String approvalYear) {
        this.approvalYear = approvalYear == null ? null : approvalYear.trim();
    }

    public String getApprovalAuthorityProduct() {
        return approvalAuthorityProduct;
    }

    public void setApprovalAuthorityProduct(String approvalAuthorityProduct) {
        this.approvalAuthorityProduct = approvalAuthorityProduct == null ? null : approvalAuthorityProduct.trim();
    }

    public String getApprovalAnnouncementNoProduct() {
        return approvalAnnouncementNoProduct;
    }

    public void setApprovalAnnouncementNoProduct(String approvalAnnouncementNoProduct) {
        this.approvalAnnouncementNoProduct = approvalAnnouncementNoProduct == null ? null : approvalAnnouncementNoProduct.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getPreliminaryExaminationBody() {
        return preliminaryExaminationBody;
    }

    public void setPreliminaryExaminationBody(String preliminaryExaminationBody) {
        this.preliminaryExaminationBody = preliminaryExaminationBody == null ? null : preliminaryExaminationBody.trim();
    }

    public String getApplicantOrganization() {
        return applicantOrganization;
    }

    public void setApplicantOrganization(String applicantOrganization) {
        this.applicantOrganization = applicantOrganization == null ? null : applicantOrganization.trim();
    }

    public String getProtectionScope() {
        return protectionScope;
    }

    public void setProtectionScope(String protectionScope) {
        this.protectionScope = protectionScope == null ? null : protectionScope.trim();
    }

    public String getDocumentDefiningTheScopeOfProtection() {
        return documentDefiningTheScopeOfProtection;
    }

    public void setDocumentDefiningTheScopeOfProtection(String documentDefiningTheScopeOfProtection) {
        this.documentDefiningTheScopeOfProtection = documentDefiningTheScopeOfProtection == null ? null : documentDefiningTheScopeOfProtection.trim();
    }

    public String getTechnicalSpecifications() {
        return technicalSpecifications;
    }

    public void setTechnicalSpecifications(String technicalSpecifications) {
        this.technicalSpecifications = technicalSpecifications == null ? null : technicalSpecifications.trim();
    }

    public String getUseOfSpecialSigns() {
        return useOfSpecialSigns;
    }

    public void setUseOfSpecialSigns(String useOfSpecialSigns) {
        this.useOfSpecialSigns = useOfSpecialSigns == null ? null : useOfSpecialSigns.trim();
    }
}
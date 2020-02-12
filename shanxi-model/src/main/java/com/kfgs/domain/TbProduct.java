package com.kfgs.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class TbProduct implements Serializable {
    private Integer id;

    private String name;

    private String enterpriseid;

    private String approvalYear;

    private String classificationid;

    private String administrativeArea;

    private Date createTime;

    private Integer isdelete;

    private String approvalAuthorityProduct;

    private String approvalAnnouncementNoProduct;

    private String provinceName;

    private String cityName;

    public TbProduct(){}


    public TbProduct(TbProduct tbProduct){
        this.id = tbProduct.id;
        this.name = tbProduct.getName();
        this.enterpriseid = tbProduct.getEnterpriseid();
        this.approvalYear = tbProduct.getApprovalYear();
        this.classificationid = tbProduct.getClassificationid();
        this.administrativeArea = tbProduct.getAdministrativeArea();
        this.createTime = tbProduct.getCreateTime();
        this.isdelete = tbProduct.getIsdelete();
        this.approvalAuthorityProduct = tbProduct.getApprovalAuthorityProduct();
        this.approvalAnnouncementNoProduct = tbProduct.getApprovalAnnouncementNoProduct();
        this.provinceName = tbProduct.getProvinceName();
        this.cityName = tbProduct.getCityName();
    }


}
package com.tht.demo.model;

import java.util.Date;

public class ReportIntegration implements java.io.Serializable {
    private static final long serialVersionUID = -7157903388989370796L;
    private Integer id;

    private String appid;

    private String productno;

    private String ikangno;

    private Integer attachmentReceived;

    private String attachmentMd5;

    private Integer dataReceived;

    private String dataMd5;

    private Integer isprime;

    private Integer checkedstatus;

    private Integer status;

    private Date createTime;

    private Date opTime;

    private Date attachmentReceiveTime;

    private Date dataReceiveTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public String getIkangno() {
        return ikangno;
    }

    public void setIkangno(String ikangno) {
        this.ikangno = ikangno;
    }

    public Integer getAttachmentReceived() {
        return attachmentReceived;
    }

    public void setAttachmentReceived(Integer attachmentReceived) {
        this.attachmentReceived = attachmentReceived;
    }

    public String getAttachmentMd5() {
        return attachmentMd5;
    }

    public void setAttachmentMd5(String attachmentMd5) {
        this.attachmentMd5 = attachmentMd5;
    }

    public Integer getDataReceived() {
        return dataReceived;
    }

    public void setDataReceived(Integer dataReceived) {
        this.dataReceived = dataReceived;
    }

    public String getDataMd5() {
        return dataMd5;
    }

    public void setDataMd5(String dataMd5) {
        this.dataMd5 = dataMd5;
    }

    public Integer getIsprime() {
        return isprime;
    }

    public void setIsprime(Integer isprime) {
        this.isprime = isprime;
    }

    public Integer getCheckedstatus() {
        return checkedstatus;
    }

    public void setCheckedstatus(Integer checkedstatus) {
        this.checkedstatus = checkedstatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public Date getAttachmentReceiveTime() {
        return attachmentReceiveTime;
    }

    public void setAttachmentReceiveTime(Date attachmentReceiveTime) {
        this.attachmentReceiveTime = attachmentReceiveTime;
    }

    public Date getDataReceiveTime() {
        return dataReceiveTime;
    }

    public void setDataReceiveTime(Date dataReceiveTime) {
        this.dataReceiveTime = dataReceiveTime;
    }
}
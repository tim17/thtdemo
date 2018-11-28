package com.tht.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "查询条件对象", description = "报告完整性记录查询条件")
public class ReportIntegrationDto implements java.io.Serializable {


    private static final long serialVersionUID = -1279883536448920692L;

    @ApiModelProperty(hidden = true)
    private Long id;
    @ApiModelProperty(value = "第三方app_key", name = "appid")
    private String appid;
    @ApiModelProperty(value = "报告版本", name = "productno")
    private String productno;
    @ApiModelProperty(value = "iKang报告唯一编码", name = "ikangno")
    private String ikangno;
    @ApiModelProperty(hidden = true)
    private Long attachmentReceived;
    @ApiModelProperty(hidden = true)
    private String attachmentMd5;
    @ApiModelProperty(hidden = true)
    private Long dataReceived;
    @ApiModelProperty(hidden = true)
    private String dataMd5;
    @ApiModelProperty(value = "版本最高标识", name = "isprime", example = "0")
    private Long isprime;
    @ApiModelProperty(value = "报告验证结果标识", name = "checkedstatus", example = "0")
    private Long checkedstatus;
    @ApiModelProperty(value = "状态", name = "status", example = "1")
    private Long status;
    @ApiModelProperty(hidden = true)
    private Date createTime;
    @ApiModelProperty(hidden = true)
    private Date opTime;
    @ApiModelProperty(hidden = true)
    private Date attachmentReceiveTime;
    @ApiModelProperty(hidden = true)
    private Date dataReceiveTime;
    @ApiModelProperty(value = "查询时间范围 起始时间", name = "startTime")
    private String startTime;
    @ApiModelProperty(value = "查询时间范围 结束时间", name = "endTime")
    private String endTime;
    @ApiModelProperty(hidden = true)
    private String thirdName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getAttachmentReceived() {
        return attachmentReceived;
    }

    public void setAttachmentReceived(Long attachmentReceived) {
        this.attachmentReceived = attachmentReceived;
    }

    public String getAttachmentMd5() {
        return attachmentMd5;
    }

    public void setAttachmentMd5(String attachmentMd5) {
        this.attachmentMd5 = attachmentMd5;
    }

    public Long getDataReceived() {
        return dataReceived;
    }

    public void setDataReceived(Long dataReceived) {
        this.dataReceived = dataReceived;
    }

    public String getDataMd5() {
        return dataMd5;
    }

    public void setDataMd5(String dataMd5) {
        this.dataMd5 = dataMd5;
    }

    public Long getIsprime() {
        return isprime;
    }

    public void setIsprime(Long isprime) {
        this.isprime = isprime;
    }

    public Long getCheckedstatus() {
        return checkedstatus;
    }

    public void setCheckedstatus(Long checkedstatus) {
        this.checkedstatus = checkedstatus;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
}

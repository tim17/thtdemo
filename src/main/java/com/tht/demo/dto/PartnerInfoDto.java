package com.tht.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "查询条件对象", description = "第三方信息查询条件")
public class PartnerInfoDto implements java.io.Serializable {


    private static final long serialVersionUID = 182122318652450152L;
    @ApiModelProperty(hidden = true)
    private Integer id;
    @ApiModelProperty(hidden = true)
    private String thirdName;
    @ApiModelProperty(value = "第三方app_key", name = "thirdAppKey")
    private String thirdAppKey;
    @ApiModelProperty(hidden = true)
    private String saltKey;
    @ApiModelProperty(hidden = true)
    private Integer printType;
    @ApiModelProperty(hidden = true)
    private String alarmEmail;
    @ApiModelProperty(hidden = true)
    private String reportParser;
    @ApiModelProperty(hidden = true)
    private Date createdOn;
    @ApiModelProperty(hidden = true)
    private Integer createdBy;
    @ApiModelProperty(hidden = true)
    private String createdUserName;
    @ApiModelProperty(hidden = true)
    private Date updateOn;
    @ApiModelProperty(hidden = true)
    private Integer updateBy;
    @ApiModelProperty(hidden = true)
    private String updateUserName;
    @ApiModelProperty(hidden = true)
    private List<ReportIntegrationDto> reportIntegrationDtos;

    public List<ReportIntegrationDto> getReportIntegrationDtos() {
        return reportIntegrationDtos;
    }

    public void setReportIntegrationDtos(List<ReportIntegrationDto> reportIntegrationDtos) {
        this.reportIntegrationDtos = reportIntegrationDtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getThirdAppKey() {
        return thirdAppKey;
    }

    public void setThirdAppKey(String thirdAppKey) {
        this.thirdAppKey = thirdAppKey;
    }

    public String getSaltKey() {
        return saltKey;
    }

    public void setSaltKey(String saltKey) {
        this.saltKey = saltKey;
    }

    public Integer getPrintType() {
        return printType;
    }

    public void setPrintType(Integer printType) {
        this.printType = printType;
    }

    public String getAlarmEmail() {
        return alarmEmail;
    }

    public void setAlarmEmail(String alarmEmail) {
        this.alarmEmail = alarmEmail;
    }

    public String getReportParser() {
        return reportParser;
    }

    public void setReportParser(String reportParser) {
        this.reportParser = reportParser;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }
}

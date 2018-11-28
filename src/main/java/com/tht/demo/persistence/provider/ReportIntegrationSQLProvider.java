package com.tht.demo.persistence.provider;

import com.tht.demo.dto.ReportIntegrationDto;
import com.tht.demo.model.ReportIntegration;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Objects;

public class ReportIntegrationSQLProvider {

    /**
     * select reportIntegration
     *
     * @param reportIntegrationDto
     * @return
     */
    public String select(ReportIntegrationDto reportIntegrationDto) {
        return new SQL() {
            {
                SELECT("mis_report_integration.*,mis_partner_info.third_name");
                FROM("mis_report_integration,mis_partner_info");
                WHERE("mis_report_integration.appid = mis_partner_info.third_app_key");
                if (StringUtils.isNotBlank(reportIntegrationDto.getAppid())) {
                    WHERE("appid = #{appid}");
                }
                if (StringUtils.isNotBlank(reportIntegrationDto.getProductno())) {
                    WHERE("productno = #{productno}");
                }
                if (StringUtils.isNotBlank(reportIntegrationDto.getIkangno())) {
                    WHERE("ikangno = #{ikangno}");
                }
                if (Objects.nonNull(reportIntegrationDto.getAttachmentReceived())) {
                    WHERE("attachment_received = #{attachmentReceived}");
                }
                if (Objects.nonNull(reportIntegrationDto.getDataReceived())) {
                    WHERE("data_received = #{dataReceived}");
                }
                if (Objects.nonNull(reportIntegrationDto.getIsprime())) {
                    WHERE("isprime = #{isprime}");
                }
                if (Objects.nonNull(reportIntegrationDto.getCheckedstatus())) {
                    WHERE("checkedstatus = #{checkedstatus}");
                }
                if (Objects.nonNull(reportIntegrationDto.getStatus())) {
                    WHERE("status = #{status}");
                }
                if (StringUtils.isNotBlank(reportIntegrationDto.getStartTime()) && StringUtils.isNotBlank(reportIntegrationDto.getEndTime())) {
                    WHERE("op_time between #{startTime} and #{endTime} ");
                }
                ORDER_BY("mis_report_integration.id desc");
            }
        }.toString();
    }


    /**
     * insert reportIntegration
     *
     * @param reportIntegration
     * @return
     */
    public String insert(ReportIntegration reportIntegration) {
        return new SQL() {
            {
                INSERT_INTO("mis_report_integration");
                VALUES("appid", "#{appid}");
                VALUES("productno", "#{productno}");
                VALUES("ikangno", "#{ikangno}");
                VALUES("attachment_received", "#{attachmentReceived}");
                VALUES("data_received", "#{dataReceived}");
                VALUES("isprime", "#{isprime}");
                VALUES("checkedstatus", "#{checkedstatus}");
                VALUES("status", "#{status}");
                if (StringUtils.isNotBlank(reportIntegration.getAttachmentMd5())) {
                    VALUES("attachment_md5", "#{attachmentMd5}");
                }
                if (StringUtils.isNotBlank(reportIntegration.getDataMd5())) {
                    VALUES("data_md5", "#{dataMd5}");
                }
                if (Objects.nonNull(reportIntegration.getCreateTime())) {
                    VALUES("create_time", "#{createTime}");
                }
                if (Objects.nonNull(reportIntegration.getOpTime())) {
                    VALUES("op_time", "#{opTime}");
                }
                if (Objects.nonNull(reportIntegration.getAttachmentReceiveTime())) {
                    VALUES("attachment_receive_time", "#{attachmentReceiveTime}");
                }
                if (Objects.nonNull(reportIntegration.getDataReceiveTime())) {
                    VALUES("data_receive_time", "#{dataReceiveTime}");
                }
            }
        }.toString();
    }


    /**
     * update reportIntegration
     *
     * @param reportIntegration
     * @return
     */
    public String update(ReportIntegration reportIntegration) {
        return new SQL() {
            {
                UPDATE("mis_report_integration");
                if (Objects.nonNull(reportIntegration.getAttachmentReceived())) {
                    SET("attachment_received = #{attachmentReceived}");
                }
                if (Objects.nonNull(reportIntegration.getDataReceived())) {
                    SET("data_received = #{dataReceived}");
                }
                if (Objects.nonNull(reportIntegration.getIsprime())) {
                    SET("isprime = #{isprime}");
                }
                if (Objects.nonNull(reportIntegration.getCheckedstatus())) {
                    SET("checkedstatus = #{checkedstatus}");
                }
                if (Objects.nonNull(reportIntegration.getStatus())) {
                    SET("status = #{status}");
                }
                if (StringUtils.isNotBlank(reportIntegration.getAttachmentMd5())) {
                    SET("attachment_md5 = #{attachmentMd5}");
                }
                if (StringUtils.isNotBlank(reportIntegration.getDataMd5())) {
                    SET("data_md5 = #{dataMd5}");
                }
                if (Objects.nonNull(reportIntegration.getCreateTime())) {
                    SET("create_time = #{createTime}");
                }
                if (Objects.nonNull(reportIntegration.getOpTime())) {
                    SET("op_time = #{opTime}");
                }
                if (Objects.nonNull(reportIntegration.getAttachmentReceiveTime())) {
                    SET("attachment_receive_time = #{attachmentReceiveTime}");
                }
                if (Objects.nonNull(reportIntegration.getDataReceiveTime())) {
                    SET("data_receive_time = #{dataReceiveTime}");
                }
                WHERE("ID = #{id}");
            }
        }.toString();
    }


}

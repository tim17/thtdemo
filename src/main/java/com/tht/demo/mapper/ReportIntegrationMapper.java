package com.tht.demo.mapper;

import com.tht.demo.dto.ReportIntegrationDto;
import com.tht.demo.model.ReportIntegration;
import com.tht.demo.persistence.provider.ReportIntegrationSQLProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReportIntegrationMapper {

    /**
     * find list
     *
     * @param reportIntegrationDto
     * @return
     */
    @SelectProvider(type = ReportIntegrationSQLProvider.class, method = "select")
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "appid", column = "appid"),
            @Result(property = "productno", column = "productno"),
            @Result(property = "ikangno", column = "ikangno"),
            @Result(property = "attachmentReceived", column = "attachment_received"),
            @Result(property = "attachmentMd5", column = "attachment_md5"),
            @Result(property = "dataReceived", column = "data_received"),
            @Result(property = "dataMd5", column = "data_md5"),
            @Result(property = "isprime", column = "isprime"),
            @Result(property = "checkedstatus", column = "checkedstatus"),
            @Result(property = "status", column = "status"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "opTime", column = "op_time"),
            @Result(property = "attachmentReceiveTime", column = "attachment_receive_time"),
            @Result(property = "dataReceiveTime", column = "data_receive_time")})
    public List<ReportIntegrationDto> findList(ReportIntegrationDto reportIntegrationDto);

    /**
     * find by id
     *
     * @param id
     * @return
     */
    @Select({
            "select * from mis_report_integration where id=#{id}"})
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "appid", column = "appid"),
            @Result(property = "productno", column = "productno"),
            @Result(property = "ikangno", column = "ikangno"),
            @Result(property = "attachmentReceived", column = "attachment_received"),
            @Result(property = "attachmentMd5", column = "attachment_md5"),
            @Result(property = "dataReceived", column = "data_received"),
            @Result(property = "dataMd5", column = "data_md5"),
            @Result(property = "isprime", column = "isprime"),
            @Result(property = "checkedstatus", column = "checkedstatus"),
            @Result(property = "status", column = "status"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "opTime", column = "op_time"),
            @Result(property = "attachmentReceiveTime", column = "attachment_receive_time"),
            @Result(property = "dataReceiveTime", column = "data_receive_time")})
    public ReportIntegration findById(@Param("id") Long id);


    /**
     * find by appid
     *
     * @param appid
     * @return
     */
    @Select({
            "select * from mis_report_integration where appid=#{appid}"})
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "appid", column = "appid"),
            @Result(property = "productno", column = "productno"),
            @Result(property = "ikangno", column = "ikangno"),
            @Result(property = "attachmentReceived", column = "attachment_received"),
            @Result(property = "attachmentMd5", column = "attachment_md5"),
            @Result(property = "dataReceived", column = "data_received"),
            @Result(property = "dataMd5", column = "data_md5"),
            @Result(property = "isprime", column = "isprime"),
            @Result(property = "checkedstatus", column = "checkedstatus"),
            @Result(property = "status", column = "status"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "opTime", column = "op_time"),
            @Result(property = "attachmentReceiveTime", column = "attachment_receive_time"),
            @Result(property = "dataReceiveTime", column = "data_receive_time")})
    public ReportIntegration findByAppId(@Param("appid") String appid);

    /**
     * add new reportIntegration
     *
     * @param reportIntegration
     */
    @InsertProvider(type = ReportIntegrationSQLProvider.class, method = "insert")
    public void insert(ReportIntegration reportIntegration) throws Exception;


    /**
     * update reportIntegration
     *
     * @param reportIntegration
     */
    @UpdateProvider(type = ReportIntegrationSQLProvider.class, method = "update")
    public void update(ReportIntegration reportIntegration);

}
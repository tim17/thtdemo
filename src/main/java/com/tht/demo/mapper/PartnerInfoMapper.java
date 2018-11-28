package com.tht.demo.mapper;

import com.tht.demo.dto.PartnerInfoDto;
import com.tht.demo.persistence.provider.PartnerInfoSQLProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PartnerInfoMapper {

    /**
     * find list
     *
     * @param partnerInfoDto
     * @return
     */
    @SelectProvider(type = PartnerInfoSQLProvider.class, method = "select")
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "thirdName", column = "third_name"),
            @Result(property = "thirdAppKey", column = "third_app_key"),
            @Result(property = "saltKey", column = "salt_key"),
            @Result(property = "printType", column = "print_type"),
            @Result(property = "alarmEmail", column = "alarm_email"),
            @Result(property = "reportParser", column = "report_parser"),
            @Result(property = "createdOn", column = "created_on"),
            @Result(property = "createdBy", column = "created_by"),
            @Result(property = "createdUserName", column = "created_user_name"),
            @Result(property = "updateOn", column = "update_on"),
            @Result(property = "updateBy", column = "update_by"),
            @Result(property = "updateUserName", column = "update_user_name"),
            @Result(property = "reportIntegrationDtos", column = "third_app_key",
                    many = @Many(select = "com.tht.demo.mapper.ReportIntegrationMapper.findByAppId"))
    })
    public List<PartnerInfoDto> findList(PartnerInfoDto partnerInfoDto);

}
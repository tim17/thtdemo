package com.tht.demo.persistence.provider;

import com.tht.demo.dto.PartnerInfoDto;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Objects;

public class PartnerInfoSQLProvider {

    /**
     * select partnerInfo
     *
     * @param partnerInfoDto
     * @return
     */
    public String select(PartnerInfoDto partnerInfoDto) {
        return new SQL() {
            {
                SELECT("*");
                FROM("mis_partner_info");
                if (StringUtils.isNotBlank(partnerInfoDto.getThirdAppKey())) {
                    WHERE("third_app_key = #{thirdAppKey}");
                }
                ORDER_BY("id desc");
            }
        }.toString();
    }

}

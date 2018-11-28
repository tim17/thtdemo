package com.tht.demo.service;

import com.github.pagehelper.Page;
import com.tht.demo.dto.PartnerInfoDto;

import java.util.List;

public interface PartnerInfoService {

    /**
     * find list
     *
     * @param partnerInfoDto
     * @param page
     * @return
     */
    public List<PartnerInfoDto> findList(PartnerInfoDto partnerInfoDto, Page page) throws Exception;

}

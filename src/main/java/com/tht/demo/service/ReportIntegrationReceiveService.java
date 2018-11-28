package com.tht.demo.service;

import com.github.pagehelper.Page;
import com.tht.demo.dto.ReportIntegrationDto;
import com.tht.demo.model.ReportIntegration;

import java.util.List;

public interface ReportIntegrationReceiveService {

    /**
     * find list
     *
     * @param reportIntegrationDto
     * @param page
     * @return
     */
    public List<ReportIntegrationDto> findList(ReportIntegrationDto reportIntegrationDto, Page page) throws Exception;

}

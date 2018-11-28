package com.tht.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tht.demo.dto.ReportIntegrationDto;
import com.tht.demo.mapper.ReportIntegrationMapper;
import com.tht.demo.model.ReportIntegration;
import com.tht.demo.service.ReportIntegrationReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReportIntegrationReceiveServiceImpl implements ReportIntegrationReceiveService {

    @Autowired
    private ReportIntegrationMapper reportIntegrationMapper;

    @Override
    public List<ReportIntegrationDto> findList(ReportIntegrationDto reportIntegrationDto, Page page) throws Exception {
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<ReportIntegrationDto> reportIntegrationDtoList = reportIntegrationMapper.findList(reportIntegrationDto);
        return reportIntegrationDtoList;
    }
}

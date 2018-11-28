package com.tht.demo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.tht.demo.common.dto.ReturnData;
import com.tht.demo.dto.ReportIntegrationDto;
import com.tht.demo.model.ReportIntegration;
import com.tht.demo.service.ReportIntegrationReceiveService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * API for finding report integrations by params.
 * You can use page number to control the data.
 */
@RestController
@RequestMapping(value = "/v1/report-integrations")
public class ReportIntegrationController {
    private static final Logger logger = LoggerFactory.getLogger(ReportIntegrationController.class);
    @Autowired
    private ReportIntegrationReceiveService reportIntegrationReceiveService;

    @ApiOperation(value = "获取报告回收结果", notes = "通过条件查询报告回收结果列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "pageSize", value = "每页要显示数据数", paramType = "query", dataType = "Integer")})
    @GetMapping(value = "", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ReturnData findList(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                        @RequestParam(value = "pageSize", required = false) Integer pageSize,
                        ReportIntegrationDto reportIntegrationDto) {
        try {
            pageNum = pageNum == null ? 1 : pageNum;
            pageSize = pageSize == null ? 10 : pageSize;
            Page page = new Page(pageNum, pageSize);
            List<ReportIntegrationDto> reportIntegrationDtoList = reportIntegrationReceiveService.findList(reportIntegrationDto, page);
            PageInfo pageInfo = new PageInfo(reportIntegrationDtoList);
            return new ReturnData("200", "SUCCESS", pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("error", e);
            return new ReturnData("500", "ERROR:" + e);
        }
    }

}

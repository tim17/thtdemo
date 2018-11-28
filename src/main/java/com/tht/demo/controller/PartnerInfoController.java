package com.tht.demo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.tht.demo.common.dto.ReturnData;
import com.tht.demo.dto.PartnerInfoDto;
import com.tht.demo.service.PartnerInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * API for finding partnerInfo by params.
 * You can use page number to control the data.
 */
@RestController
@RequestMapping(value = "/v1/part-info")
public class PartnerInfoController {
    private static final Logger logger = LoggerFactory.getLogger(PartnerInfoController.class);
    @Autowired
    private PartnerInfoService partnerInfoService;

    @ApiOperation(value = "获取第三方信息", notes = "通过条件查询第三方信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "pageSize", value = "每页要显示数据数", paramType = "query", dataType = "Integer")})
    @GetMapping(value = "", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ReturnData findList(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                        @RequestParam(value = "pageSize", required = false) Integer pageSize,
                        PartnerInfoDto partnerInfoDto) {
        try {
            pageNum = pageNum == null ? 1 : pageNum;
            pageSize = pageSize == null ? 10 : pageSize;
            Page page = new Page(pageNum, pageSize);
            List<PartnerInfoDto> partnerInfoDtoList = partnerInfoService.findList(partnerInfoDto, page);
            PageInfo pageInfo = new PageInfo(partnerInfoDtoList);
            return new ReturnData("200", "SUCCESS", pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("error", e);
            return new ReturnData("500", "ERROR:" + e);
        }
    }

}

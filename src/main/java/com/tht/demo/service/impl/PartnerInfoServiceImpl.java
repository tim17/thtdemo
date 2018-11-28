package com.tht.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tht.demo.dto.PartnerInfoDto;
import com.tht.demo.mapper.PartnerInfoMapper;
import com.tht.demo.service.PartnerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PartnerInfoServiceImpl implements PartnerInfoService {

    @Autowired
    private PartnerInfoMapper partnerInfoMapper;

    @Override
    public List<PartnerInfoDto> findList(PartnerInfoDto partnerInfoDto, Page page) throws Exception {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<PartnerInfoDto> partnerInfoDtoList = partnerInfoMapper.findList(partnerInfoDto);
        return partnerInfoDtoList;
    }

}

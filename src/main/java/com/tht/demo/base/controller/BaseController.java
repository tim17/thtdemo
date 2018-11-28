package com.tht.demo.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 功能概述：验证服务及数据库
 */
@Controller
@RequestMapping("/check")
public class BaseController {

    @ApiIgnore
    @RequestMapping(value = "/db")
    public @ResponseBody
    String checkdb() {
        return "success";
    }

    @ApiIgnore
    @RequestMapping(value = "/web")
    public @ResponseBody
    String checkWeb() throws Exception {
        return "success";
    }


}

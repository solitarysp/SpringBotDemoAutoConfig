package com.lethanh98.spring.bot.demo.autoconfig.controller;

import com.lethanh98.spring.bot.autoconfig.CommonService;
import com.lethanh98.spring.bot.autoconfig.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Autowired
    CommonService commonService;
    @Autowired
    UtilService utilService;

    @GetMapping()
    public Object get() {
        commonService.sendMsg("d");
        utilService.showLog("d");
        return null;
    }
}

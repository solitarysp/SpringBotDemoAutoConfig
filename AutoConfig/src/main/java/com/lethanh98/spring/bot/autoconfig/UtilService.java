package com.lethanh98.spring.bot.autoconfig;

import org.springframework.stereotype.Service;

@Service
public class UtilService {
    public void showLog(String msg) {
        System.out.println("showLog: " + msg);
    }
}

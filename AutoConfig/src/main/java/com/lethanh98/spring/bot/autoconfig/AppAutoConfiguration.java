package com.lethanh98.spring.bot.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "app.autoconfig.on", havingValue = "true")
public class AppAutoConfiguration {
    @Bean
    public UtilService createBeanUtilService() {
        return new UtilService();
    }

    @Bean
    public CommonService createBeanCommonService() {
        return new CommonService();
    }
}

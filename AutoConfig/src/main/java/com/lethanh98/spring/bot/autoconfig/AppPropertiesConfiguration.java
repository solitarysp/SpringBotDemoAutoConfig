package com.lethanh98.spring.bot.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(
        prefix = "app.autoconfig"
)
@Data
public class AppPropertiesConfiguration {
    boolean on;
}

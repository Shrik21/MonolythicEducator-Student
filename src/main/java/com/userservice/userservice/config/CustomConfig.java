package com.userservice.userservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class CustomConfig {

    @Value("${custom.config.principal}")
    private String principalName;

    @Value("${custom.config.holiday}")
    private String holiday;

    @Bean
    public CustomProperties customProperties() {
        return new CustomProperties(principalName, holiday);
    }
}

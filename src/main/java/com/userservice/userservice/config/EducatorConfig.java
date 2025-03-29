package com.userservice.userservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:educators.properties")
@Data
public class EducatorConfig {

    @Value("${educator.holiday}")
    private String holiday;

    @Value("${educator.manager}")
    private String manager;

    @Value("${educator.experience}")
    private String experience;
}

//package com.userservice.userservice.config;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class OpenAPIConfig {
//
//    @Bean
//    public OpenAPI getOpenAPI(@Value("${openapi.title}") String serviceTitle,
//                              @Value("${openapi.version}") String serviceVersion,
//                              @Value("${openapi.contact}") String serviceContact,
//                              @Value("${openapi.license}") String serviceLicense,
//                              @Value("${openapi.description}") String serviceDescription){
//        return new OpenAPI()
//                .info(new io.swagger.v3.oas.models.info.Info()
//                        .title(serviceTitle)
//                        .version(serviceVersion)
//                        .description(serviceDescription)
//                        .contact(new io.swagger.v3.oas.models.info.Contact().email(serviceContact))
//                        .license(new io.swagger.v3.oas.models.info.License().name(serviceLicense))
//                );
//    }
//}
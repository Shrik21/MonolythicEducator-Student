package com.userservice.userservice.config;

import lombok.Data;

@Data
public class CustomProperties {
    private final  String principalName;
    private final  String holiday;

    public CustomProperties(String principalName, String holiday) {
        this.principalName = principalName;
        this.holiday = holiday;
    }
}

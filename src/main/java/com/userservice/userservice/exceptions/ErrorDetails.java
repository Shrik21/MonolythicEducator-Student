package com.userservice.userservice.exceptions;

import lombok.Data;

@Data
public class ErrorDetails {

    private int statusCode;
    private String message;
    private String details;

    public ErrorDetails(int statusCode,String message, String details) {
        this.message = message;
        this.details = details;
        this.statusCode = statusCode;
    }
}

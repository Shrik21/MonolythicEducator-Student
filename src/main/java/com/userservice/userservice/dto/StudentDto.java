package com.userservice.userservice.dto;
import lombok.Data;

import java.util.UUID;

@Data
public class StudentDto {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private int age;
    private String grade;
    private EducatorDto educatorDto;
}

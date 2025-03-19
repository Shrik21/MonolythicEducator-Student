package com.userservice.userservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class EducatorDto {
    private Long educatorId;
    private String educatorName;
    private String subject;
    private List<StudentDto> students;
}

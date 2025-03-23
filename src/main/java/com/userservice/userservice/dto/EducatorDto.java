package com.userservice.userservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducatorDto {
    private Long educatorId;
    private String educatorName;
    private String subject;
    private List<StudentDto> students;
}

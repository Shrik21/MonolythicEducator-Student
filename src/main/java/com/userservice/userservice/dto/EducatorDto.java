package com.userservice.userservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
//import com.userservice.userservice.config.OpenAPIConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducatorDto {
    private Long educatorId;
    private String educatorName;
    private String subject;
    private List<StudentDto> students;
}

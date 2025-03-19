package com.userservice.userservice.service;

import com.userservice.userservice.dto.EducatorDto;
import com.userservice.userservice.entities.Educator;

import java.util.List;

public interface EducatorService {
    List<EducatorDto> getAllEducators();
    EducatorDto createEducator(Educator educator);
    EducatorDto getEducatorById(Long educatorId);
}

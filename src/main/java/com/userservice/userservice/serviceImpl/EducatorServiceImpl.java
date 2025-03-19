package com.userservice.userservice.serviceImpl;

import com.userservice.userservice.dto.EducatorDto;
import com.userservice.userservice.entities.Educator;
import com.userservice.userservice.repos.EducatorRepository;
import com.userservice.userservice.service.EducatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducatorServiceImpl implements EducatorService {

    @Autowired
    private EducatorRepository repository;
    @Autowired
    private EducatorRepository educatorRepository;

    @Override
    public List<EducatorDto> getAllEducators() {
        return educatorRepository.findAll().stream()
                .map(this::convertToEducatorDto).collect(Collectors.toList());
    }

    @Override
    public EducatorDto createEducator(Educator educator) {
        return convertToEducatorDto(educatorRepository.save(educator));
    }

    @Override
    public EducatorDto getEducatorById(Long educatorId) {
        return convertToEducatorDto(repository.findById(educatorId).orElse(null));
    }

    // Helper method to convert Educator entity to EducatorDto
    private EducatorDto convertToEducatorDto(Educator educator) {
        EducatorDto educatorDto = new EducatorDto();
        educatorDto.setEducatorId(educator.getEducatorId());
        educatorDto.setEducatorName(educator.getEducatorName());
        educatorDto.setSubject(educator.getSubject());
        return educatorDto;
    }
}

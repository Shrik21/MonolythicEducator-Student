package com.userservice.userservice.controllers;

import com.userservice.userservice.dto.EducatorDto;
import com.userservice.userservice.entities.Educator;
import com.userservice.userservice.service.EducatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educator")
public class EducatorController {

    @Autowired
    private EducatorService educatorService;

    @GetMapping("/educators")
    public List<EducatorDto> getAllEducators() {
        return educatorService.getAllEducators();
    }

    @PostMapping("/create")
    public EducatorDto createEducator(@RequestBody Educator educator) {
        return educatorService.createEducator(educator);
    }



}

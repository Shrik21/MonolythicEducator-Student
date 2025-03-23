package com.userservice.userservice.utilities;

import com.userservice.userservice.dto.EducatorDto;
import com.userservice.userservice.dto.StudentDto;
import com.userservice.userservice.entities.Educator;
import com.userservice.userservice.entities.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DTOsCovertor {


    private static final Logger logger = LoggerFactory.getLogger(DTOsCovertor.class);

    // Helper method to convert Student entity to StudentDto
    public StudentDto convertToStudentDto(Student student) {
        logger.info("Converting student to StudentDto: " + student);
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setAge(student.getAge());
        studentDto.setEmail(student.getEmail());
        studentDto.setPhone(student.getPhone());
        studentDto.setGrade(student.getGrade());
        studentDto.setGrade(student.getGrade());
        if (student.getEducator() != null) {
            studentDto.setEducatorDto(convertToEducatorDto(student.getEducator()));
        }
        return studentDto;
    }

    public EducatorDto convertToEducatorDto(Educator educator) {
        logger.info("Converting student to EducatorDTO: " + educator);
        EducatorDto educatorDto = new EducatorDto();
        educatorDto.setEducatorId(educator.getEducatorId());
        educatorDto.setEducatorName(educator.getEducatorName());
        educatorDto.setSubject(educator.getSubject());
        return educatorDto;
    }
}

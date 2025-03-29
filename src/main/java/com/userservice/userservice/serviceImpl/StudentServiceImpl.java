package com.userservice.userservice.serviceImpl;

import com.userservice.userservice.config.CustomProperties;
import com.userservice.userservice.config.EducatorConfig;
import com.userservice.userservice.utilities.DTOsCovertor;
import com.userservice.userservice.dto.StudentDto;
import com.userservice.userservice.entities.Student;
import com.userservice.userservice.repos.StudentRepository;
import com.userservice.userservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = Logger.getLogger(StudentServiceImpl.class.getName());

    @Autowired
    private DTOsCovertor dtosCovertor;

    @Autowired
    private StudentRepository studentRepository;

    private CustomProperties properties;

    private EducatorConfig educatorConfig;

    @Autowired
    public StudentServiceImpl(CustomProperties properties, EducatorConfig educatorConfig) {
        this.properties = properties;
        this.educatorConfig = educatorConfig;
    }

    @Override
    public StudentDto createStudent(Student student) {
        logger.info("Creating student: " + student);
        return dtosCovertor.convertToStudentDto(studentRepository.save(student));
    }

    @Override
    public List<StudentDto> getAllStudents() {
        logger.info("Fetching all students");
        logger.info("Fetching principal name: " + properties.getPrincipalName());
        logger.info("Fetching holiday: " + properties.getHoliday());
        logger.info("Fetching educator: " + educatorConfig.getManager());
        return studentRepository.findAll().stream()
                .map(dtosCovertor::convertToStudentDto).collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(UUID studentId) {
        logger.info("Fetching student by id: " + studentId);
        return dtosCovertor.convertToStudentDto(studentRepository.findById(studentId).orElse(null));
    }

    @Override
    public StudentDto updateStudent(UUID studentId, Student student) {
        logger.info("Updating student with id: " + studentId);
        Student existingStudent = studentRepository.findById(studentId).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            existingStudent.setGrade(student.getGrade());
            return dtosCovertor.convertToStudentDto(studentRepository.save(existingStudent));
        }
        return null;
    }

    @Override
    public void deleteStudent(UUID studentId) {
        logger.info("Deleting student with id: " + studentId);
        studentRepository.deleteById(studentId);
    }



}
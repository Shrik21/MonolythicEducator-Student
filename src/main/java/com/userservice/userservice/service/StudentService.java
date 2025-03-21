package com.userservice.userservice.service;

import com.userservice.userservice.dto.StudentDto;
import com.userservice.userservice.entities.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    StudentDto createStudent(Student student);
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(UUID studentId);
    StudentDto updateStudent(UUID studentId, Student student);
    void deleteStudent(UUID studentId);
}

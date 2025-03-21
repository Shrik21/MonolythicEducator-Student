package com.userservice.userservice.controllers;

import com.userservice.userservice.dto.StudentDto;
import com.userservice.userservice.entities.Student;
import com.userservice.userservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Create a new student
    @PostMapping("/create")
    public ResponseEntity<StudentDto> createStudent(@RequestBody Student student) {
        StudentDto studentDto = studentService.createStudent(student);
        return ResponseEntity.ok(studentDto);
    }

    // Get all students
    @GetMapping("/all")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        List<StudentDto> studentDtos = studentService.getAllStudents();
        return ResponseEntity.ok(studentDtos);
    }

    // Get a student by ID
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable UUID id) {
        StudentDto studentDto = studentService.getStudentById(id);
        return ResponseEntity.ok(studentDto);
    }

    // Update a student by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable UUID id, @RequestBody Student student) {
        StudentDto studentDto = studentService.updateStudent(id, student);
        return ResponseEntity.ok(studentDto);
    }

    // Delete a student by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable UUID id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
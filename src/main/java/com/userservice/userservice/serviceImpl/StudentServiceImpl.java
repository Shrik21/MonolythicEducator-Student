package com.userservice.userservice.serviceImpl;

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
    private StudentRepository studentRepository;

    @Override
    public StudentDto createStudent(Student student) {
        logger.info("Creating student: " + student);
        return convertToStudentDto(studentRepository.save(student));
    }

    @Override
    public List<StudentDto> getAllStudents() {
        logger.info("Fetching all students");
        return studentRepository.findAll().stream()
                .map(this::convertToStudentDto).collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(UUID studentId) {
        logger.info("Fetching student by id: " + studentId);
        return convertToStudentDto(studentRepository.findById(studentId).orElse(null));
    }

    @Override
    public StudentDto updateStudent(UUID studentId, Student student) {
        logger.info("Updating student with id: " + studentId);
        Student existingStudent = studentRepository.findById(studentId).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            existingStudent.setGrade(student.getGrade());
            return convertToStudentDto(studentRepository.save(existingStudent));
        }
        return null;
    }

    @Override
    public void deleteStudent(UUID studentId) {
        logger.info("Deleting student with id: " + studentId);
        studentRepository.deleteById(studentId);
    }

    // Helper method to convert Student entity to StudentDto
    private StudentDto convertToStudentDto(Student student) {
        logger.info("Converting student to StudentDto: " + student);
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setAge(student.getAge());
        studentDto.setEmail(student.getEmail());
        studentDto.setPhone(student.getPhone());
        studentDto.setGrade(student.getGrade());
        return studentDto;
    }
}
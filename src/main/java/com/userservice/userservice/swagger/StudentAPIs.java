package com.userservice.userservice.swagger;

import com.userservice.userservice.dto.StudentDto;
import com.userservice.userservice.entities.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Tag(name = "Student APIs" , description = "Student related APIs")
public interface StudentAPIs {
    @Operation(summary = "Create a new student", description = "This API creates a new student")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Student created successfully"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
            @ApiResponse(responseCode = "409" , description = "Student already exists")
    })
    public ResponseEntity<StudentDto> createStudent(@RequestBody Student student);

    public ResponseEntity<List<StudentDto>> getAllStudents();
    public ResponseEntity<StudentDto> getStudentById(@PathVariable UUID id);
    public ResponseEntity<StudentDto> updateStudent(@PathVariable UUID id, @RequestBody Student student);
    public ResponseEntity<Void> deleteStudent(@PathVariable UUID id);
}

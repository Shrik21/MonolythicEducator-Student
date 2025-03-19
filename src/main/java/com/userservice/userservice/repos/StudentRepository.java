package com.userservice.userservice.repos;

import com.userservice.userservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

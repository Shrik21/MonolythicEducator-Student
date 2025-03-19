package com.userservice.userservice.repos;

import com.userservice.userservice.entities.Educator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducatorRepository extends JpaRepository<Educator, Long> {
}

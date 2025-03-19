package com.userservice.userservice.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Educator {
    @Id
    @Column(name = "educator_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educatorId;

    @Column(name = "educator_name")
    private String educatorName;

    @Column(name = "subject")
    private String subject;

    @OneToMany(mappedBy = "educator")
    private List<Student> students;
}

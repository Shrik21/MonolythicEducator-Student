package com.userservice.userservice.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@ToString
public class Educator {
    @Id
    @Column(name = "educator_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educatorId;

    @Column(name = "educator_name")
    private String educatorName;

    @Column(name = "subject")
    private String subject;

    @OneToMany(mappedBy = "educator",cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, targetEntity = Student.class)
    @ToString.Exclude
    private List<Student> students;
}

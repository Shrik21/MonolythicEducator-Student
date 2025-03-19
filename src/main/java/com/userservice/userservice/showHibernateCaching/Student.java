//package com.userservice.userservice.showHibernateCaching;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.Cache;
//
//
//@Entity
//@Table(name ="student")
//@Data
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "student_name")
//    private String name;
//
//    @Transient
//    private String password;
//
//}

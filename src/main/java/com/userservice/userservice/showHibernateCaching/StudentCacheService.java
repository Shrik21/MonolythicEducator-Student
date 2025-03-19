//package com.userservice.userservice.showHibernateCaching;
//
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StudentCacheService {
//
//    private final StudentRepository studentRepository;
//
//    public StudentCacheService(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    @Transactional
//    public void demonstrateSecondLevelCache(Long studentId) {
//        System.out.println("Fetching student in first transaction...");
//        Student student1 = studentRepository.findById(studentId).orElse(null);
//
//        System.out.println("Fetching student in second transaction...");
//        Student student2 = studentRepository.findById(studentId).orElse(null);
//
//        if (student1 == student2) {
//            System.out.println("Second-level caching is working!");
//        }
//    }
//}

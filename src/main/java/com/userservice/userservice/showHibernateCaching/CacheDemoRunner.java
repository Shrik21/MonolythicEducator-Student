//package com.userservice.userservice.showHibernateCaching;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CacheDemoRunner implements CommandLineRunner {
//
//    private final StudentService studentService;
//    private final StudentCacheService studentCacheService;
//
//    public CacheDemoRunner(StudentService studentService, StudentCacheService studentCacheService) {
//        this.studentService = studentService;
//        this.studentCacheService = studentCacheService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Long studentId = 1L; // Make sure this student exists in the database
//
//        // Demonstrate First-Level Cache
//        studentService.demonstrateFirstLevelCache(studentId);
//
//        // Demonstrate Second-Level Cache
//        studentCacheService.demonstrateSecondLevelCache(studentId);
//    }
//}
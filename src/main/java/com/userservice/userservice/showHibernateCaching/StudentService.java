//package com.userservice.userservice.showHibernateCaching;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//
//@Service
//@Transactional
//public class StudentService {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    public void testFirstLevelCache(Long id) {
//        System.out.println("Fetching student first time...");
//        Student student1 = entityManager.find(Student.class, id);
//
//        System.out.println("Fetching student second time...");
//        Student student2 = entityManager.find(Student.class, id);
//    }
//
//    public void testSecondLevelCache(Long id) {
//        System.out.println("Fetching student in first transaction...");
//        StudentService proxy = SpringContextUtil.getBean(StudentService.class);
//        proxy.fetchStudent(id);
//
//        System.out.println("Fetching student in second transaction...");
//        proxy.fetchStudent(id);
//    }
//
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public Student fetchStudent(Long id) {
//        return entityManager.find(Student.class, id);
//    }
//}

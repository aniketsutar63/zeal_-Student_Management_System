package com.SMS.Student_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SMS.Student_Management_System.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
package com.SMS.Student_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SMS.Student_Management_System.entity.Student;
import com.SMS.Student_Management_System.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Add Student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // View All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Search Student
    @GetMapping("/{rollNo}")
    public Student getStudent(@PathVariable int rollNo) {
        return service.getStudentById(rollNo);
    }

    // Update Student
    @PutMapping("/{rollNo}")
    public Student updateStudent(@PathVariable int rollNo,
                                 @RequestBody Student student) {

        return service.updateStudent(rollNo, student);
    }

    // Delete Student
    @DeleteMapping("/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo) {
        return service.deleteStudent(rollNo);
    }
}
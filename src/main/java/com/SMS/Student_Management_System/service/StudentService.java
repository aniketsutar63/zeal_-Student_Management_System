package com.SMS.Student_Management_System.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SMS.Student_Management_System.entity.Student;
import com.SMS.Student_Management_System.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Add Student
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    // View All Students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Search Student
    public Student getStudentById(int rollNo) {
        return repository.findById(rollNo).orElse(null);
    }

    // Update Student
    public Student updateStudent(int rollNo, Student newStudent) {

        Student student = repository.findById(rollNo).orElse(null);

        if (student != null) {
            student.setName(newStudent.getName());
            student.setAge(newStudent.getAge());
            student.setCourse(newStudent.getCourse());

            return repository.save(student);
        }

        return null;
    }

    // Delete Student
    public String deleteStudent(int rollNo) {

        repository.deleteById(rollNo);

        return "Student Deleted Successfully!";
    }
}
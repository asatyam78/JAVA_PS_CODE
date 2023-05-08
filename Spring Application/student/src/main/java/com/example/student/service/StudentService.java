package com.example.student.service;

import com.example.student.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentById(int id) throws Exception;
    void createStudent(Student emp);
    Student updateStudentById(int id,Student emp) throws Exception;
    void deleteStudentById(int id) throws Exception;
}
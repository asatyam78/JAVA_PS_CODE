package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id) throws Exception{
        return studentService.getStudentById(id);
    }

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return "Student Successfully added !!";
    }

    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable("id") int id, @RequestBody Student student) throws Exception{
        return studentService.updateStudentById(id,student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") int id) throws Exception{
        studentService.deleteStudentById(id);
        return "Employee deleted successfully !";
    }

}
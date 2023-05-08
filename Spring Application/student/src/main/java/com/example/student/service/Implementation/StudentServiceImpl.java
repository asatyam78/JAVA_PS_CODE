package com.example.student.service.Implementation;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) throws Exception{
        Optional<Student> student =  studentRepository.findById(id);
        if(student.isEmpty()){
            throw new Exception("Student not found!");
        }
        return student.get();
    }

    @Override
    public void createStudent(Student student){
        studentRepository.save(student);
    }

    @Override
    public Student updateStudentById(int id, Student st) throws Exception{
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty()){
            throw new Exception("Student not found!");
        }
        Student updatesStudent = student.get();
        updatesStudent.setName(st.getName());
        studentRepository.save(updatesStudent);
        return updatesStudent;
    }

    @Override
    public void deleteStudentById(int id) throws Exception{
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty()){
            throw new Exception("Student not found!");
        }
        studentRepository.deleteById(id);
    }
}
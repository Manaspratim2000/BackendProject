package com.siprogramming.restapi.controller;

import com.siprogramming.restapi.entity.Student;
import com.siprogramming.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;
    //get all the student
    //localhost:8888/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repo.findAll();
        return students;
    }
    @GetMapping("/students/{id}")
    public Student getStudentByid(@PathVariable int id){
        Student student=repo.findById(id).get();
        return student;
    }

    @PostMapping("/students/add")
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }
    @PutMapping("/students/update/{id}")
    public Student updateStudents(@PathVariable int id){
        Student student=repo.findById(id).get();
        student.setName("himu");
        student.setPersentage(90);
        student.setBranch("cse");
        repo.save(student);
        return student;
    }
    @DeleteMapping("/students/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        Student student=repo.findById(id).get();
        repo.delete(student);
    }
}

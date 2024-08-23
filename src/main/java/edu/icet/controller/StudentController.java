package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/add-student")
    public void AddStudent(Student student){
        service.Add(student);
    }
    @GetMapping("/get-student")
    public Student GetStudent(){
        return service.get();
    }
}

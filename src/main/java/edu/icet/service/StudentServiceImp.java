package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{
    @Override
    public void Add(Student student) {

    }

    @Override
    public Student get() {
        return new Student(1,"chathusha","Galle");
    }
}

package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Override
    public void Add(Student student) {

    }

    @Override
    public Student get() {
        return new Student(1,"chathusha","Galle");
    }
}

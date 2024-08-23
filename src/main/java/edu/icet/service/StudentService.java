package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;


public interface StudentService {

    void Add(Student student);
    Student get();
}

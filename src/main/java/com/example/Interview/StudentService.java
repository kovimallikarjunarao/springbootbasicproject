package com.example.Interview;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public Student saveStudent(Student student){
        return repository.save(student);
    }
    public Iterable<Student> getAllStudents(){
        int x=0;
        return repository.findAll();
    }
}

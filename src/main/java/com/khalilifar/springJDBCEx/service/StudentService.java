package com.khalilifar.springJDBCEx.service;
import com.khalilifar.springJDBCEx.model.Student;
import com.khalilifar.springJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    // Spring will automatically inject the StudentRepo bean here
    @Autowired
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student student) {
        repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }



}

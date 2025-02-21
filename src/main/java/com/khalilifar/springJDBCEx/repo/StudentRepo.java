package com.khalilifar.springJDBCEx.repo;
import com.khalilifar.springJDBCEx.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        System.out.println("Added");
    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;

    }
}

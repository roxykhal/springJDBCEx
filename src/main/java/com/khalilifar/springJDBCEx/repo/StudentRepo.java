package com.khalilifar.springJDBCEx.repo;
import com.khalilifar.springJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {

        String sql = "insert into student (rollno, name, marks) values (?,?,?)";
        int rowsAffected = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rowsAffected + " affected");
    }

    public List<Student> findAll() {

        String sql = "select * from student";

        //RowMapper is an interface used in Spring JDBC to map rows of a ResultSet to Java objects

        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                //fetching data from RS and saving in student object
                Student student = new Student();
                student.setRollNo(rs.getInt("rollno"));
                student.setName((rs.getString("name")));
                student.setMarks(rs.getInt("marks"));


                return student;
            }
        };

        return jdbc.query(sql, mapper);

//do not need this anymore as we are going to use JDBC, and we want to fetch all data from DB
//        List<Student> students = new ArrayList<>();
//        return students;

    }
}

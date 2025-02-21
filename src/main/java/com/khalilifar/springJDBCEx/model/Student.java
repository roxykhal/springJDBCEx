package com.khalilifar.springJDBCEx.model;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//set type to prototype as we are going to have multiple objects
@Scope("prototype")
public class Student {
    private int rollNo;
    private String name;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    //String representation of the student object
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

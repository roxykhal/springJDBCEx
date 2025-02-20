package com.khalilifar.springJDBCEx;
import com.khalilifar.springJDBCEx.model.Student;
import com.khalilifar.springJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setRollNo(101);
		student.setName("roxy");
		student.setMarks((25));

		//create service object
		StudentService service = context.getBean(StudentService.class);

		service.addStudent(student);
	}

}

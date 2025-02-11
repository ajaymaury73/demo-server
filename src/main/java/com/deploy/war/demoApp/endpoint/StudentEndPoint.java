package com.deploy.war.demoApp.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.deploy.war.demoApp.domain.Student;

@RestController
@RequestMapping("/students") // Base URL for student endpoints
public class StudentEndPoint {
    private List<Student> students = new ArrayList<>();
    Student s1=new Student();

    @GetMapping("/msg")
    public String Msg() {
    	String rs="Welcome Ajay";
        return rs;
    }
    @GetMapping("/get")
    public List<Student> getStudents() {
        return students; // Returns the list of students
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added successfully!";
    }
    
    @GetMapping("/hi")
    public String hi() {
		return "Hello Ajay";
    	
    }
}

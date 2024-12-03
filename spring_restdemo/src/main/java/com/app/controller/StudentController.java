package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.jackson.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
@RequestMapping("/api")
public class StudentController {
	
	List<Student> list = new ArrayList<Student>();
	
	public StudentController() {
		list.add(new Student(1, "Ashish", "Dubbewar", true));
		list.add(new Student(2, "Meera", "Sharma", false));
		list.add(new Student(3, "Raj", "Verma", true));
		list.add(new Student(4, "Sneha", "Patil", false));
		list.add(new Student(5, "Ravi", "Kumar", true));
		list.add(new Student(6, "Priya", "Gupta", true));

	}
	
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hi hello How are you ";
	}
	
	@GetMapping("students/list")
	public List<Student> getStudentList(){
		return list;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return list.get(id);
	}
	
}

package com.achyut.firstapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
//	@GetMapping
//	public Student getStudent() {
//		return new Student(1, "Achyut", "Thapa");
//		
//	}
	
	///list of students
	@GetMapping("/student-list")
	public List<Student> getStudents(){
		
		List<Student> students = new  ArrayList<>();
		students.add(new Student(1,"Achyut", "Thapa"));
		students.add(new Student(2, "Biraj", "Adhikari"));
		students.add(new Student(3, "Dhiraj", "Shrestha"));
		students.add(new Student(4, "Pankaj", "Dawadi"));
		students.add(new Student(5, "Sameer", "Tamrakar"));
		students.add(new Student(6, "Amrit", "Dahal"));
		return students;
		
		
	}
	

}

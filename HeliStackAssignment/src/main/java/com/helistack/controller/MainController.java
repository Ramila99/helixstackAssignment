package com.helistack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helistack.entity.Student;
import com.helistack.service.StudentService;


@RestController
public class MainController {

	@Autowired
	private StudentService serv;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student s)
	{
		return serv.addStudent(s);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student s)
	{
		return serv.updateStudent(s);
	}
	
	@DeleteMapping("/student/{roll}")
	public void deleteStudent(@PathVariable int roll)
	{
		serv.deleteStudent(roll);
	}
	
	@GetMapping("/student")
	public List<Student> findAllStudent()
	{
		return serv.findAllStudent();
	}
}

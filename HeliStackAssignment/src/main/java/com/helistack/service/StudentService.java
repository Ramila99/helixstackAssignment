package com.helistack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helistack.entity.Student;
import com.helistack.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository srepo;
	
	
	
	public Student addStudent(Student s)
	{
		return srepo.save(s);	
	}
	
	public Student updateStudent(Student s)
	{
		return srepo.save(s);
	}
	
	public void deleteStudent(int id)
	{
		 srepo.deleteById(id);
	}
	
	public List<Student> findAllStudent()
	{
		return srepo.findAll();
	}
	
	
}

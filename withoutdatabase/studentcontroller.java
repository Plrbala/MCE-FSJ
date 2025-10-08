package edu.mce.studentApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mce.studentApp.model.Student;
import edu.mce.studentApp.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
	@GetMapping("/student")
	public List<Student> showDetails()
	{
		return studentservice.getStudent();
	}
	@PostMapping("/student")
	public String adddetails(@RequestBody Student stud)
	{
		studentservice.addStudent(stud);
		return "student record add successfull";
	}
	@PutMapping("/student/{sid}")
	public String updatedetails(@RequestBody Student stud)
	{
		return studentservice.updateStudent(stud);
	}
	@DeleteMapping("/student/{sid}")
	public String deletedetails(@PathVariable  long sid)
	{
		return studentservice.deleteStudent(sid);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.example.demo.Controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudController {

	@Autowired
	StudentService ss;
	
	Student student;

	@GetMapping("/getStud")
	public Student Student(Student student) {
		
		 student = new Student(11,"Vaibhav","Jalgaon","8308313970");
		
		 ss.saveStudent(student);
		 
		return student;
	}
	
	
	@GetMapping("/getStud/{sid}")
	public Object Student(@PathVariable Integer sid) {
		
		return ss.getById(sid);
	
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(Student student) {
		
		return (List<com.example.demo.Model.Student>) ss.getAll(student);
	}
	
	
	@PostMapping("/addStud")
    public String addStudent(@RequestBody Student student) {
    	
    	ss.saveStud(student);
    	
    	return "New Student Added Successfully !";
    }
	
	@PutMapping("/update")
	public String update(@RequestBody Student student) {
		
		this.student = student;
		
		ss.updateStud(student);
		
		return "Student details updated Successfully !";
	}
	
	@DeleteMapping("/delete/{sid}")
	public String delete(@PathVariable Integer sid) {
		
		ss.deleteStud(sid);
		
		return "Record deleted successfully !";
	}
	
	
	
	
	
	
	
}

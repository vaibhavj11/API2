package com.example.demo.Dao;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.Service.StudentService;

@Service
public class StudentDao implements StudentService {

	@Autowired
	StudentRepo sr;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		sr.save(student);
		
	}

	@Override
	public void saveStud(Student student) {
		// TODO Auto-generated method stub
		sr.save(student);
	}

	@Override
	public Object getById(Integer sid) {
		// TODO Auto-generated method stub
		
		 
		 return  sr.findById(sid);
	}

	@Override
	public List<Student> getAll(Student student) {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
//
//	public void updateStud(Student student, Integer sid) {
//		// TODO Auto-generated method stub
//		
//		sr.save(student,sid);
//		
//	}

	@Override
	public void deleteStud(Integer sid) {
		// TODO Auto-generated method stub
		
		sr.deleteById(sid);
		
	}

	@Override
	public void updateStud(Student student) {
		// TODO Auto-generated method stub
	sr.save(student);	
	}

	

	



	

	

}

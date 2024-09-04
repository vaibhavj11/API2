package com.example.demo.Service;

import java.util.List;
//import java.util.Optional;

import com.example.demo.Model.Student;

public interface StudentService {

	void saveStudent(Student student);

	void saveStud(Student student);

	

	Object getById(Integer id);

	List<Student> getAll(Student student);


	void deleteStud(Integer sid);

	

	void updateStud(Student student);

	



}

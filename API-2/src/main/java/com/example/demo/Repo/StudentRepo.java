package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

	 //List<Student>  updateById(Integer sid);

//	void save(Student student, Integer sid);

	

}

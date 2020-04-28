package com.cg.iter.service;

import java.util.List;

import com.cg.iter.entity.Student;

public interface IStudentDetailsService {

	Student findStudentById(int id);

	List<Student> findAll();

	

	

}

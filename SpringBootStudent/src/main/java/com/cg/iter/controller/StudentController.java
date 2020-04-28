package com.cg.iter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.entity.Student;
import com.cg.iter.service.IStudentDetailsService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class StudentController {
	private static final Logger Log = LoggerFactory.getLogger(StudentController.class);
	@Autowired
    private IStudentDetailsService studentService;
	@GetMapping(value = "/std/find/{id}",
            produces = "application/json")
	public ResponseEntity<Student> findStudent(@PathVariable int id) {
		System.out.println("id: "+id);
		Student stud= studentService.findStudentById(id);
				//new Student(123,"Vikash",8250733669l,"Java");//go to dao and fetch
		ResponseEntity<Student> responseEntity = new ResponseEntity(stud, HttpStatus.OK);
		return responseEntity;	
	}
	 @GetMapping(value = "/std/all",
	            produces = "application/json")
	    public ResponseEntity<List<Student>> allStudents() {
	        List<Student> stud = studentService.findAll();
	        ResponseEntity<List<Student>> responseEntity = new ResponseEntity(stud, HttpStatus.OK);
	        return responseEntity;
	    }

	
	
	
}

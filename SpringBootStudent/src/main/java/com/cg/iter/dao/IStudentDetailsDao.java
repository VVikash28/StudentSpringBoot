package com.cg.iter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.entity.Student;

public interface IStudentDetailsDao extends JpaRepository<Student,Integer> {

}

package com.cg.iter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.dao.IStudentDetailsDao;
import com.cg.iter.entity.Student;

@Service
@Transactional
public class StudentDetailsServiceImpl implements IStudentDetailsService {
	
	@Autowired
    private IStudentDetailsDao dao;

	@Override
	public Student findStudentById(int id) {
		Optional<Student> optional = dao.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		Iterable<Student> iterable = dao.findAll();
        List<Student> list = new ArrayList();
        for (Student s : iterable) {
            list.add(s);
        }
        return list;
	}
	
	

}

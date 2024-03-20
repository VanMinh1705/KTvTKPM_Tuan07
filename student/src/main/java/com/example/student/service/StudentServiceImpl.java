package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.student.entity.Student;
import com.example.student.respository.StudentDAO;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO dao;
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.findStudentById(id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}

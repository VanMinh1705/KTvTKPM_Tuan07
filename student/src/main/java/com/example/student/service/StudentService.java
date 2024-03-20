package com.example.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.entity.Student;

@Service
public interface StudentService {
	public List<Student> findAll();
	public Student save(Student student);
	public Student findStudentById(int id);
	public String delete(int id);
}

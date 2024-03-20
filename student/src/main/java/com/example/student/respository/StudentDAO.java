package com.example.student.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.student.entity.Student;

@Repository
public interface StudentDAO {
	public List<Student> findAll();
	public Student save(Student student);
	public Student findOrderById(int id);
	public String delete(int id);
}

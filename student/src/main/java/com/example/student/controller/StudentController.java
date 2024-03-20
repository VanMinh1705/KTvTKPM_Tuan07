package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

		@GetMapping("/student")	
		public String getStudent() {
			return "Hello student";
		}
		
//		@Autowired
//	    private StudentService dao;
//
//	    @PostMapping("/save")
//	    public Student save(@RequestBody Student student) {
//	        return dao.save(student);
//	    }
//
//	    @GetMapping("/findAll")
//	    public List<Student> getAllStudents() {
//	        return dao.findAll();
//	    }
//
//	    @GetMapping("findStudentById/{id}")
//	    public Student findStudent(@PathVariable int id) {
//	        return dao.findStudentById(id);
//	    }
//	    @DeleteMapping("delete/{id}")
//	    public String remove(@PathVariable int id)   {
//	    	return dao.delete(id);
//		}
}

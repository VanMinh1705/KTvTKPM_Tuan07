package com.example.student.respository;

import java.util.List;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.student.entity.Student;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {
	 public static final String HASH_KEY = "Student";

	    private final RedisTemplate template;

	    StudentDAOImpl(RedisTemplate template) {
	        this.template = template;
	    }

	    @Override
	    public List<Student> findAll() {
	        return template.opsForHash().values(HASH_KEY);
	    }

	    @Override
	    public Student save(Student student) {
	        template.opsForHash().put(HASH_KEY, student.getId(), student);
	        return student;
	    }

	    @Override
	    public Student findStudentById(int id) {
	        return (Student) template.opsForHash().get(HASH_KEY, id);
	    }

	    @Override
	    public String delete(int id) {
	        template.opsForHash().delete(HASH_KEY, id);
	        return "Student removed !!";
	    }
}

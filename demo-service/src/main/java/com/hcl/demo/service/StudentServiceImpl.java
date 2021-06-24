package com.hcl.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.demo.exception.StudentNotFoundException;
import com.hcl.demo.model.Student;
import com.hcl.demo.service.dao.StudentDao;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	public Student get(Long id) {
		Optional<Student> optional = studentDao.findById(id);
		if(optional.isPresent())
			return optional.get();
		throw new StudentNotFoundException("Student not found with id :"+id);
	}

	public Student save(Student student) {
		return studentDao.save(student);
	}

	public Student update(Student student, Long id) {
			Student existingStudent = get(id);
			existingStudent.setCourse(student.getCourse());
			existingStudent.setName(student.getName());
			return studentDao.save(existingStudent);
		
	}

	public Student delete(Long id){
		Student deletedStudent = get(id);
		studentDao.deleteById(id);
		return deletedStudent;
	}

	public List<Student> getAll() {
		return studentDao.findAll();
	}
}

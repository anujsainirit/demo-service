package com.hcl.demo.service;

import java.util.List;

import com.hcl.demo.model.Student;

public interface StudentService {

	public Student get(Long id);

	public Student save(Student student);

	public Student update(Student student, Long id);

	public Student delete(Long id);

	public List<Student> getAll();

}

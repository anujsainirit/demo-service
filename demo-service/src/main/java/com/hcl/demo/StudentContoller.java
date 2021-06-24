package com.hcl.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcl.demo.model.Student;
import com.hcl.demo.service.StudentService;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Controller
@ResponseBody
@Slf4j
@Api(description = "This is Student controller")
public class StudentContoller {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getAll() {
		return studentService.getAll();
	}

	@GetMapping("/students/{id}")
	public Student get(@PathVariable Long id) {
		return studentService.get(id);
	}

	@PostMapping("/students")
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}


	@PutMapping("/students/{id}")
	public Student update(@RequestBody Student student, @PathVariable Long id) {
		return studentService.update(student,id);
	}

	@DeleteMapping("/students/{id}")
	public Student delete(@PathVariable Long id) {
		return studentService.delete(id);
	}

}

/*
GET - /students  fetch data for a student or list of student
DELETE - /students/{id}
PUT -  /students/{id}

 */
//POST - /students

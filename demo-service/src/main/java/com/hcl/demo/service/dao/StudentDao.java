package com.hcl.demo.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>{
	
}

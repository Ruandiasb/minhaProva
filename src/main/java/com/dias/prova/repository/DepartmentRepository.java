package com.dias.prova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dias.prova.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	
	

}

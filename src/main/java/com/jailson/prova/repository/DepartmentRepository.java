package com.jailson.prova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jailson.prova.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	
	//na repository pode se fazer comandos para acessos sql
	
	//select * from Department where departmentName='teste'
		//List<Disciplina> findDisciplinaBydepartmentName(String departmentName);

}

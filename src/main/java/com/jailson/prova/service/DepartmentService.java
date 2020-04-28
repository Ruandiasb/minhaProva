package com.jailson.prova.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jailson.prova.domain.Department;
import com.jailson.prova.repository.DepartmentRepository;


@Service
public class DepartmentService {
	@Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department departmentName){
        return departmentRepository.save(departmentName);
    }

    public Department findById(Long id){
        return departmentRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Department> findAll(){
        return departmentRepository.findAll();
    }


    public void deleteById(Long id) {
    	departmentRepository.deleteById(id);
    }
}

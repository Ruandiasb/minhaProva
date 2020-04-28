package com.jailson.prova.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jailson.prova.domain.Department;
import com.jailson.prova.service.DepartmentService;

@RestController // indica que a classe é um controller em que os métodos requestMapping assume  requestBody
@RequestMapping("/department") //recebe atributo chamado value que indica qual url sera ultilizada para invocar o metodo
public class DepartmentRest {
    @Autowired //marcar o ponto de injeção na sua classe
    private DepartmentService departmentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET) ////Define a url que quando for requisitada chamara o metodo
    public Department getDepartmentById(@PathVariable Long id) {
        return departmentService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Department> getDepartment() {
        return departmentService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Department save(@RequestBody @Valid Department department) {
        return departmentService.save(department);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Department update(@RequestBody @Valid Department department) {
        return departmentService.save(department);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteById(@PathVariable Long id) {
    	departmentService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

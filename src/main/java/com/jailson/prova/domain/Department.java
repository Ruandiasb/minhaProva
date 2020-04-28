package com.jailson.prova.domain;

import javax.persistence.*;


@Entity
public class Department {
    @Id //identificador da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera um valor para o identificador para cada registro no banco
    private Long id;

    private String departmentName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}

package com.dias.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dias.prova.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}

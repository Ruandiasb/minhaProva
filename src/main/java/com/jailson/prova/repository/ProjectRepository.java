package com.jailson.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jailson.prova.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}

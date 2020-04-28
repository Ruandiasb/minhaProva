package com.jailson.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jailson.prova.domain.ProjectHistory;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long> {

}

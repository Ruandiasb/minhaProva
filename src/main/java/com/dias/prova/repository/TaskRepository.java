package com.dias.prova.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dias.prova.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStartDateGreaterThanEqualAndEndDateLessThanEqualAndStatusIs(LocalDate startDate, LocalDate endDate, Long status);

	List<Task> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(LocalDate startDate, LocalDate endDate);

    List<Task> findByStatus(Long status);
}

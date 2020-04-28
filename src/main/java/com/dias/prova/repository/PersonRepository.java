package com.dias.prova.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dias.prova.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}

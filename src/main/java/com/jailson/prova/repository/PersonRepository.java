package com.jailson.prova.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jailson.prova.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}

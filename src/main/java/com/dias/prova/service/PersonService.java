package com.dias.prova.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dias.prova.domain.Person;
import com.dias.prova.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

    public Person findById(Long id){
        return personRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}

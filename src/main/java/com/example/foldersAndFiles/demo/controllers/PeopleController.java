package com.example.foldersAndFiles.demo.controllers;

import com.example.foldersAndFiles.demo.models.Person;
import com.example.foldersAndFiles.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value="/people")
    public ResponseEntity<List<Person>> getAllPeople(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/people/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/people")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

}

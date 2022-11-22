package com.example.demo;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepository;

public class PersonService {
  private PersonRepository repo;
  
  public Person save(Person p) {
	return repo.save(p);
	  
  }
}

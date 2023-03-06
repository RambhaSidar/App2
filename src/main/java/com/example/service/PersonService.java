package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repo.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository repo;

	public Person savePerson(Person p) {
		return repo.save(p);

	}

	public List<Person> getAllPerson() {
		return repo.findAll();
	}

	public Optional<Person> getPersonById(int id) {
		return repo.findById(id);
	}

	public Person updatePerson(Person p, int id) {
		Person existing = repo.findById(id).get();
		existing.setName("helllo");
		return repo.save(existing);
	}

	public void deletePerson(int id) {
		Person existing = repo.findById(id).get();
		repo.delete(existing);
	}
}

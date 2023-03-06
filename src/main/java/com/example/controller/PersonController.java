package com.example.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
public class PersonController {
private PersonService service;
	
	@PostMapping("/save")
	public Person saveperson(@RequestBody Person p) {
		return service.savePerson(p);
	}
	@GetMapping("/getAll")
	public List<Person> getAll(){
		return service.getAllPerson();
	}
	@GetMapping("/getPerson/{id}")
	public Person getByID(@PathVariable("id") int id){
		return service.getPersonById(id);
	}
	@PutMapping("/update/{id}")
	public Person update(@RequestBody Person p,@PathVariable("id")int id) {
		return service.updatePerson(p, id);
		
	}
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id")int id) {
		service.deletePerson(id);
	}
	
}

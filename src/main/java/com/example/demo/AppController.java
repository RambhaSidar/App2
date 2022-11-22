package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
public class AppController {
	private PersonService service;
	@PostMapping("/save")
	public Person saveperson(Person p) {
		return service.save(p);
	}
	
	@GetMapping("/msg")
	public String getMsg() {
		return "Hello Mota";
	}
	@GetMapping("/getrow")
	public int getSum() {
		return 10+20;
	}
}

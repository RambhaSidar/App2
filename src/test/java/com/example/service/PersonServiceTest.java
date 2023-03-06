package com.example.service;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.model.Person;
import com.example.repo.PersonRepository;
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {
	@InjectMocks
	private PersonService service;
	@Mock
	private PersonRepository repo;
	
	@Test
	void testSavePerson() {
		Person p1=new Person();
		p1.setId(1);
		p1.setName("ram");
		p1.setSubject("java");
		when(repo.save(any(Person.class))).thenReturn(p1);
		Person newp=service.savePerson(p1);
		assertThat(newp.getName()).isEqualTo("ram");
	}

}

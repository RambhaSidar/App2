package com.jt.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.jt.entity.Person;
@DataJpaTest
class PersonRepositoryTest {

	@Autowired
	private PersonRepository service;
	
	private Person p1=new Person();
	private Person p2=new Person();
	@BeforeEach
	void init() {
		p1.setId(1);
		p1.setName("ram");
		p1.setSubject("java");
		p2.setId(2);
		p2.setName("kuku");
		p2.setSubject("java");
	}
	@Test
	void testSave() {
		Person ps=service.save(p1);
		assertNotNull(ps);
		assertThat(ps.getId()).isNotEqualTo(null);
	}

	@Test
	void testGetAllPerson() {
		Person ps1=service.save(p1);
		Person ps2=service.save(p2);
		List<Person> list=service.findAll();
		assertNotNull(list);
		assertEquals(2, list.size());
		
	}
	@Test 
	void testGetById() {
		service.save(p1);
		Person existingp=service.findById(p1.getId()).get();
		assertEquals(1, existingp.getId());
		assertEquals("ram", existingp.getName());
		assertEquals("java", existingp.getSubject());		
		
	}
	@Test
	void updatePerson() {
		service.save(p1);
		Person existingp=service.findById(p1.getId()).get();
		existingp.setName("hello");
		service.save(existingp);
		assertEquals("hello", existingp.getName());
		assertEquals("java", existingp.getSubject());
		assertEquals(1, existingp.getId());
		
	}
	@Test
	void deletePersonById() {
		service.save(p1);
		Person ps2=service.save(p2);
		service.delete(p1);
		List<Person> list=service.findAll();
		assertEquals(1, list.size());
		
	}
	@Test
	void testGetNames() {
		service.save(p1);
		Person ps2=service.save(p2);
        List<Person>list=service.findByName("ram");
        assertThat(list.size()).isEqualTo(1);
        
		
	}


}

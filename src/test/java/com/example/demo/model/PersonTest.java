package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
    
	Person p=new Person();
	@Test
	void testPerson() {
		p=new Person();
	}

	@Test
	void testGetId() {
		p.setId(1);
		assertEquals(1, p.getId());
	}

	@Test
	void testSetId() {
		p.setId(1);
		assertEquals(1, p.getId());
	}

	@Test
	void testGetName() {
		 p.setName("Test");
	        assertEquals("Test",p.getName());	}

	@Test
	void testSetName() {
        p.setName("Test");
        assertEquals("Test",p.getName());
	}

	@Test
	void testGetSubject() {
		  p.setName("Test");
	        assertEquals("Test",p.getName());	
	        }

	@Test
	void testSetSubject() {
		p.setSubject("java");
		assertEquals("java",p.getSubject());
	}
	@Test
	void testToString() {
		p.setId(1);
		p.setName("test");
		p.setSubject("java");
		p.toString();

	}

}

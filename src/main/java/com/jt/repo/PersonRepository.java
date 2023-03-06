package com.jt.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jt.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	List<Person> findByName(String string);
    
}

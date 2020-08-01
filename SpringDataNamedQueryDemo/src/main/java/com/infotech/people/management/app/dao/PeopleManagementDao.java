package com.infotech.people.management.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infotech.people.management.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {
	
	List<Person> findBylastNamePersonInfo(String lastName);
	List<Person> getfindByFirstNameAndEmail(String firstName,String email);
	

}

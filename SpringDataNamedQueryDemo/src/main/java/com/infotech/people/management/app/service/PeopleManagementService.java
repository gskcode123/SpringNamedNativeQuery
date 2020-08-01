package com.infotech.people.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.management.app.dao.PeopleManagementDao;
import com.infotech.people.management.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> getPersonInfoByLastName(String lastName) {
		// TODO Auto-generated method stub
		return peopleManagementDao.findBylastNamePersonInfo(lastName);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {
		// TODO Auto-generated method stub
		return peopleManagementDao.getfindByFirstNameAndEmail(firstName, email);
	}

}

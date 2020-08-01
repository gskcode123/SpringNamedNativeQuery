package com.infotech.people.management.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.people.management.app.entities.Person;
import com.infotech.people.management.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//getPersonsInfoByLastName();
		getPersonInfoByFirstNameAndEmail();

	}

	private void getPersonInfoByFirstNameAndEmail() {
		// TODO Auto-generated method stub
		List<Person> personList = peopleManagementService.getPersonInfoByFirstNameAndEmail("ganesh","ganeshmrr12@gmail.com");
		personList.forEach(System.out::println);
		
	}

	private void getPersonsInfoByLastName() {
		// TODO Auto-generated method stub
		List<Person> personList  = peopleManagementService.getPersonInfoByLastName("Swami");
		personList.forEach(System.out::println);
		
	}

}

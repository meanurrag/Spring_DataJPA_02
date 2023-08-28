package com.anurag;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anurag.entity.User;
import com.anurag.repository.UserRepository;

@SpringBootApplication
public class DataJpa02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpa02Application.class, args);
		
		UserRepository ur = context.getBean(UserRepository.class);
		/*
		User u = new User(101, "Putin", "Male", 50, "Russia");
		
		//save one data 
		ur.save(u);
		
		//save multiple data
		User u1 = new User(102, "Biden", "Male", 70, "USA");
		User u2 = new User(103, "Modi", "Male", 60, "India");
		User u3 = new User(104, "Macron", "Male", 40, "France");
		ur.saveAll(Arrays.asList(u1,u2,u3));
		
		//print data
		Optional<User> findById = ur.findById(103);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		*/
		
		/*List<User> findByAge = ur.findByAge(60);
		findByAge.forEach(User -> {
			System.out.println(User);
			});*/
		
		/*List<User> findByCountryIn = ur.findByCountryIn(Arrays.asList("India","Russia"));
		findByCountryIn.forEach(User -> {
			System.out.println(User);
		});*/
		
	}
}

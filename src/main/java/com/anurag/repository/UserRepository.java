package com.anurag.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.anurag.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public List<User> findByAge(Integer age);
	public List<User> findByCountryIn(Collection<String> c);
}

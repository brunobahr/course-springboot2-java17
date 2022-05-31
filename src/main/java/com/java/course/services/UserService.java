package com.java.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.course.UserRepository;
import com.java.course.entities.Users;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}

	public Users findById(Long id){
		Optional<Users> obj = repository.findById(id);
		return obj.get();
	}
}

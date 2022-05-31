package com.java.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.course.entities.Users;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<Users> findAll(){
		Users u = new Users (1L, "Mary", "mary@gmail.com", "999885544", "123456");
		return ResponseEntity.ok().body(u);
	}
}

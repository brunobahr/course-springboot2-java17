package com.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.course.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}

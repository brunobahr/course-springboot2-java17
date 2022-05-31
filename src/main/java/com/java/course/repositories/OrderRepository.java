package com.java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

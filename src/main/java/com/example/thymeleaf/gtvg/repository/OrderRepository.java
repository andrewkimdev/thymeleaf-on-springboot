package com.example.thymeleaf.gtvg.repository;

import com.example.thymeleaf.gtvg.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {}

package com.example.thymeleaf.gtvg.service;

import com.example.thymeleaf.gtvg.model.Order;
import com.example.thymeleaf.gtvg.repository.OrderRepository;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final OrderRepository repo;

  public OrderService(OrderRepository repo) {
    this.repo = repo;
  }

  public List<Order> findAll() {
    return repo.findAll();
  }

  public Order findById(Integer orderId) {
    return repo.findById(orderId)
        .orElseThrow(() -> new NoSuchElementException("No order found by ID: " + orderId));
  }
}

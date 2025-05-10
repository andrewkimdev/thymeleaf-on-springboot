package com.example.thymeleaf.gtvg.service;

import com.example.thymeleaf.gtvg.model.Customer;
import com.example.thymeleaf.gtvg.repository.CustomerRepository;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  private final CustomerRepository repo;

  public CustomerService(CustomerRepository repo) {
    this.repo = repo;
  }

  public List<Customer> findAll() {
    return this.repo.findAll();
  }

  public Customer findById(Integer id) {
    return this.repo
        .findById(id)
        .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
  }
}

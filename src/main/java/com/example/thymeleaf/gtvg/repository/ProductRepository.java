package com.example.thymeleaf.gtvg.repository;

import com.example.thymeleaf.gtvg.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {}

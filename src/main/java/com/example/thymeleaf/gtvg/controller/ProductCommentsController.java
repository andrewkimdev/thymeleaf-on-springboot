package com.example.thymeleaf.gtvg.controller;

import com.example.thymeleaf.gtvg.model.Product;
import com.example.thymeleaf.gtvg.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/product/comments")
@Controller
public class ProductCommentsController {

  private final ProductService service;

  ProductCommentsController(ProductService service) {
    this.service = service;
  }

  @ModelAttribute("prod")
  public Product getProductById(@RequestParam("prodId") Integer prodId) {
    return this.service.findById(prodId);
  }

  @GetMapping()
  public String getProductComments() {
    return "/product/comments";
  }
}

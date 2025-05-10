package com.example.thymeleaf.gtvg.controller;

import com.example.thymeleaf.gtvg.model.Order;
import com.example.thymeleaf.gtvg.service.OrderService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
@Controller
public class OrderListController {

  private final OrderService service;

  public OrderListController(OrderService service) {
    this.service = service;
  }

  @ModelAttribute("orders")
  public List<Order> getOrders() {
    return service.findAll();
  }

  @GetMapping("list")
  public String getList() {
    return "order/list";
  }
}

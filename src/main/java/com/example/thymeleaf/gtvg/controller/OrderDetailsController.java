package com.example.thymeleaf.gtvg.controller;

import com.example.thymeleaf.gtvg.model.Order;
import com.example.thymeleaf.gtvg.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order/details")
public class OrderDetailsController {

  private final OrderService service;

  public OrderDetailsController(OrderService service) {
    this.service = service;
  }

  @ModelAttribute("order")
  private Order getOrderById(@RequestParam("orderId") Integer orderId) {
    return service.findById(orderId);
  }

  @GetMapping("")
  public String getOrderDetails() {
    return "order/details";
  }
}

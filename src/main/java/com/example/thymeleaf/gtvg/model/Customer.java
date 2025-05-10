package com.example.thymeleaf.gtvg.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  @Column(name = "CUSTOMER_SINCE")
  private LocalDate customerSince;

  public Customer() {}

  @OneToMany(
      mappedBy = "customer",
      cascade = CascadeType.ALL,
      orphanRemoval = true,
      fetch = FetchType.LAZY)
  private final List<Order> orders = new ArrayList<>();

  public Customer(Integer id, String name, LocalDate customerSince) {
    this.id = id;
    this.name = name;
    this.customerSince = customerSince;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getCustomerSince() {
    return customerSince;
  }

  public void setCustomerSince(LocalDate customerSince) {
    this.customerSince = customerSince;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void addOrder(Order newOrder) {
    this.orders.add(newOrder);
    newOrder.setCustomer(this);
  }

  public void removeOrder(Order order) {
    order.setCustomer(null);
    this.orders.remove(order);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Customer customer = (Customer) obj;
    return Objects.equals(id, customer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Customer{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", customerSince="
        + customerSince
        + '}';
  }
}

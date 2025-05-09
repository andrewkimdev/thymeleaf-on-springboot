package kimbi.thymeleaf.gtvg.model;

import jakarta.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  @Column(name = "CUSTOMER_SINCE")
  private Calendar customerSince;

  public Customer() {}

  public Customer(Integer id, String name, Calendar customerSince) {
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

  public Calendar getCustomerSince() {
    return customerSince;
  }

  public void setCustomerSince(Calendar customerSince) {
    this.customerSince = customerSince;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}

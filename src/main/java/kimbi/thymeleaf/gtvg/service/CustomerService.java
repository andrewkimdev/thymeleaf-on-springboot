package kimbi.thymeleaf.gtvg.service;

import java.util.List;
import java.util.NoSuchElementException;
import kimbi.thymeleaf.gtvg.model.Customer;
import kimbi.thymeleaf.gtvg.repository.CustomerRepository;
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

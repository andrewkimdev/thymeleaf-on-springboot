package kimbi.thymeleaf.gtvg.repository;

import kimbi.thymeleaf.gtvg.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {}

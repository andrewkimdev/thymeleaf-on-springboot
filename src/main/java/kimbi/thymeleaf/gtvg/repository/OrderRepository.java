package kimbi.thymeleaf.gtvg.repository;

import kimbi.thymeleaf.gtvg.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}

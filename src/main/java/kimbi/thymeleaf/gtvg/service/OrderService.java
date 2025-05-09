package kimbi.thymeleaf.gtvg.service;

import kimbi.thymeleaf.gtvg.model.Order;
import kimbi.thymeleaf.gtvg.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public List<Order> findAll() {
        return repo.findAll();
    }
}

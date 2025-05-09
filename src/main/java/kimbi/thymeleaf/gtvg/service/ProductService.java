package kimbi.thymeleaf.gtvg.service;

import java.util.List;
import java.util.NoSuchElementException;
import kimbi.thymeleaf.gtvg.model.Product;
import kimbi.thymeleaf.gtvg.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  private final ProductRepository repo;

  public ProductService(ProductRepository repo) {
    this.repo = repo;
  }

  public List<Product> findAll() {
    return this.repo.findAll();
  }

  public Product findById(Integer id) {
    return this.repo
        .findById(id)
        .orElseThrow(() -> new NoSuchElementException("Product not found with id: " + id));
  }
}

package kimbi.thymeleaf.gtvg.controller;

import java.util.List;
import kimbi.thymeleaf.gtvg.model.Product;
import kimbi.thymeleaf.gtvg.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
@Controller()
public class ProductListController {
  private final ProductService service;

  public ProductListController(ProductService service) {
    this.service = service;
  }

  @ModelAttribute("prods")
  private List<Product> findAllProducts() {
    return service.findAll();
  }

  @GetMapping("list")
  public String getProductList() {
    return "product/list";
  }
}

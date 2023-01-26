package com.example.product;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    //CRUD
    //C create insert POST
    //R read GET
    //U update PUT
    //D delete DELETE

    @PostMapping("/insertProduct")
    public int insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

    @GetMapping("/product")
    public List<Product> readProduct() {
        return productService.readProduct();
    }

    @DeleteMapping("/product/{productId}")
    public int deleteProduct(@PathVariable int productId) {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/product/{productId}")
    public Product readProductDetail(@PathVariable int productId) {
        return productService.readProductDetail(productId);
    }

    @GetMapping("/product/search/{productId}")
    public String searchProduct (@PathVariable String searchName) {
        return productService.searchProduct(searchName);
    }
}

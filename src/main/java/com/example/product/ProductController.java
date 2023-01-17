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

    @GetMapping("")
    public List<Product> readProduct() {
        return productService.readProduct();
    }

    @DeleteMapping("{productId}")
    public int deleteProduct(@PathVariable int productId) {
        return productService.deleteProduct(productId);
    }
}

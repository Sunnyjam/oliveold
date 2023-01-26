package com.example.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;

    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    public List<Product> readProduct() {
        return productMapper.readProduct();
    }

    public int deleteProduct(int productId) {
        return productMapper.deleteProduct(productId);
    }

    public Product readProductDetail(int productId) {
        return productMapper.readProductDetail(productId);
    }

    public Product searchProduct( ) throws Exception {
        String searchName = System.getenv().toString();
        return productMapper.searchProduct( String searchName);
    }
}
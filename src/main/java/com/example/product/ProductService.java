package com.example.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;

    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }
}

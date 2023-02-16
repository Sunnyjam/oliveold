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

//    public String searchProduct( ) throws Exception {
//        String searchName = System.getenv().toString();
//        return productMapper.searchProduct( );
//    }

    public int heartCount(int userId, int productId) {
        return productMapper.heartCount(userId, productId);
    }

    public int insertHeart(Product product) {
        return productMapper.insertHeart(product);
    }

    public int deleteHeart(int id) {
        return productMapper.deleteHeart(id);
    }

    public List<Product> readHeart(int userId, int productId) {
        return productMapper.readHeart(userId, productId);
    }
}
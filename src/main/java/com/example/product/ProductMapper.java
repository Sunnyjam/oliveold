package com.example.product;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    int insertProduct(Product product);
}

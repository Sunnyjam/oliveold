package com.example.cart;

import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface CartMapper {

    int insertCart(Cart cart);

    String deleteCart(String productName);
}

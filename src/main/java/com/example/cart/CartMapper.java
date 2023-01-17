package com.example.cart;

import org.apache.ibatis.annotations.Mapper;

@Mapper

public class CartMapper {

    int insertCart(Cart cart);

    String deleteCart(Cart cart);
}

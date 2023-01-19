package com.example.cart;

import com.example.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    int insertCart(Cart cart);

    int deleteCart(int cartId);

    List<Cart> readCart();

}

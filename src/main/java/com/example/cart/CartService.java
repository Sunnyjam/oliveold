package com.example.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    CartMapper cartMapper;

    public int insertCart(Cart cart) {
        return cartMapper.insertCart(cart);
    }
   /* public List<Cart> readCart() {
        return cartMapper.readCart();
    }*/

    public int deleteCart(Cart cart) {
        return cartMapper.deleteCart(cart);
    }
}

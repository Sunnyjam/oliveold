package com.example.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    public String deleteCart(String productName) {
        return cartMapper.deleteCart(productName);
    }
}

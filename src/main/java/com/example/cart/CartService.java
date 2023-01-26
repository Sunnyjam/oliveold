package com.example.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartMapper cartMapper;

    public int insertCart ( Cart cart) {
        return cartMapper.insertCart(cart);
    }

    public Cart readCart() {
        return cartMapper.readCart();
    }

    public int deleteCart ( int cartId) {
        return cartMapper.deleteCart (cartId);
    }

    public Cart readCartDetail (int cartId) {
        return cartMapper.readCartDetail(cartId);
    }

}

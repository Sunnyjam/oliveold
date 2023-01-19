package com.example.cart;

import com.example.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartMapper cartMapper;

    public int insertCart(Cart cart) {
        return cartMapper.insertCart(cart);
    }
   /* public List<Cart> readCart() {
        return cartMapper.readCart();
    }*/

    public int deleteCart(int cartId) {
        return cartMapper.deleteCart(cartId);
    }

    public List<Cart> readCart() {
        return cartMapper.readCart();
    }
}

package com.example.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CartController {

    private final CartService cartService;

    @PostMapping("/insertCart")
    public int insertCart (@RequestBody Cart cart) {
        return cartService.insertCart(cart);
    }

    @DeleteMapping("/cart/{cartId}")
    public int deleteCart(@PathVariable int cartId) {
        return cartService.deleteCart(cartId);
    }

    @GetMapping("/cart")
    public List<Cart> readCart() {
        return cartService.readCart();
    }


}

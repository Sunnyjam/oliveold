package com.example.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CartController {

    CartService cartService;

    @PostMapping("")

    public int insertCart(@RequestBody Cart cart) {
        return cartService.insertCart(cart);
    }

    @DeleteMapping("{productName}")
    public String deleteCart(@PathVariable String productName) {
        return cartService.deleteCart(productName);
    }
}

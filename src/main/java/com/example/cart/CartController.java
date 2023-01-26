package com.example.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CartController {

    private final CartService cartService;

    // todo 전체조회, 저장, 삭제, 상세 (product 참고)
    // 저장 API 는 Product 를 유의해서 만들어야됨
    // productId, price, productName

    @PostMapping("/insertCart")
    public int insertCart(@RequestBody Cart cart) {
        return cartService.insertCart(cart);
    }

    @GetMapping("/cart")
    public Cart readCart () {
        return cartService.readCart();
    }

    @DeleteMapping("/cart/{cartId}")
    public int deleteCart (@PathVariable int cartId) {
        return cartService.deleteCart( cartId);
    }

    @GetMapping("/cart/{cartId}")
    public Cart readCartDetail (@PathVariable int cartId) {
        return cartService.readCartDetail(cartId);
    }

}

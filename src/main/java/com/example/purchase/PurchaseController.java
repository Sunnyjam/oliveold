package com.example.purchase;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class PurchaseController {
    private final PurchaseService purchaseService;

    @PostMapping("/insertPurchase")
    public int insertPurchase(@RequestBody Purchase purchase) {
        return purchaseService.insertPurchase(purchase);
    }
    @GetMapping("/{email}")
    public String wishPurchase(Purchase purchase) {
        return purchaseService.wishPurchase(purchase);
    }
    @GetMapping("/{productId}")
    public String wish(Purchase purchase) {
        return purchaseService.wish(purchase);
    }
}

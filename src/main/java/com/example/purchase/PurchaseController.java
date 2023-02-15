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
   @DeleteMapping("/deletePurchase/{productid}")
    public int deletePurchase(@PathVariable int productid) {
        return purchaseService.deletePurchase(productid);
   }

   @GetMapping("/readPurchase")
    public Purchase readPurchase() {
        return purchaseService.readPurchase();
   }
}

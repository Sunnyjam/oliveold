package com.example.purchase;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PurchaseController {
    private final PurchaseService purchaseService;

    @PostMapping("/insertPurchase")
    public int insertPurchase(@RequestBody Purchase purchase) {
        return purchaseService.insertPurchase(purchase);
    }
   @DeleteMapping("/deletePurchase/{purchaseId}")
    public int deletePurchase(@PathVariable int purchaseId) {
        return purchaseService.deletePurchase(purchaseId);
   }

   @GetMapping("/readPurchase")
    public List<Purchase> readPurchase() {
        return purchaseService.readPurchase();
   }
}

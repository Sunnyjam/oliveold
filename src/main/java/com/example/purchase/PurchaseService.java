package com.example.purchase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseMapper purchaseMapper;
    public int insertPurchase (Purchase purchase) {
        return purchaseMapper.insertPurchase(purchase);
    }
    public String wishPurchase(Purchase purchase) {
        return purchaseMapper.wishPurchase(purchase);
    }
    public String wish(Purchase purchase) {
        return purchaseMapper.wish(purchase);
    }

}

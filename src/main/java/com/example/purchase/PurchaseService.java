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
    public int deletePurchase(int productid) {
        return purchaseMapper.deletePurchase(productid);
    }

    public Purchase readPurchase() {
        return purchaseMapper.readPurchase();
    }
}

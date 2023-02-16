package com.example.purchase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseMapper purchaseMapper;
    public int insertPurchase (Purchase purchase) {
        return purchaseMapper.insertPurchase(purchase);
    }
    public int deletePurchase(int purchaseId) {
        return purchaseMapper.deletePurchase(purchaseId);
    }

    public List<Purchase> readPurchase() {
        return purchaseMapper.readPurchase();
    }
}

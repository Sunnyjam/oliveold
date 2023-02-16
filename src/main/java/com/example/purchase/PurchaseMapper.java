package com.example.purchase;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    int insertPurchase(Purchase purchase);
    int deletePurchase(int purchaseId);
    List<Purchase> readPurchase();

}

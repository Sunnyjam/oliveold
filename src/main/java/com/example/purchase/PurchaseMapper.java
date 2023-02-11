package com.example.purchase;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseMapper {
    int insertPurchase(Purchase purchase);
    String wishPurchase(Purchase purchase);
    String wish(Purchase purchase);

}

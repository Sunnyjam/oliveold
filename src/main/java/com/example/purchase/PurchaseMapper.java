package com.example.purchase;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseMapper {
    int insertPurchase(Purchase purchase);
    int deletePurchase(int productid);
    Purchase readPurchase();

}

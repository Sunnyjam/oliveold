package com.example.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private int productId;
    private String productName;
    private String content;
    private int price;
    private int stock;
    private int sellPrice;
    private String productStatus;
    private String createdAt;
    private String updateAt;
    private String search;

    private int userId;
    private int heartCount;
    private int id;
}

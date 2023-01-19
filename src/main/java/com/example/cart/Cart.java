package com.example.cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cart {
        private int cartId;
        private String productName;
        private int box;
        private int amount;
        private int stock;
//        private int freeShipping;
        private int productId;
        private int price;
    }


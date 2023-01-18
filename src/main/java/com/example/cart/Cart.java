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
        private String productName;
        private int get;
        private int amount;
        private int stock;
        private int freeShippung;
    }


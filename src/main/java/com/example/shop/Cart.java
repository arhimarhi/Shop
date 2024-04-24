package com.example.shop;

import java.util.ArrayList;
import java.util.List;

    public class Cart {
        List<Product> cartItems = new ArrayList<>();

        public void ToCart(Product product) {
            cartItems.add(product);
        }
    }

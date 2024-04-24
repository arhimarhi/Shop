package com.example.shop;

import java.util.*;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product("1", "Pikachu", 100));
        products.add(new Product("2", "Raichuu", 200));
        products.add(new Product("3", "Pichuu", 300));
    }

    public void AllProducts() {
        for (Product product : products) {
            System.out.println(product.getId() + " " + product.getName() + " " + product.cost);
        }
    }

    public Product findByName(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}

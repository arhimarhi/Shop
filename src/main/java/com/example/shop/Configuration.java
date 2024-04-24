package com.example.shop;

public class Configuration {


    public ProductService productService() {
        return new ProductService();
    }

    @Bean
    public Cart cart() {
        return new Cart();
    }

    @Bean
    public OrderService orderService() {
        return new OrderService();
    }
}
}

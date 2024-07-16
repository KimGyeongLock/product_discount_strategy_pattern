package com.example.strategy.context;

import com.example.strategy.strategy.DiscountStrategy;

public class Product {
    private final String name;
    private final double price;
    private DiscountStrategy discountStrategy;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void applyDiscount() {
        if(discountStrategy != null) {
            double discountedPrice = discountStrategy.applyDiscount(price);
            System.out.println("Product:" + name);
            System.out.println("Original Price: " + price);
            System.out.println("Discount Type: " + discountStrategy.getDiscountType());
            System.out.println("Discounted Price: " + discountedPrice);
        } else {
            System.out.println("No discount applied.");
        }
    }
}

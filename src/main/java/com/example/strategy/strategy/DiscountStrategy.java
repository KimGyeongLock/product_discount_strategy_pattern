package com.example.strategy.strategy;

public interface DiscountStrategy {
    double applyDiscount(double price);
    String getDiscountType();
}

package com.example.strategy.concrete_strategy;

import com.example.strategy.strategy.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {
    private final double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1 - discountPercentage/100);
    }

    @Override
    public String getDiscountType() {
        return "Percentage Discount";
    }
}

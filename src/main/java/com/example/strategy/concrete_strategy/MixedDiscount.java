package com.example.strategy.concrete_strategy;

import com.example.strategy.strategy.DiscountStrategy;

public class MixedDiscount implements DiscountStrategy {
    private final double fixedAmount;
    private final double discountPercentage;

    public MixedDiscount(double fixedAmount, double discountPercentage) {
        this.fixedAmount = fixedAmount;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double price) {
        double discountedPrice = price - fixedAmount;
        return discountedPrice * (1 - discountPercentage / 100);
    }

    @Override
    public String getDiscountType() {
        return "Mixed Discount";
    }
}

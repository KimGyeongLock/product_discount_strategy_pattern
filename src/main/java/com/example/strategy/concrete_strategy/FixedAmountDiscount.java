package com.example.strategy.concrete_strategy;

import com.example.strategy.strategy.DiscountStrategy;

public class FixedAmountDiscount implements DiscountStrategy {
    private final double discountAmount;

    public FixedAmountDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discountAmount;
    }

    @Override
    public String getDiscountType() {
        return "Fixed Amount Discount";
    }
}

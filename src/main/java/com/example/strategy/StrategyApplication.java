package com.example.strategy;

import com.example.strategy.context.Product;
import com.example.strategy.concrete_strategy.FixedAmountDiscount;
import com.example.strategy.concrete_strategy.MixedDiscount;
import com.example.strategy.concrete_strategy.PercentageDiscount;
import com.example.strategy.strategy.DiscountStrategy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 600);

        DiscountStrategy fixedDiscount = new FixedAmountDiscount(100);
        DiscountStrategy percentageDiscount = new PercentageDiscount(10);
        DiscountStrategy mixedDiscount = new MixedDiscount(50, 5);

        product1.setDiscountStrategy(fixedDiscount);
        product1.applyDiscount();

        System.out.println();

        product2.setDiscountStrategy(percentageDiscount);
        product2.applyDiscount();

        System.out.println();

        product1.setDiscountStrategy(mixedDiscount);
        product1.applyDiscount();
    }

}

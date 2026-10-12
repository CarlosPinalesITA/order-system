package com.carlospinales.ordersystem.discount;

public class PremiumDiscount implements DiscountPolicy{
    @Override
    public double apply(double total){
        return total*0.90;
    }

}

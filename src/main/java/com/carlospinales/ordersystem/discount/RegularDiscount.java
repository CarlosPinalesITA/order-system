package com.carlospinales.ordersystem.discount;

public class RegularDiscount implements DiscountPolicy{
    @Override
    public double apply(double total){
        return total;
    }
}

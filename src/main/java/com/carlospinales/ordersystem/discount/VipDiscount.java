package com.carlospinales.ordersystem.discount;

public class VipDiscount implements DiscountPolicy{
    @Override
    public double apply(double total){
        return total*0.80;
    }
}

package com.carlospinales.ordersystem.discount;

public class EmployeeDiscount implements DiscountPolicy{
    @Override
    public double apply(double total){
        return total*0.70;
    }
}

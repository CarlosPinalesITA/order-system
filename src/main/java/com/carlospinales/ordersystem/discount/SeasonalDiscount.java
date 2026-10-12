package com.carlospinales.ordersystem.discount;

public class SeasonalDiscount implements DiscountPolicy {
    @Override
    public double apply(double total) {
        /*if(total < 500){
            throw new IllegalArgumentException("Only for totals of 500 or more"); The code throws an exception because SeasonalDiscount has a condition:
        }                                                                         it only accepts totals of 500 or more.
        return total * 0.85;                                                      This is a problem because the code expects any DiscountPolicy to work with any total.*/
        if (total < 500){
            return total;
        }
        return total * 0.85;

    }
}

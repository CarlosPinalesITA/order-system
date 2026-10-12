package com.carlospinales.ordersystem.discount;

public interface DiscountPolicy {
    double apply(double total); /*quien sea una política de descuento debe saber recibir un total y devolver el total con descuento”*/
}

package com.carlospinales.ordersystem.discount;
/*FACTORY: LOS CAMBIOS ESTAN CONTROLADOS*/
public class DiscountPolicyFactory {
    public static DiscountPolicy create(String custommerType) {
        return switch (custommerType) {
            case "REGULAR" -> new RegularDiscount();
            case "PREMIUM" -> new PremiumDiscount();
            case "VIP" -> new VipDiscount();
            case "EMPLOYEE" -> new EmployeeDiscount();
            default -> throw new IllegalArgumentException("Unknow custommer type: " + custommerType);
        };
    }
}

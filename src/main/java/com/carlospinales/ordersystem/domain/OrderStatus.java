package com.carlospinales.ordersystem.domain;

/*sealed: Solo ciertas clases pueden implementarlas*/

public sealed interface OrderStatus permits Pending, Paid, Shipped, Cancelled{
}

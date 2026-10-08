package com.carlospinales.ordersystem.domain;

/*We use records because the constructor is already created and they are immutable.*/
/*immutable: Immutable means the object cannot be changed after it is created.*/

public record OrderItem(String productName, int quantity, double unitPrice) {
}

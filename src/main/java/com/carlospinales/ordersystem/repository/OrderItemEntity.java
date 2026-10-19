package com.carlospinales.ordersystem.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Anotación que le dice a JPA: “esta clase se guarda en la base de datos”.
@Table(name = "order_item") //Define el nombre de la tabla.
public class OrderItemEntity {
    @Id //Marca el campo que es la llave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //La base de datos genera el valor automáticamente (el id autoincremental).
    private Long id;

    private String productName;
    private int quantity;
    private double unitPrice;

    protected OrderItemEntity(){
        // required  by JPA
    }
    public OrderItemEntity(String productName, int quantity, double unitPrice){
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Long getID(){
        return id;
    }

    public String getProductName(){
        return productName;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

}

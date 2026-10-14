package com.carlospinales.ordersystem.repository;
import com.carlospinales.ordersystem.domain.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOrderStorage implements OrderStorage{
    private final List<OrderItem> saved = new ArrayList<>();

    @Override
    public void save (List<OrderItem> items){
        saved.addAll(items);
        System.out.println("Saved in memory. Total items stored: " + saved.size());
    }
}

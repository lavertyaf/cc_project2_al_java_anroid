package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Consumables.Item;

import java.util.ArrayList;

public class Order {

    private ArrayList<Item> order;
    private double total;
    private Item item;

    public Order(ArrayList<Item> order, double total) {
        this.order = order;
        this.total = total;
    }

    public ArrayList<Item> getOrder() {
        return order;
    }

    public double getTotal() {
        return total;
    }

    public Item getItem() {
        return item;
    }

    public void addToOrder(){
        order.add(item);
    }
}

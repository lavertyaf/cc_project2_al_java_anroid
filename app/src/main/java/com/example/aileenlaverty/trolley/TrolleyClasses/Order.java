package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Consumables.Item;

import java.util.ArrayList;

public class Order {

    private ArrayList<Item> order;
    private Item item;

    public Order(ArrayList<Item> order) {
        this.order = order;
    }

    public ArrayList<Item> getOrder() {
        return order;
    }

    public Item getItem() {
        return item;
    }

    public void addToOrder(){
        order.add(item);
    }
}

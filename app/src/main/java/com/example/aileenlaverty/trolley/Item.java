package com.example.aileenlaverty.trolley;

import java.io.Serializable;

public class Item implements Serializable{

    private String name;
    private double price;
    private ItemType itemType;
    private int amount;

    public Item(String name, double price, ItemType itemType, int amount) {
        this.name = name;
        this.price = price;
        this.itemType = itemType;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public int getAmount() {
        return amount;
    }

    public void decreaseAmountBy1(){
        amount -= 1;
    }
}

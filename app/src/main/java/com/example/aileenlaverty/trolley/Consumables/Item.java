package com.example.aileenlaverty.trolley.Consumables;

public class Item {

    private String name;
    private double price;
    private ItemType itemType;

    public Item(String name, double price, ItemType itemType) {
        this.name = name;
        this.price = price;
        this.itemType = itemType;
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
}

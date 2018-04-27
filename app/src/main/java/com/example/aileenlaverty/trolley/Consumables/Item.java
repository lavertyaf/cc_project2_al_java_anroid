package com.example.aileenlaverty.trolley.Consumables;

public class Item {

    private String name;
    private double price;
    private ItemType itemType;
    private int PLU;

    public Item(String name, double price, ItemType itemType, int PLU) {
        this.name = name;
        this.price = price;
        this.itemType = itemType;
        this.PLU = PLU;
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

    public int getPLU() {
        return PLU;
    }
}

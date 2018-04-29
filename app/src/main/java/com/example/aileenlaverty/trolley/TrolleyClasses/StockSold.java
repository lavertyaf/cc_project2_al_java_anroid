package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Consumables.Item;

import java.util.ArrayList;

public class StockSold {

    private ArrayList<Item> soldList;
    private double till;
    private Item item;

    public StockSold(ArrayList<Item> soldList, double till) {
        this.soldList = soldList;
        this.till = till;
    }

    public ArrayList<Item> getSoldList() {
        return soldList;
    }

    public double getTill() {
        return till;
    }

    public void addToSoldList(Item item){
        this.soldList.add(item);
    }


}

package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Consumables.Item;

import java.util.ArrayList;

public class Trolley {

    private ArrayList<Item> stockList;
    private Item item;

    public Trolley (ArrayList<Item> stockList){
        this.stockList = stockList;
        this.item = item;
    }

    public ArrayList<Item> getStockList() {
        return stockList;
    }

    public Item getItem() {
        return item;
    }
}

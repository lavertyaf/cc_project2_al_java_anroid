package com.example.aileenlaverty.trolley;

import com.example.aileenlaverty.trolley.Consumables.Item;
import com.example.aileenlaverty.trolley.Consumables.ItemType;

import java.util.ArrayList;

public class Items {

    private ArrayList<Item> list;

    public Items(){
        list = new ArrayList<Item>();
        list.add(new Item("Coffee", 2.50, ItemType.HOT_DRINK, 10));
        list.add(new Item("Coke",2.00, ItemType.COLD_DRINK, 11));
        list.add(new Item("Diet Coke", 2.00, ItemType.COLD_DRINK, 13));
        list.add(new Item("Tonic", 2.00, ItemType.COLD_DRINK, 14));
        list.add(new Item("Tea", 2.50, ItemType.HOT_DRINK, 15));
        list.add(new Item("Beer", 4.00, ItemType.COLD_DRINK, 16));
        list.add(new Item("White wine", 4.50, ItemType.COLD_DRINK, 17));
        list.add(new Item("Red wine", 4.50, ItemType.COLD_DRINK, 18));
        list.add(new Item("Vodka", 4.00, ItemType.HOT_DRINK, 19));
        list.add(new Item("Gin", 4.00, ItemType.COLD_DRINK, 20));
        list.add(new Item("Whisky",4.00, ItemType.COLD_DRINK, 21));
        list.add(new Item("Lemonade", 2.00, ItemType.COLD_DRINK, 22));
        list.add(new Item("Hot Chocolate", 2.00, ItemType.HOT_DRINK, 23));
        list.add(new Item("Nuts", 1.50, ItemType.COLD_FOOD, 50));
        list.add(new Item("Cookie", 1.00, ItemType.COLD_FOOD, 51));
        list.add(new Item("Crisps", 1.00, ItemType.COLD_FOOD, 52));
        list.add(new Item("Kit Kat", 1.00, ItemType.COLD_FOOD, 53));
        list.add(new Item("Cheese & Ham Panini", 4.00, ItemType.HOT_FOOD, 101));
        list.add(new Item("Pepperoni Mini Pizza", 4.00, ItemType.HOT_FOOD, 102));
        list.add(new Item("Cheese & Ham croissant", 3.50, ItemType.HOT_FOOD, 103));
    }

    public ArrayList<Item> getList() {
        return new ArrayList<Item>(list);
    }
}

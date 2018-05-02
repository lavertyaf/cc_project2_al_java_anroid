package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Order {

    private ArrayList<Item> orders;

    public Order(ArrayList<Item> order) {
        this.orders = order;
    }

    public Order() {
        orders = new ArrayList<Item>();
    }

    public ArrayList<Item> getOrderedItemList(){
        return new ArrayList<Item>(orders);
    }

    public HashMap<String, Integer> countSameItems(){
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for ( Item item :orders) {
            int amountBeforeAdding = result.getOrDefault(item.getName(), 0);
            int newAmount = amountBeforeAdding + 1;
            result.put(item.getName(), newAmount);
        }
        return result;
    }

    public String printItems() {
        String result = "";
        HashMap<String, Integer> stockCount = countSameItems();

        for (String aKey : stockCount.keySet()) {
            result += aKey + ": " + stockCount.get(aKey) + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

    public void addToOrder(Item item){
        orders.add(item);
    }

    public String getOrderItem(){
        String result = "";
        HashMap<String, Integer> order = countSameItems();
        for (String aKey : order.keySet()) {
            result += aKey + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

    public ArrayList<Item> getOrders() {
        return orders;
    }

    public double getOrderTotal(){
        double total = 0;
        for (Item itemInOrder:orders) {
            total += itemInOrder.getPrice();
        }
        return total;
    }
}

package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class StockSold {

    private ArrayList<Item> soldList;

    public StockSold(ArrayList<Item> soldList) {
        this.soldList = soldList;
    }

    public ArrayList<Item> getSoldList() {
        return soldList;
    }

    public void addToSoldList(Item item){
        this.soldList.add(item);
    }

    public HashMap<String, Integer> countSameItems(){
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for ( Item item :soldList) {
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
        soldList.add(item);
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


}

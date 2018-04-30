package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Consumables.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Trolley {

    private ArrayList<Item> stockList;
    private Item item;

    public Trolley (ArrayList<Item> stockList){
        this.stockList = stockList;
    }

    public ArrayList<Item> getStockList() {
        return stockList;
    }

    public int itemsInStockList(){
        return stockList.size();
    }

    public void addItemsToStockList(Item item){
        stockList.add(item);
    }

    public void sellItemFromStockList(Item item) {
        stockList.remove(item);
    }

    public int countSameItem(Item item){
        int result = 0;
        for (Item itemInList:stockList) {
            if (itemInList.getName() == item.getName()){
                result ++;
            }
        }
        return result;
    }

    public HashMap<String, Integer> countSameItems(){
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //for each element in stocklist
        for ( Item item :stockList) {
            //increase count of these type of items in hashmap
            int amountBeforeAdding = result.getOrDefault(item.getName(), 0);
            int newAmount = amountBeforeAdding + 1;
            result.put(item.getName(), newAmount);
        }

        return result;
    }

    //Cookie: 1, Coffee: 3 -> KeySet ["Cookie", "Coffee"]

    public String printItems(){
        String result = "";
        HashMap<String, Integer> stockCount = countSameItems();

        for (String aKey: stockCount.keySet()) {
            result += aKey + ": " + stockCount.get(aKey) + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

//    public String printItems(){
//        String listOfItems = "";
//        for (int i = 0; i < stockList.size() ; i++) {
//            if (stockList(item) == item)
//        }
//
//
//        return listOfItems;
//    }

//    public int itemsInStockList(){
//      Collection<Integer> itemsArray = this.stockList.values();
//      int sum = 0;
//      for(Integer i : itemsArray){
//          sum += i;
//      }
//      return sum;
//    }

//    public void addItem(String string, Integer increaseBy){
//        int countBefore = this.stockList.getOrDefault(string, 0);
//        int countAfter = countBefore + increaseBy;
//        this.stockList.put(string, countAfter);
//    }
//
//    public void sellItem(String string, Integer decreaseBy){
//        int countBefore = this.stockList.getOrDefault(string, 0);
//        int countAfter = countBefore - decreaseBy;
//        this.stockList.put(string, countAfter);
//
//    }

}

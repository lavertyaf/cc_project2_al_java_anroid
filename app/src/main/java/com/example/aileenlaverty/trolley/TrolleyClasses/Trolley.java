package com.example.aileenlaverty.trolley.TrolleyClasses;

import com.example.aileenlaverty.trolley.Consumables.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Trolley {

    private HashMap<String, Integer> stockList;
    //eg. <"Coffee", 3> if we have 3 Coffees

    public Trolley (HashMap<String, Integer> stockList){
        this.stockList = stockList;
    }

    public HashMap<String, Integer> getStockList() {
        return stockList;
    }

    public int itemsInStockList(){
      Collection<Integer> itemsArray = this.stockList.values();
      int sum = 0;
      for(Integer i : itemsArray){
          sum += i;
      }
      return sum;
    }

    public void addItem(String string, Integer increaseBy){
        int countBefore = this.stockList.getOrDefault(string, 0);
        int countAfter = countBefore + increaseBy;
        this.stockList.put(string, countAfter);
    }

    public void sellItem(String string, Integer decreaseBy){
        int countBefore = this.stockList.getOrDefault(string, 0);
        int countAfter = countBefore - decreaseBy;
        this.stockList.put(string, countAfter);

    }

}

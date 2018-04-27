package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Consumables.Item;
import com.example.aileenlaverty.trolley.Consumables.ItemType;
import com.example.aileenlaverty.trolley.TrolleyClasses.Trolley;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TrolleyTest {

    Trolley trolley;
    Item coffee;
    Item cookie;
    HashMap<Item, Integer> stockList;


    @Before
    public void before(){
        coffee = new Item("Coffee", 3.50, ItemType.DRINK, 12);
        cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 51);
        HashMap<String, Integer> stockList = new HashMap<>();
        trolley = new Trolley(stockList);
    }

    @Test
    public void trolleyStartsEmpty() {
        assertEquals(0, trolley.itemsInStockList());
    }

    @Test
    public void canAddItemsToTrolley(){
        trolley.addItem(coffee.getName(), 10);
        trolley.addItem(coffee.getName(), 1);
        trolley.addItem(cookie.getName(), 10);
        assertEquals(21, trolley.itemsInStockList());
    }

    @Test
    public void canSellItems(){
        trolley.addItem(coffee.getName(), 10);
        trolley.addItem(cookie.getName(), 10);
        trolley.sellItem(cookie.getName(), 1);
        assertEquals(19, trolley.itemsInStockList());
    }
}

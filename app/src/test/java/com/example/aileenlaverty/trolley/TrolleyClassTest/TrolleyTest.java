package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Consumables.Item;
import com.example.aileenlaverty.trolley.Consumables.ItemType;
import com.example.aileenlaverty.trolley.TrolleyClasses.Trolley;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TrolleyTest {

    Trolley trolley;
    Item coffee;
    Item cookie;
    ArrayList<Item> stockList;


    @Before
    public void before(){
        coffee = new Item("Coffee", 3.50, ItemType.DRINK);
        cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD);
        ArrayList<Item> stockList = new ArrayList<>();
        trolley = new Trolley(stockList);
    }

    @Test
    public void trolleyStartsEmpty() {
        assertEquals(0, trolley.itemsInStocklist());
    }

    @Test
    public void canAddItemsToTrolley(){
        trolley.addItem(coffee);
        trolley.addItem(cookie);
        assertEquals(2, trolley.itemsInStocklist());
    }

    @Test
    public void canSellItems(){
        trolley.addItem(coffee);
        trolley.addItem(cookie);
        trolley.sellItem(cookie);
        assertEquals(1, trolley.itemsInStocklist());
    }
}

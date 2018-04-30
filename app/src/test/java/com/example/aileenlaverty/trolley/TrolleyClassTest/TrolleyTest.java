package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.ItemType;
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
    ArrayList<Item> stockList;


    @Before
    public void before(){
        coffee = new Item("Coffee", 3.50, ItemType.HOT_DRINK, 10);
        cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 20);
        ArrayList<Item> stockList = new ArrayList<>();
        trolley = new Trolley(stockList);
    }

    @Test
    public void trolleyStartsEmpty() {
        assertEquals(0, trolley.itemsInStockList());
    }

    @Test
    public void canAddItemsToTrolley1(){
        trolley.addItemsToStockList(cookie);
        assertEquals(1, trolley.itemsInStockList());
    }

    @Test
    public void canAddItemsToTrolley2(){
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(coffee);
        assertEquals(2, trolley.itemsInStockList());
    }

    @Test
    public void canSellItems(){
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(cookie);
        trolley.sellItemFromStockList(cookie);
        assertEquals(1, trolley.itemsInStockList());
    }

    @Test
    public void canCountItemInStockList(){
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(cookie);
        assertEquals(2, trolley.countSameItem(coffee));
    }

    @Test
    public void canCountSameItems(){
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(cookie);
        HashMap<String, Integer> hashMapOfThings = trolley.countSameItems();
        assertEquals(new Integer(2), hashMapOfThings.get("Coffee"));
    }

    @Test
    public void canViewStockListSimple(){
        trolley.addItemsToStockList(coffee);
        assertEquals("Coffee: 1", trolley.printItems());
    }

    @Test
    public void canViewStockList(){
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(cookie);
        trolley.sellItemFromStockList(cookie);
        trolley.addItemsToStockList(coffee);
        trolley.addItemsToStockList(cookie);
        assertEquals("Cookie: 1, Coffee: 2", trolley.printItems());
    }
}

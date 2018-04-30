package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.ItemType;
import com.example.aileenlaverty.trolley.TrolleyClasses.StockSold;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StockSoldTest {

    Item coffee;
    Item cookie;
    ArrayList<Item> items;
    StockSold stockSold;


    @Before
    public void before(){
        coffee = new Item("Coffee", 2.50, ItemType.HOT_DRINK, 10);
        cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 10);
        items = new ArrayList<>();
        stockSold = new StockSold(items);
    }

    @Test
    public void canGetSoldList(){
        stockSold.addToSoldList(cookie);
        assertEquals(1, stockSold.getSoldList().size());
    }

    @Test
    public void canPrintSoldList(){
        stockSold.addToSoldList(cookie);
        stockSold.addToSoldList(coffee);
        assertEquals("Cookie: 1, Coffee: 1", stockSold.printItems());
    }

}

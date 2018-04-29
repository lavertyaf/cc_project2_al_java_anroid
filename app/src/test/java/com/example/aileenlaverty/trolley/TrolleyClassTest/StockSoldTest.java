package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Consumables.Item;
import com.example.aileenlaverty.trolley.Consumables.ItemType;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;
import com.example.aileenlaverty.trolley.TrolleyClasses.StockSold;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StockSoldTest {

    Item coffee;
    Item cookie;
    StockSold stockSold;


    @Before
    public void before(){
        coffee = new Item("Coffee", 2.50, ItemType.DRINK, 10);
        cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 51);
        ArrayList<Item> stockSold = new ArrayList<>();
        stockSold = new StockSold(stockSold, double)

    }

    @Test
    public void canGetSoldList(){
        stockSold.addToSoldList(cookie);
        assertEquals(0, stockSold.getSoldList());
    }

}

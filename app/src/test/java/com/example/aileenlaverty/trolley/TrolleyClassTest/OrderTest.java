package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Consumables.Item;
import com.example.aileenlaverty.trolley.Consumables.ItemType;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    Item coffee;
    Item cookie;
    ArrayList<Item> order;

    @Before
    public void before() {
    coffee = new Item("Coffee", 2.50, ItemType.DRINK, 10);
    cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 51);
    order = new ArrayList<>();
    }

    @Test
    public void canGetOrder(){
        order.add(coffee);
        assertEquals(coffee, order.getOrder);
    }

    @Test
    public void canGetTotal(){
        order.add(coffee);
        order.add(cookie);
        assertEquals(3.50, order.getTotal);
    }


}

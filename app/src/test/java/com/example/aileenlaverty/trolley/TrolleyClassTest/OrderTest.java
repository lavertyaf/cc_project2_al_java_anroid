package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.ItemType;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    Item coffee;
    Item cookie;
    Order order1;

    @Before
    public void before() {
    coffee = new Item("Coffee", 2.50, ItemType.HOT_DRINK, 10);
    cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 51);
    ArrayList<Item> order = new ArrayList<>();
    order1 = new Order(order);
    }

    @Test
    public void canGetOrder(){
        order1.addToOrder(coffee);
        order1.addToOrder(coffee);
        order1.addToOrder(coffee);
        order1.addToOrder(cookie);
        order1.addToOrder(cookie);
        assertEquals("Cookie: 2, Coffee: 3", order1.printItems());
    }


    @Test
    public void canAddToOrderSimple(){
        order1.addToOrder(cookie);
        assertEquals("Cookie", order1.getOrderItem());
    }

    @Test
    public void canAddToOrder(){
        order1.addToOrder(cookie);
        order1.addToOrder(coffee);
        assertEquals("Cookie, Coffee", order1.getOrderItem());
    }

}

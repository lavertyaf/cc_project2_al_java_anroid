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
    Order order1;

    @Before
    public void before() {
    coffee = new Item("Coffee", 2.50, ItemType.DRINK, 10);
    cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 51);
    ArrayList<Item> order = new ArrayList<>();
    order.add(coffee);
    order1 = new Order(order);
    }

//    @Test
//    public void canGetOrder(){
//        assertEquals(coffee.getName(), order1.toString());
//    }

//    @Test
//    public void canGetItemInOrder(){
//        assertEquals(coffee.getName(), order1.getItem());
//    }


//    @Test
//    public void canAddToOrder(){
//        order1.addToOrder(cookie);
//        assertEquals(0,order1.getOrder());
//    }


}

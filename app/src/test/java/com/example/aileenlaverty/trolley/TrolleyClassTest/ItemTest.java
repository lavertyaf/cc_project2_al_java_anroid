package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Consumables.Item;
import com.example.aileenlaverty.trolley.Consumables.ItemType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Item coffee;
    private Item coke;
    private Item dietCoke;
    private Item tonic;
    private Item lemonade;
    private Item tea;
    private Item beer;
    private Item whiteWine;
    private Item redWine;
    private Item vodka;
    private Item gin;
    private Item whisky;
    private Item hotChocolate;
    private Item nuts;
    private Item cookie;
    private Item crisps;
    private Item kitKat;
    private Item panini;
    private Item miniPizza;
    private Item croissant;



    @Before
    public void before(){
        coffee = new Item("Coffee", 2.50, ItemType.HOT_DRINK, 10);
        coke = new Item("Coke",2.00, ItemType.COLD_DRINK, 11);
        dietCoke = new Item("Diet Coke", 2.00, ItemType.COLD_DRINK, 13);
        tonic = new Item("Tonic", 2.00, ItemType.COLD_DRINK, 14);
        tea = new Item("Tea", 2.50, ItemType.HOT_DRINK, 15);
        beer = new Item("Beer", 4.00, ItemType.COLD_DRINK, 16);
        whiteWine = new Item("White wine", 4.50, ItemType.COLD_DRINK, 17);
        redWine = new Item("Red wine", 4.50, ItemType.COLD_DRINK, 18);
        vodka = new Item("Vodka", 4.00, ItemType.HOT_DRINK, 19);
        gin = new Item("Gin", 4.00, ItemType.COLD_DRINK, 20);
        whisky = new Item("Whisky",4.00, ItemType.COLD_DRINK, 21);
        lemonade = new Item("Lemonade", 2.00, ItemType.COLD_DRINK, 22);
        hotChocolate = new Item("Hot Chocolate", 2.00, ItemType.HOT_DRINK, 23);
        nuts = new Item("Nuts", 1.50, ItemType.COLD_FOOD, 50);
        cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 51);
        crisps = new Item("Crisps", 1.00, ItemType.COLD_FOOD, 52);
        kitKat = new Item("Kit Kat", 1.00, ItemType.COLD_FOOD, 53);
        panini = new Item("Cheese & Ham Panini", 4.00, ItemType.HOT_FOOD, 101);
        miniPizza = new Item("Pepperoni Mini Pizza", 4.00, ItemType.HOT_FOOD, 102);
        croissant = new Item("Cheese & Ham croissant", 3.50, ItemType.HOT_FOOD, 103);

    }

    @Test
    public void hasName(){
        assertEquals("Beer", beer.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(3.50, croissant.getPrice(), 0.001);
    }

    @Test
    public void hasItemType() {
        assertEquals(ItemType.COLD_FOOD, cookie.getItemType());
    }


}

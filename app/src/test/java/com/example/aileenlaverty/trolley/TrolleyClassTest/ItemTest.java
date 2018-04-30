package com.example.aileenlaverty.trolley.TrolleyClassTest;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.ItemType;

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
        coffee = new Item("Coffee", 2.50, ItemType.HOT_DRINK, 20);
        coke = new Item("Coke",2.00, ItemType.COLD_DRINK, 15);
        dietCoke = new Item("Diet Coke", 2.00, ItemType.COLD_DRINK, 15);
        tonic = new Item("Tonic", 2.00, ItemType.COLD_DRINK, 8);
        tea = new Item("Tea", 2.50, ItemType.HOT_DRINK, 20);
        beer = new Item("Beer", 4.00, ItemType.COLD_DRINK, 20);
        whiteWine = new Item("White wine", 4.50, ItemType.COLD_DRINK, 20);
        redWine = new Item("Red wine", 4.50, ItemType.COLD_DRINK, 20);
        vodka = new Item("Vodka", 4.00, ItemType.HOT_DRINK, 20);
        gin = new Item("Gin", 4.00, ItemType.COLD_DRINK, 20);
        whisky = new Item("Whisky",4.00, ItemType.COLD_DRINK, 20);
        lemonade = new Item("Lemonade", 2.00, ItemType.COLD_DRINK, 10);
        hotChocolate = new Item("Hot Chocolate", 2.00, ItemType.HOT_DRINK, 20);
        nuts = new Item("Nuts", 1.50, ItemType.COLD_FOOD, 25);
        cookie = new Item("Cookie", 1.00, ItemType.COLD_FOOD, 25);
        crisps = new Item("Crisps", 1.00, ItemType.COLD_FOOD, 15);
        kitKat = new Item("Kit Kat", 1.00, ItemType.COLD_FOOD, 25);
        panini = new Item("Cheese & Ham Panini", 4.00, ItemType.HOT_FOOD, 10);
        miniPizza = new Item("Pepperoni Mini Pizza", 4.00, ItemType.HOT_FOOD, 10);
        croissant = new Item("Cheese & Ham croissant", 3.50, ItemType.HOT_FOOD, 10);

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

    @Test
    public void hasAmount(){
        assertEquals(10, croissant.getAmount());
    }


}

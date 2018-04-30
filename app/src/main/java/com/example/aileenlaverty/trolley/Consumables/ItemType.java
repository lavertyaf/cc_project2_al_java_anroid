package com.example.aileenlaverty.trolley.Consumables;

public enum ItemType {

    HOT_DRINK("Hot Drink"),
    COLD_DRINK("Cold Drink"),
    HOT_FOOD("Hot food"),
    COLD_FOOD("Cold food");

    private String name;

    ItemType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

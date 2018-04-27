package com.example.aileenlaverty.trolley.Consumables;

public enum ItemType {

    DRINK("Drink"),
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

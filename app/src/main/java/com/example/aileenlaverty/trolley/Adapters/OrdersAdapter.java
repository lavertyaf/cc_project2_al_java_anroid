package com.example.aileenlaverty.trolley.Adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.aileenlaverty.trolley.Item;

import java.util.ArrayList;

public class OrdersAdapter extends ArrayAdapter<Item>{

    public OrdersAdapter(Context context, ArrayList<Item> orders){
        super(context, 0, orders);
    }

    public ArrayList<Integer> selectedIds = new ArrayList<Integer>();
}

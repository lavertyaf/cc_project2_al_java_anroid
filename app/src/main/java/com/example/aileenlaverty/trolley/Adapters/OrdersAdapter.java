package com.example.aileenlaverty.trolley.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.R;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

import java.util.ArrayList;

public class OrdersAdapter extends ArrayAdapter<Item> {


    public OrdersAdapter(Context context, ArrayList<Item> orders){
        super(context, 0, orders);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){


        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.order_detail, parent, false);
        }

        Item currentItem = getItem(position);

        TextView price = listItemView.findViewById(R.id.priceTextViewId);
        price.setText(String.format("%.2f", currentItem.getPrice()));

        TextView itemName = listItemView.findViewById(R.id.orderedItemNameTextViewId);
        itemName.setText(currentItem.getName().toString());

        listItemView.setTag(currentItem);

        return listItemView;

    }

}

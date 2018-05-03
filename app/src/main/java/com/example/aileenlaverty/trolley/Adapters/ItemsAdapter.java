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

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Item> {

    public ItemsAdapter(Context context, ArrayList<Item> items){
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){


        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_detail, parent, false);
        }

        ListView itemsListView = (ListView) parent;


        Item currentItem = getItem(position);
        
        TextView amount = listItemView.findViewById(R.id.priceTextViewId);
        amount.setText(String.valueOf(currentItem.getAmount()));

        TextView itemName = listItemView.findViewById(R.id.orderedItemNameTextViewId);
        itemName.setText(currentItem.getName().toString());

        listItemView.setTag(currentItem);

        if (itemsListView.isItemChecked(position)){
            listItemView.setBackgroundColor(getContext().getColor(R.color.colorPrimaryDark));
            itemName.setBackgroundColor(getContext().getColor(R.color.colorPrimaryDark));

        } else {
            listItemView.setBackgroundColor(getContext().getColor(R.color.colorAccent));
            itemName.setBackgroundColor(getContext().getColor(R.color.colorAccent));
        }

        return listItemView;

    }
}

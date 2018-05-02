package com.example.aileenlaverty.trolley.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EdgeEffect;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ItemsAdapter extends ArrayAdapter<Item> {

    public ItemsAdapter(Context context, ArrayList<Item> items){
        super(context, 0, items);
    }



    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
//    View listItemView = convertView;


        if (listItemView == null){
//            Inflater inflater;
//            listItemView = inflater.inflate(R.layout.item_detail, parent, false);
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_detail, parent, false);
        }

        ListView itemsListView = (ListView) parent;


        Item currentItem = getItem(position);
        
        TextView amount = listItemView.findViewById(R.id.amountTextViewId);
        amount.setText(String.valueOf(currentItem.getAmount()));

        TextView itemName = listItemView.findViewById(R.id.itemNameTextViewId);
        itemName.setText(currentItem.getName().toString());

        listItemView.setTag(currentItem);



        if (itemsListView.isItemChecked(position)){
            listItemView.setBackgroundColor(getContext().getColor(R.color.colorPrimaryDark));
        } else {
            listItemView.setBackgroundColor(getContext().getColor(R.color.colorAccent));
        }

        return listItemView;

    }
}

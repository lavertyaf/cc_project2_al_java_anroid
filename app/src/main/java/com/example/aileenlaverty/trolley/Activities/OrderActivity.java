package com.example.aileenlaverty.trolley.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.aileenlaverty.trolley.Adapters.OrdersAdapter;
import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.Adapters.ItemsAdapter;
import com.example.aileenlaverty.trolley.R;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        ArrayList<Item> orderedItems = (ArrayList<Item>) intent.getSerializableExtra("orderedItems");
        OrdersAdapter ordersAdapter = new OrdersAdapter(this, orderedItems);
        ListView orderedItemsListView = findViewById(R.id.orderedItemsListViewId);

        orderedItemsListView.setAdapter(ordersAdapter);
    }

}

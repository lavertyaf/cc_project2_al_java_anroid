package com.example.aileenlaverty.trolley.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.Items;
import com.example.aileenlaverty.trolley.ItemsAdapter;
import com.example.aileenlaverty.trolley.R;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Intent intent = getIntent();
        ArrayList<Item> itemsList = (ArrayList<Item>) intent.getSerializableExtra("itemsList");
        ItemsAdapter itemsAdapter = new ItemsAdapter(this, itemsList);
        ListView itemsListView = findViewById(R.id.itemsListViewId);

        itemsListView.setAdapter(itemsAdapter);
    }

    public void onItemClick(View listItem){
        Intent intent = new Intent(this, OrderActivity.class);
    }
}

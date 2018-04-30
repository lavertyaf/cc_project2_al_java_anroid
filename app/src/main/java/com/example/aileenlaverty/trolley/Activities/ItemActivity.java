package com.example.aileenlaverty.trolley.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.Adapters.ItemsAdapter;
import com.example.aileenlaverty.trolley.Items;
import com.example.aileenlaverty.trolley.R;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {

    private ArrayList<Item> orderList;


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
        intent.putExtra("orderList", orderList);
        startActivity(intent);
    }

    public void onHomeButtonClick(View button) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
//    Intent intent = new Intent(this, MainActivity.class);
//        intent.putExtra("itemsList", itemsList);
//    startActivity(intent);
//}

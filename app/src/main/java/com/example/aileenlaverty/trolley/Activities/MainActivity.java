package com.example.aileenlaverty.trolley.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.Items;
import com.example.aileenlaverty.trolley.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> itemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items items = new Items();
        itemsList = items.getList();
    }

    public void onButtonClick(View button){
        Intent intent = new Intent(this, ItemActivity.class);
        intent.putExtra("itemsList", itemsList);
        startActivity(intent);
    }
}



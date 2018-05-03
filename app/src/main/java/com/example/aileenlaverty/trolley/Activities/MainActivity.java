package com.example.aileenlaverty.trolley.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.aileenlaverty.trolley.Adapters.ItemsAdapter;
import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.ItemsFactory;
import com.example.aileenlaverty.trolley.R;
import com.example.aileenlaverty.trolley.TrolleyClasses.Trolley;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Trolley trolley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> itemsList = ItemsFactory.getNewStockList();
        trolley = new Trolley( itemsList);
    }
    @Override
        protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        }

    public void onButtonClick(View button){
        Intent intent = new Intent(this, ItemActivity.class);
        intent.putExtra("itemsList", trolley.getStockList());
        startActivity(intent);
    }
}



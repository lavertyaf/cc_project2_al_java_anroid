package com.example.aileenlaverty.trolley.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aileenlaverty.trolley.Adapters.OrdersAdapter;
import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.Adapters.ItemsAdapter;
import com.example.aileenlaverty.trolley.Items;
import com.example.aileenlaverty.trolley.R;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    private ArrayList<Item> orderList;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        orderList = new ArrayList<>();

        Order order = new Order();
        orderList = order.getOrders();


        Intent intent = getIntent();
        ArrayList<Item> orderList = (ArrayList<Item>) intent.getSerializableExtra("orderList");
        OrdersAdapter ordersAdapter = new OrdersAdapter(this, orderList);
        ListView orderedItemsListView = findViewById(R.id.orderedItemsListViewId);


        order.getOrderTotal();
        TextView totalInPoundsTextView = textView.findViewById(R.id.totalInPoundsTextViewId);



        orderedItemsListView.setAdapter(ordersAdapter);





    }

}

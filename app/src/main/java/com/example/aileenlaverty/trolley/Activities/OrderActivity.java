package com.example.aileenlaverty.trolley.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aileenlaverty.trolley.Adapters.OrdersAdapter;
import com.example.aileenlaverty.trolley.R;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

public class OrderActivity extends AppCompatActivity {

    Order order;
//    double totalInPoundsTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();

        order = (Order)(intent.getSerializableExtra("order"));
        OrdersAdapter ordersAdapter;
        ordersAdapter = new OrdersAdapter(this, order.getOrders());
        ListView orderedItemsListView = findViewById(R.id.orderedItemsListViewId);

        TextView totalInPoundsTextView = findViewById(R.id.totalInPoundsTextViewId);
        totalInPoundsTextView.setText(String.format("%.2f", order.getOrderTotal()));

        orderedItemsListView.setAdapter(ordersAdapter);
    }

    public void onHomeButtonClick (View button){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void onCompleteButtonClick (View button){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

        Toast toast= Toast.makeText(getApplicationContext(),
                "Order complete", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 40, 1000);
        toast.show();
    }

}

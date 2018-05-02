package com.example.aileenlaverty.trolley.Activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.Adapters.ItemsAdapter;
import com.example.aileenlaverty.trolley.Items;
import com.example.aileenlaverty.trolley.R;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

import java.util.ArrayList;

import static com.example.aileenlaverty.trolley.R.color.cellback;
import static com.example.aileenlaverty.trolley.R.color.colorPrimary;

public class ItemActivity extends AppCompatActivity {

    private ArrayList<Item> orderList;
    private ListView itemsListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);


        orderList = new ArrayList<>();
        Intent intent = getIntent();
        ArrayList<Item> itemsList = (ArrayList<Item>) intent.getSerializableExtra("itemsList");
        final ItemsAdapter itemsAdapter = new ItemsAdapter(this, itemsList);
        itemsListView = findViewById(R.id.itemsListViewId);

        itemsListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//        itemsListView.setItemsCanFocus(true);

        itemsListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long id){
                itemsListView.invalidateViews();
            }
        });
//        itemsListView.getCheckedItemPositions();
        itemsListView.setAdapter(itemsAdapter);
    }




    public void onItemClick(View listItem) {




        if(listItem.getTag(R.id.item_color_key) == null || listItem.getTag(R.id.item_color_key) == "off"){
            listItem.setTag(R.id.item_color_key, "on");
            listItem.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            listItem.setSelected(true);

//            orderList.add((Item) listItem.getTag(0));
        }
        else{
            listItem.setTag(R.id.item_color_key, "off");
            listItem.setBackgroundColor(getResources().getColor(cellback));
            listItem.setSelected(false);
//            orderList.remove(listItem.getTag(0));
        }


//        if (canBeSelected) {
//            listItem.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
//            listItem.setSelected(true);
//
//            orderList.add((Item) listItem.getTag(0));
//        } else if(canBeSelected == false)
//
//        {
//
//                listItem.setBackgroundColor(getResources().getColor(cellback));
//                listItem.setSelected(false);
//                orderList.remove(listItem.getTag(0));
//            }
        }


        public void onHomeButtonClick (View button){
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

        public void onAddButtonClick (View button){
            Intent intent = new Intent(this, OrderActivity.class);
            intent.putExtra("orderList", orderList);
            startActivity(intent);
        }


    }


//    Intent intent = new Intent(this, MainActivity.class);
//        intent.putExtra("itemsList", itemsList);
//    startActivity(intent);
//}

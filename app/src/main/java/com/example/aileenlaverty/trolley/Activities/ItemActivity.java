package com.example.aileenlaverty.trolley.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aileenlaverty.trolley.Item;
import com.example.aileenlaverty.trolley.Adapters.ItemsAdapter;
import com.example.aileenlaverty.trolley.Items;
import com.example.aileenlaverty.trolley.R;
import com.example.aileenlaverty.trolley.TrolleyClasses.Order;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {

    private ListView itemsListView;
    TextView textView;
    Order order;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

//        order = new ArrayList<>();
        order = new Order();
        Intent intent = getIntent();
        ArrayList<Item> itemsList = (ArrayList<Item>) intent.getSerializableExtra("itemsList");
        final ItemsAdapter itemsAdapter = new ItemsAdapter(this, itemsList);
        itemsListView = findViewById(R.id.itemsListViewId);

        itemsListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        itemsListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long id){
                itemsListView.invalidateViews();
            }
        });

//        ItemsAdapter.notifyDataSetChanged();

        itemsListView.setAdapter(itemsAdapter);
    }

        public void onHomeButtonClick (View button){
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

        public void onViewButtonClick (View button){
            Intent intent = new Intent(this, OrderActivity.class);
            intent.putExtra("order", order);
            startActivity(intent);
        }

        public void onAddButtonClick (View button) {
              SparseBooleanArray checkedItems = itemsListView.getCheckedItemPositions().clone();
              //checked items looks like (0:true, 1:false, 2; true) - if I selected 0,1,2 and then unselected 1
              for (int i=0; i<checkedItems.size(); i++){
                  Item item = (Item) itemsListView.getAdapter().getItem( checkedItems.keyAt(i) );
                  boolean isItemActuallySelected = checkedItems.valueAt(i);

                  Log.i("CHECKED ITEMS",item.getName() + " was selected");

                  if (isItemActuallySelected){
                      order.addToOrder(item);
                  }
              }

            for(int y = 0; y<itemsListView.getCheckedItemPositions().size(); y++){
                itemsListView.setItemChecked(y, false);
            }

            Toast toast= Toast.makeText(getApplicationContext(),
                    "Item(s) have been added", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 40, 1000);
            toast.show();

        }
}



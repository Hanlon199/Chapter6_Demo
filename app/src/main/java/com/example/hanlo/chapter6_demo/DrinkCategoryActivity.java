package com.example.hanlo.chapter6_demo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by hanlo on 2/18/2018.
 */

public class DrinkCategoryActivity extends ListActivity {


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
                listDrinks.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView listView, View itemView, int position,long id) {
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKO, (int) id);
        startActivity(intent);
    }

}



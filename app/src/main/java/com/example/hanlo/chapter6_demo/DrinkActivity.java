package com.example.hanlo.chapter6_demo;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by hanlo on 2/18/2018.
 */

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKO = "drinkno";

    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_drink);

        //get Drink from intent
        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKO);
        Drink drink = Drink.drinks[drinkNo];

        //populate drank image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        //populate drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        //populate drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}

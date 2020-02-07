package com.example.pizzaorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private static Button button2 ;
    private static Button button3 ;
    private static Button button4 ;


    public void onClickButtonListener(){
        button2 = (Button)findViewById(R.id.cheeseButton);
        button3 = (Button)findViewById(R.id.pepperoniButton);
        button4 = (Button)findViewById(R.id.vegButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, customizeActivity.class);
                String pizza_category = "Cheese Pizza";
                intent.putExtra("pizza_type", pizza_category);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, customizeActivity.class);
                String pizza_category = "Pepporoni Pizza";
                intent.putExtra("pizza_type", pizza_category);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, customizeActivity.class);
                String pizza_category = "Vegetable Pizza";
                intent.putExtra("pizza_type", pizza_category);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        onClickButtonListener();
    }
}


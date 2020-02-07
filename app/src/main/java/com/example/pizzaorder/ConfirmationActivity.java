package com.example.pizzaorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {
    public void setPizza(){
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.textView12);
        TextView textView1 = (TextView) findViewById(R.id.textView15);
        String Toppings = intent.getStringExtra("topping_string");
        String Sauces = intent.getStringExtra("sauce_string");
        textView.setText(Toppings);
        textView1.setText(Sauces);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        setPizza();
    }
}
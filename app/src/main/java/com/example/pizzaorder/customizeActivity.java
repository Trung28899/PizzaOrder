package com.example.pizzaorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class customizeActivity extends AppCompatActivity {
    private static TextView textView;
    private CheckBox cheese, tomato, pepper, onion, mushroom, pepperoni;
    private CheckBox BBQ, Thai, Cream, Chilli;
    private Button button;
    private static RadioGroup radioG;
    private static RadioButton radioChosen;
    StringBuffer Toppings = new StringBuffer();
    StringBuffer Sauces = new StringBuffer();
    int toppingg = 0;
    int sauce = 0;



    public void setPizza(){
        Intent intent = getIntent();
        textView = (TextView)findViewById(R.id.pizza_type);
        String user_name = intent.getStringExtra("pizza_type");
        textView.setText(user_name);
    }

    public void onClickButtonListener(){
        cheese = (CheckBox)findViewById(R.id.cheese);
        tomato = (CheckBox)findViewById(R.id.tomato);
        pepper = (CheckBox)findViewById(R.id.pepper);
        onion = (CheckBox)findViewById(R.id.onion);
        mushroom = (CheckBox)findViewById(R.id.mushroom);
        pepperoni = (CheckBox)findViewById(R.id.pepperoni);
        BBQ = (CheckBox)findViewById(R.id.bbq);
        Thai = (CheckBox)findViewById(R.id.thai);
        Cream = (CheckBox)findViewById(R.id.cream);
        Chilli = (CheckBox)findViewById(R.id.chilli);
        button = (Button)findViewById(R.id.confirm);
        if(cheese.isChecked())
        {
            Toppings.append("Double Cheese, ");
            toppingg++;
        }
        if(tomato.isChecked())
        {
            Toppings.append("Tomato, ");
            toppingg++;
        }
        if(pepper.isChecked())
        {
            Toppings.append("Pepper , ");
            toppingg++;
        }
        if(onion.isChecked())
        {
            Toppings.append("Onion, ");
            toppingg++;
        }
        if(mushroom.isChecked())
        {
            Toppings.append("Mushroom, ");
            toppingg++;
        }
        if(pepperoni.isChecked())
        {
            Toppings.append("Pepperoni, ");
            toppingg++;
        }
        if(BBQ.isChecked())
        {
            Sauces.append("BBQ, ");
            sauce++;
        }
        if(Thai.isChecked())
        {
            Sauces.append("Double Cheese, ");
            sauce++;
        }
        if(Cream.isChecked())
        {
            Sauces.append("Double Cheese, ");
            sauce++;
        }
        if(Chilli.isChecked())
        {
            Sauces.append("Double Cheese, ");
            sauce++;
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(customizeActivity.this, ConfirmationActivity.class);
                intent.putExtra("topping_string", Toppings.toString());
                intent.putExtra("sauces_string", Sauces.toString());
                intent.putExtra("topping_number", toppingg);
                intent.putExtra("sauce_string", sauce);

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);
        setPizza();
        onClickButtonListener();
    }
}

package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.cuisinenepal.Adapters.Adapter;
import com.example.cuisinenepal.Models.Mainmodel;
import com.example.cuisinenepal.databinding.ActivityHomepage2Binding;

import java.util.ArrayList;

public class Homepage extends AppCompatActivity {



    ActivityHomepage2Binding binding;
    ImageView burgerCAT, pizzaCAT, chickenCAT, homebar, paymentbar, restaurantbar, settingbar;

    ArrayList<Mainmodel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityHomepage2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        burgerCAT = findViewById(R.id.burgerCAT);
        burgerCAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,Burger.class);
                startActivity(intent);
            }
        });




        chickenCAT = findViewById(R.id.chickenCAT);
        chickenCAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,Chicken.class);
                startActivity(intent);
            }
        });




        pizzaCAT = findViewById(R.id.pizzaCAT);
        pizzaCAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,FastFood.class);
                startActivity(intent);
            }
        });



        homebar = findViewById(R.id.homebar);
        homebar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Homepage.this,Homepage.class);
                //startActivity(intent);
            }
        });

        paymentbar = findViewById(R.id.paymentbar);
        paymentbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,payment.class);
                startActivity(intent);
            }
        });


        restaurantbar = findViewById(R.id.restaurantbar);
        restaurantbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,Restaurant.class);
                startActivity(intent);
            }
        });


                    settingbar = findViewById(R.id.settingbar);
        settingbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,settingpage.class);
                startActivity(intent);
            }
        });

        ArrayList<Mainmodel> list = new ArrayList<>();
        list.add(new Mainmodel(R.drawable.antipasto_chickpea_salad2_1648234200, "Salad","250","hello "));
        list.add(new Mainmodel(R.drawable.brooklyn_1639076963, "Brooklyn Pizza","250","hello "));
        list.add(new Mainmodel(R.drawable.butter_chicken, "Butter Chickenr","250","hello "));
        list.add(new Mainmodel(R.drawable.chettinad_chicken_curry, "Chicken Curry","250","hello "));
        list.add(new Mainmodel(R.drawable.chicago_thin_crust_or_tavern_style_1639076963, "Chicago pizza","250","hello "));
        list.add(new Mainmodel(R.drawable.chicken_kurma, "Chicken kurma","250","hello "));
        list.add(new Mainmodel(R.drawable.chilli_chicken, "Chicken chilli","250","hello "));
        list.add(new Mainmodel(R.drawable.delish_garlic_overload_burger_pinterest_still002_1562881810, " Garlic Burger","250","hello "));
        list.add(new Mainmodel(R.drawable.delish_loaded_burger_bowls_pinterest_still002_1561744002, "Burger Bowls","250","hello "));
        list.add(new Mainmodel(R.drawable.delish_keto_burger_stuffed_onions_pinterest_still002_1582235934, "keto Burger stuffed Onions","250","hello "));
        list.add(new Mainmodel(R.drawable.hamburger_vertical_jpg_1523572431, "HamBurger","250","hello "));
        list.add(new Mainmodel(R.drawable.turkey_burger_vertical_jpg_1522721006, " Turkey Burger","250","hello "));

        Adapter adapter = new Adapter(list,this);
        binding.recyclerviewhome.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerviewhome.setLayoutManager(layoutManager);


    }
}


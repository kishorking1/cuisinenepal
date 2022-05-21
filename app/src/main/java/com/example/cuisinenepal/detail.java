package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cuisinenepal.databinding.ActivityDetailBinding;

public class detail extends AppCompatActivity {
    ActivityDetailBinding binding;
    int numberOrder = 1;
     ImageView plusBtn, minusBtn, picFood;
     Button Addtocart;
    TextView titleTxt, feeTxt, descriptionTxt, numberOrderTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int image= getIntent().getIntExtra("image", 0);
        int price = Integer.parseInt(getIntent().getStringExtra("burgerprice"));
        String name = getIntent().getStringExtra("Burger");
        String description = getIntent().getStringExtra("description");

        binding.detailimg.setImageResource(image);
        binding.detailprice.setText(String.format("%d",price ));
        binding.detailname.setText(name);
        binding.detaildes.setText(description);


    }





}
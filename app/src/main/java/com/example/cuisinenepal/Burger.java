package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.cuisinenepal.Adapters.Adapter;
import com.example.cuisinenepal.Models.Mainmodel;
import com.example.cuisinenepal.databinding.ActivityBurgerBinding;

import java.util.ArrayList;

public class Burger extends AppCompatActivity {


 private ImageSlider imagesilder;
    ActivityBurgerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBurgerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Mainmodel> list = new ArrayList<>();
        list.add(new Mainmodel(R.drawable.taco_stuffed_burger_1565041424, "Taco stuffed burger","250","hello "));
        list.add(new Mainmodel(R.drawable.turkey_burger_vertical_jpg_1522721006, "Turkey Burger","250","hello "));
        list.add(new Mainmodel(R.drawable.delish_keto_burger_stuffed_onions_pinterest_still002_1582235934, "Keto Burger stuffed onions","250","hello "));
        list.add(new Mainmodel(R.drawable.delish_garlic_overload_burger_pinterest_still002_1562881810, "Garlic overload burger","250","hello "));
        list.add(new Mainmodel(R.drawable.delish_loaded_burger_bowls_pinterest_still002_1561744002, "Burger bowls","250","hello "));
        list.add(new Mainmodel(R.drawable.taco_stuffed_burger_1565041424, "Taco stuffed burger","250","hello "));

        Adapter adapter = new Adapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);



        imagesilder = findViewById(R.id.image_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
         slideModels.add( new SlideModel(R.drawable.taco_stuffed_burger_1565041424,ScaleTypes.FIT));
         slideModels.add( new SlideModel(R.drawable.turkey_burger_vertical_jpg_1522721006,ScaleTypes.FIT));
         slideModels.add( new SlideModel(R.drawable.delish_garlic_overload_burger_pinterest_still002_1562881810,ScaleTypes.FIT));
         slideModels.add( new SlideModel(R.drawable.burger2,ScaleTypes.FIT));

        imagesilder.setImageList(slideModels);





    }


}
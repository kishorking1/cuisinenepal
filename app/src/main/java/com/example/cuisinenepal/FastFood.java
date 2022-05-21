package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.cuisinenepal.Adapters.Adapter;
import com.example.cuisinenepal.Models.Mainmodel;
import com.example.cuisinenepal.databinding.ActivityFastFoodBinding;

import java.util.ArrayList;

public class FastFood extends AppCompatActivity {

    private ImageSlider imagesilder;
    ActivityFastFoodBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFastFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Mainmodel> list = new ArrayList<>();
        list.add(new Mainmodel(R.drawable.antipasto_chickpea_salad2_1648234200, "Antipasto chickpea salad","150","hello "));
        list.add(new Mainmodel(R.drawable.hamburger_vertical_jpg_1523572431, "HamBurger","350","hello "));
        list.add(new Mainmodel(R.drawable.haryani_murgh, "Haryani murgh","230","hello "));
        list.add(new Mainmodel(R.drawable.roman_1639076963, "Roman Pizza","450","hello "));
        list.add(new Mainmodel(R.drawable.sicilian_1639076963, "Sicilian  Pizza","200","hello "));
        list.add(new Mainmodel(R.drawable.taco_stuffed_burger_1565041424, "Taco stuffed burger","180","hello "));


        Adapter adapter = new Adapter(list,this);
        binding.recyclerview4.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview4.setLayoutManager(layoutManager);



        imagesilder = findViewById(R.id.image_slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add( new SlideModel(R.drawable.antipasto_chickpea_salad2_1648234200, ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.brooklyn_1639076963,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.burger2,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.chilli_chicken,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.haryani_murgh,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.sicilian_1639076963,ScaleTypes.FIT));

        imagesilder.setImageList(slideModels);



    }
}
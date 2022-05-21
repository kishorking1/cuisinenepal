package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.cuisinenepal.Adapters.Adapter;
import com.example.cuisinenepal.Models.Mainmodel;
import com.example.cuisinenepal.databinding.ActivityChickenBinding;

import java.util.ArrayList;

public class Chicken extends AppCompatActivity {


    private ImageSlider imagesilder;
    ActivityChickenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChickenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Mainmodel> list = new ArrayList<>();
        list.add(new Mainmodel(R.drawable.butter_chicken, " Butter Chicken","250","hello "));
        list.add(new Mainmodel(R.drawable.chettinad_chicken_curry, "Chicken Curry","250","hello "));
        list.add(new Mainmodel(R.drawable.chicken_kurma, "Chicken kurma","250","hello "));
        list.add(new Mainmodel(R.drawable.chilli_chicken, "Chicken chilli","250","hello "));
        list.add(new Mainmodel(R.drawable.haryani_murgh, "Chicken haryani","250","hello "));
        list.add(new Mainmodel(R.drawable.kadai_chicken, "Chicken kadai","250","hello "));
        list.add(new Mainmodel(R.drawable.lemon_chicken, "Chicken lemon","250","hello "));



        Adapter adapter = new Adapter(list,this);
        binding.recyclerview3.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview3.setLayoutManager(layoutManager);



        imagesilder = findViewById(R.id.image_slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add( new SlideModel(R.drawable.chicago_thin_crust_or_tavern_style_1639076963, ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.chettinad_chicken_curry,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.chicken_kurma,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.chilli_chicken,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.antipasto_chickpea_salad2_1648234200,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.butter_chicken,ScaleTypes.FIT));



        imagesilder.setImageList(slideModels);
    }
}
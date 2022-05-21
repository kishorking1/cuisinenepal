package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.cuisinenepal.Adapters.RestaurantAdapter;
import com.example.cuisinenepal.Models.Restaurantmodel;
import com.example.cuisinenepal.databinding.ActivityRestaurantBinding;

import java.util.ArrayList;

public class Restaurant extends AppCompatActivity {
    private ImageSlider imagesilder;
    ActivityRestaurantBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRestaurantBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        ArrayList<Restaurantmodel> list = new ArrayList<>();
        list.add(new Restaurantmodel(R.drawable.antipasto_chickpea_salad2_1648234200,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.brooklyn_1639076963,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.burger2,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.butter_chicken,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.chettinad_chicken_curry,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.chilli_chicken,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.delish_loaded_burger_bowls_pinterest_still002_1561744002,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.delish_garlic_overload_burger_pinterest_still002_1562881810,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.delish_keto_burger_stuffed_onions_pinterest_still002_1582235934,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.chicken_kurma,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.chicago_thin_crust_or_tavern_style_1639076963,"0.5","KTM","Good area to spent time with friends and family" ));
        list.add(new Restaurantmodel(R.drawable.lemon_chicken,"0.5","KTM","Good area to spent time with friends and family" ));






        RestaurantAdapter adapter = new RestaurantAdapter(list,this);
        binding.recyclerviewRestaurant.setAdapter(adapter);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerviewRestaurant.setLayoutManager(layoutManager);

        imagesilder = findViewById(R.id.image_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add( new SlideModel(R.drawable.kadai_chicken, ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.hamburger_vertical_jpg_1523572431,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.taco_stuffed_burger_1565041424,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.sicilian_1639076963,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.roman_1639076963,ScaleTypes.FIT));
        slideModels.add( new SlideModel(R.drawable.turkey_burger_vertical_jpg_1522721006,ScaleTypes.FIT));

        imagesilder.setImageList(slideModels);

    }
}
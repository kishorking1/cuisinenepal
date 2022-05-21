package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cuisinenepal.Adapters.Adapter;
import com.example.cuisinenepal.Models.Mainmodel;
import com.example.cuisinenepal.retrofit.ApiInterface;
import com.example.cuisinenepal.retrofit.Retrofitclient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Wishlist extends AppCompatActivity {

    ApiInterface apiInterface;
    RecyclerView recyclerView108;

    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        apiInterface = Retrofitclient.getRetrofitInstance().create(ApiInterface.class);

        Call<List<Mainmodel>> call = apiInterface.getAllData();
        call.enqueue(new Callback<List<Mainmodel>>() {
            @Override
            public void onResponse(Call<List<Mainmodel>> call, Response<List<Mainmodel>> response) {
                List<Mainmodel> foodDataList = response.body();
            }

            @Override
            public void onFailure(Call<List<Mainmodel>> call, Throwable t) {

                Toast.makeText(Wishlist.this, "Server is not responding.", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void getPopularData(ArrayList<Mainmodel> list) {

        recyclerView108 = findViewById(R.id.recyclerview10);
        adapter = new Adapter(list, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView108.setLayoutManager(layoutManager);
        recyclerView108.setAdapter(adapter);

    }
}
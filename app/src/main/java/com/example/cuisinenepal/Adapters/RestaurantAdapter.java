package com.example.cuisinenepal.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuisinenepal.Models.Restaurantmodel;
import com.example.cuisinenepal.R;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.viewHolder>{


    ArrayList<Restaurantmodel> list;
    Context context;

    public RestaurantAdapter(ArrayList<Restaurantmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.samplerestaurant , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final Restaurantmodel restaurantmodel = list.get(position);
        holder.restuaurantimage.setImageResource(restaurantmodel.getRestuaurantimage());
        holder.Distance.setText(restaurantmodel.getDistance());
        holder.Loaction.setText(restaurantmodel.getLoaction());
        holder.Description.setText(restaurantmodel.getDescription());

    }

    @Override
    public int getItemCount() {
        return  list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView restuaurantimage;
        TextView Distance , Loaction , Description;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            restuaurantimage = itemView.findViewById(R.id.image2);
            Distance = itemView.findViewById(R.id.distance);
            Loaction = itemView.findViewById(R.id.location);
            Description = itemView.findViewById(R.id.description2);

        }
    }
}

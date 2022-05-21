package com.example.cuisinenepal.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cuisinenepal.Models.Mainmodel;
import com.example.cuisinenepal.R;
import com.example.cuisinenepal.detail;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewholder> {


    ArrayList<Mainmodel> list ;
    Context context;

    public Adapter(ArrayList<Mainmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.sampleburger, parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
final Mainmodel model  = list.get(position);
        Glide.with(context).load(list.get(position).getImage()).into(holder.image);
holder.name.setText(model.getName());
holder.price.setText(model.getPrice());
holder.description.setText(model.getDespriction());


holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       Intent intent = new Intent(context, detail.class);
       intent.putExtra("image",model.getImage());
       intent.putExtra("Burger",model.getName());
       intent.putExtra("burgerprice",model.getPrice());
       intent.putExtra("description",model.getDespriction());
       context.startActivity(intent);
    }
});

        public void khaltiImplement(Context mCtx, KhaltiButton kBuy,String productId, String productName, Long price){

            Long priceInPaisa = price*100;

            Config.Builder builder = new Config.Builder(Constant.pub, productId, productName, priceInPaisa, new OnCheckOutListener() {
                @Override
                public void onError(@NonNull String action, @NonNull Map<String, String> errorMap) {
                    Log.i(action, errorMap.toString());

                }

                @Override
                public void onSuccess(@NonNull Map<String, Object> data) {
                    Log.i("success", data.toString());
                    Toast.makeText(mCtx, "Success: "+data.toString(), Toast.LENGTH_SHORT).show();
                }
            });

            Config config = builder.build();
            kBuy.setCheckOutConfig(config);
     KhaltiCheckOut khaltiCheckOut1 = new KhaltiCheckOut(mCtx, config);
       kBuy.setOnClickListener(v -> khaltiCheckOut1.show());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name,price, description;



        public viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.Burger);
            price = itemView.findViewById(R.id.burgerprice);
            description = itemView.findViewById(R.id.description);
        }
    }
}

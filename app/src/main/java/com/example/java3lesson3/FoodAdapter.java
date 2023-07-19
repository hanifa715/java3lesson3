package com.example.java3lesson3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter <FoodViewHolder>{

    private ArrayList<String>foodlist;

    public FoodAdapter(ArrayList<String> foodlist) {
        this.foodlist = foodlist;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.bind((foodlist.get(position)));


    }

    @Override
    public int getItemCount() {
        return foodlist.size();
    }
}
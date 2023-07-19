package com.example.java3lesson3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private ArrayList<String>carlist;

    public CarAdapter(ArrayList<String> carlist){
        this.carlist = carlist;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bind((carlist.get(position)));

    }

    @Override
    public int getItemCount() {
        return carlist.size();
    }
}

package com.example.java3lesson3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SingerAdapter extends RecyclerView.Adapter <SingerViewHolder>{

    private ArrayList<String>singerlist;

    public SingerAdapter(ArrayList<String> singerlist) {
        this.singerlist = singerlist;
    }

    @NonNull
    @Override
    public SingerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SingerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_singer,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SingerViewHolder holder, int position) {
        holder.bind((singerlist.get(position)));

    }



    @Override
    public int getItemCount() {
        return singerlist.size();
    }
}

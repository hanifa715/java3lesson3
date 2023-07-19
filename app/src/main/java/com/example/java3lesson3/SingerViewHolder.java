package com.example.java3lesson3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SingerViewHolder extends RecyclerView.ViewHolder {

    private TextView tvSinger;

    public SingerViewHolder(@NonNull View itemView) {
        super(itemView);
        tvSinger = itemView.findViewById(R.id.tv_singer);
    }

    public void bind(String singer) {
        tvSinger.setText(singer);
    }
}

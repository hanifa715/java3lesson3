package com.example.java3lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    private RecyclerView rv3;
    private SingerAdapter sa;
    private ArrayList<String> singerlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
    }

    private void initView() {
        rv3 = findViewById(R.id.rv3);
        sa = new SingerAdapter(singerlist);
        rv3.setAdapter(sa);
        loadData();
    }

    private void loadData() {
        singerlist.add("Ariana Grande");
        singerlist.add("The Weeknd");
        singerlist.add("Taylor Swift ");
        singerlist.add("centralcee");
        singerlist.add("Selena Gomez");
        singerlist.add("Drake");
        singerlist.add("Nicki Minaj");
        singerlist.add("Rihanna");
        singerlist.add("Billie Eilish");
        singerlist.add("6ix9ine");
        singerlist.add("Travis Scott");
        singerlist.add("Rich Brian");
        singerlist.add("Russ");
        singerlist.add("Shawn Mendes");
        singerlist.add("XXXTENTACION");
    }

}
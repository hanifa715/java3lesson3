package com.example.java3lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView rv2;
    private CarAdapter ca;
    private ArrayList<String> carlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }
    private void initView(){
        rv2 = findViewById(R.id.rv2);
        loadData();
        ca = new CarAdapter(carlist);
        rv2.setAdapter(ca);
    }

    private void loadData(){
        carlist.add("BMW");
        carlist.add("Toyota");
        carlist.add("Honda");
        carlist.add("Nissan");
        carlist.add("Lexus");
        carlist.add("Subaru");
        carlist.add("Hyundai");
        carlist.add("Audio");
        carlist.add("Tesla");
        carlist.add("Ferrari");
        carlist.add("Lamborghini");
        carlist.add("Range Rover");
        carlist.add("Maserati");
        carlist.add("Volkswagen");
        carlist.add("Ford");
    }
}
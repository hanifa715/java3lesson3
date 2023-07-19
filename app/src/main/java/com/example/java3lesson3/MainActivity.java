package com.example.java3lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private FoodAdapter fa;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rv = findViewById(R.id.rv);
        loadData();
        fa = new FoodAdapter(list);
        rv.setAdapter(fa);
    }

    private void loadData() {
        list.add("лагман");
        list.add("плов");
        list.add("гамбургер");
        list.add("пицца");
        list.add("паста");
        list.add("суши");
        list.add("рамен");
        list.add("борщ");
        list.add("шаурма");
        list.add("бешбармак");
        list.add("оромо");
        list.add("манты");
        list.add("самсы");
        list.add("тако");
        list.add("бифштекс");
        }
    }

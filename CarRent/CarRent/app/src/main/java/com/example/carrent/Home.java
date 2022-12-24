package com.example.carrent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.carrent.model.Car;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if(getSupportActionBar()!=null)
            getSupportActionBar().hide();
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.carRec);
        Car[] cars = new Car[Car.data.length];
        for (int i=0;i<cars.length;i++){
            cars[i]=Car.data[i ];
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CarRentAdapter adapter=new CarRentAdapter(cars);
        recyclerView.setAdapter(adapter);
    }
}
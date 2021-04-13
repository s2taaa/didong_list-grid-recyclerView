package com.example.lab4b2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    ArrayList<ElectricThings> electricThings;
    CustomAdapter ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gvlayout);

        electricThings = new ArrayList<>();
        electricThings.add(new ElectricThings("Cáp chuyển từ Cổng USB sang PS2...",5,
                10000, 15, R.drawable.giacchuyen,30 ));

        electricThings.add(new ElectricThings("CCáp chuyển từ Cổng USB sang PS2...", 3,
                10000, 15, R.drawable.daynguon,20 ));

        electricThings.add(new ElectricThings("Cáp chuyển từ Cổng USB sang PS2...", 5,
                10000, 15, R.drawable.dauchuyendoipsps,10 ));

        electricThings.add(new ElectricThings("Cáp chuyển từ Cổng USB sang PS2...", 4,
                10000, 15, R.drawable.daucam,15 ));

        electricThings.add(new ElectricThings("Cáp chuyển từ Cổng USB sang PS2...", 2,
                10000, 15, R.drawable.daynguon,18 ));

        electricThings.add(new ElectricThings("Cáp chuyển từ Cổng USB sang PS2...", 1,
                10000, 15, R.drawable.giacchuyen,40 ));

        ca = new CustomAdapter(this,R.id.gvlayout,electricThings);
gridView.setAdapter(ca);
    }
}
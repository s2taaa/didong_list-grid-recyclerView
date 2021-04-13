package com.example.appmot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  SendingData{

    TextView tvThanhTien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvThanhTien = findViewById(R.id.tvThanhTien);
        getSupportFragmentManager().beginTransaction().add(R.id.frmBelow, BelowFragment.newInstance("141.800"))
                .commit();
    }

    @Override
    public void sendData(String data) {
        int gia=141800;
        int tt = Integer.parseInt(data);
        int tongtien= tt*gia;
        String tongtienS =String.valueOf(tongtien);
        tvThanhTien.setText(tongtienS);
        getSupportFragmentManager().beginTransaction().replace(R.id.frmBelow, BelowFragment.newInstance(tongtienS))
                .commit();

    }
}
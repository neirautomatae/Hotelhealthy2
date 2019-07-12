package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ViewFlipper;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper v_filpper;
    private Button butNutrition;
    private Button butHealthy;
    private Button butWork;
    private Button butTips;
    private Button butTale;
    private Button butApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v_filpper = findViewById(R.id.v_flipper);
        butNutrition = (Button)findViewById(R.id.btnNutrition);
        butHealthy = (Button)findViewById(R.id.btnHealthy);
        butWork = (Button)findViewById(R.id.btnWork);
        butTips = (Button)findViewById(R.id.btnTips);
        butTale = (Button)findViewById(R.id.btnTele);
        butApp = (Button)findViewById(R.id.btnApp);


        butNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butNutrition = new Intent(MainActivity.this,Nutrition.class);
                startActivity(butNutrition);
            }
        });

        butHealthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butHealthy = new Intent (MainActivity.this ,Healthy.class);
                startActivity(butHealthy);
            }
        });

        butWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butWork = new Intent (MainActivity.this ,Work.class);
                startActivity(butWork);
            }
        });

        butTale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butTale = new Intent (MainActivity.this ,Tele.class);
                startActivity(butTale);
            }
        });

        butTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butTips = new Intent (MainActivity.this ,Tips.class);
                startActivity(butTips);
            }
        });

        butTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butTips = new Intent (MainActivity.this ,Tips.class);
                startActivity(butTips);
            }
        });


            }
        }



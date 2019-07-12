package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Healthy extends AppCompatActivity {

    private Button cal;
    private Button bmi;
    private Button grid;
    private Button maid1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);


        cal = (Button)findViewById(R.id.btncal);
        bmi = (Button)findViewById(R.id.btnbmi);
        grid = (Button)findViewById(R.id.btngrid);
        maid1 = (Button)findViewById(R.id.btnme1);


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cal = new Intent(Healthy.this , Cal.class);
                startActivity(cal);
            }
        });

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bmi = new Intent(Healthy.this , Bmi.class);
                startActivity(bmi);
            }
        });

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent grid = new Intent(Healthy.this , Thegrid.class);
                startActivity(grid);
            }
        });

        maid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maid1 = new Intent(Healthy.this , MainActivity.class);
                startActivity(maid1);
            }
        });

    }

    public void clickhealthy(View view) {
        Healthy.this.finish ( );
    }
}

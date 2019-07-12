package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tele extends AppCompatActivity {

    private Button hometele;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);

        hometele = findViewById(R.id.btnmunetel1);

        hometele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometele = new Intent(Tele.this , MainActivity.class);
                startActivity(hometele);
            }
        });

    }
}

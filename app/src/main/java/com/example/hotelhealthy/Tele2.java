package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tele2 extends AppCompatActivity {

    private Button hometele;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele2);

        hometele = findViewById(R.id.btnmunetel1);

        hometele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometele2 = new Intent(Tele2.this , MainActivity.class);
                startActivity(hometele2);
            }
        });
    }
}

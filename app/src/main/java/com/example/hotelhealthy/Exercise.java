package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise extends AppCompatActivity {

    private Button backhome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        backhome2 = (Button)findViewById(R.id.btnm1);

        backhome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent backhome2 = new Intent(Exercise.this ,MainActivity.class);
                startActivity(backhome2);

            }
        });

    }

    public void clickback(View view) {
        Exercise.this.finish();

    }
}

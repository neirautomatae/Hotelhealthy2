package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nutrition extends AppCompatActivity {

    private Button backhome11;
    private Button exercise;
    private Button disease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        backhome11 = (Button)findViewById(R.id.btnbk2);
        exercise = (Button)findViewById(R.id.btnex);
        disease = (Button)findViewById(R.id.btnmenuwork);

    backhome11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent backhome11 = new Intent(Nutrition.this , MainActivity.class);
            startActivity(backhome11);
        }
    });

        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exercise = new Intent(Nutrition.this , Exercise.class);
                startActivity(exercise);
            }
        });

        disease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disease = new Intent(Nutrition.this , Disease.class);
                startActivity(disease);
            }
        });

    }

    public void clickBack(View view) {

        Nutrition.this.finish();

    }
}

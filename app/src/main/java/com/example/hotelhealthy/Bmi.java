package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Bmi extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private double number1,number2;
    private Button buttonResult ;
    private TextView ResultTextView;
    private Button btnbackhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        num1 = (EditText) findViewById(R.id.editText5);
        num2 = (EditText) findViewById(R.id.editText6);
        ResultTextView = (TextView) findViewById(R.id.re);
        btnbackhe = (Button) findViewById(R.id.btnbackhe);
        buttonResult = (Button) findViewById(R.id.button4);

        btnbackhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbackhe = new Intent(Bmi.this, MainActivity.class);
                startActivity(btnbackhe);
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1 = Integer.parseInt(num1.getText().toString().trim());
                number2 = Integer.parseInt(num2.getText().toString().trim());

                double result = number2 / (number1 * number1 / 10000);
                ResultTextView.setText(String.valueOf(result));

            }
        });

    }

    public void clickback(View view) {
        Bmi.this.finish();



    }
}

package com.naina.wainaina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Conversion extends AppCompatActivity {
    Button button;
    TextInputEditText input;
    TextView pepsodent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        button = findViewById(R.id.Convert);
        input = findViewById(R.id.Input);
        pepsodent = findViewById(R.id.Output);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degreeInput = Double.parseDouble(input.getText().toString().trim());
                double kelvinOutput = degreeInput + 273.15;
                pepsodent.setText("kelvin: " + kelvinOutput);
            }
        });
    }
}
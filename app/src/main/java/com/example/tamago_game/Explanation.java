package com.example.tamago_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explanation extends AppCompatActivity {

    Button start;
    Button goToBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        start = findViewById(R.id.start);
        goToBack = findViewById(R.id.GoToMain);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explanation.this,Play.class);
                startActivity(intent);
            }
        });

        goToBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explanation.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
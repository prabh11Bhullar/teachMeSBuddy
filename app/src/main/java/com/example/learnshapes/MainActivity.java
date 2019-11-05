package com.example.learnshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtChooseGame;
    Button btnActivity1, btnActivity2, btnChooseRandom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtChooseGame = findViewById(R.id.txtGame);
        btnActivity1 = findViewById(R.id.btnGuessMe);
        btnChooseRandom = findViewById(R.id.btnRandom);


        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), GuessMe.class);
                startActivity(intent);
            }
        });


        btnChooseRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rndInt = (Math.random() < 0.5) ? 1 : 2;
                if (rndInt == 1) {
                    Intent intent = new Intent(getBaseContext(), GuessMe.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}

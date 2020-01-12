package com.example.unopoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = findViewById(R.id.button_start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startUno();
            }
        });
        Button buttonScore = findViewById(R.id.button_score);
        buttonScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startScore();
            }
        });
    }



    private void startUno() {
        Intent intent = new Intent(MainActivity.this, PlayersActivity.class);
        startActivity(intent);

    }

    private void startScore() {
        Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
        startActivity(intent);
    }
}

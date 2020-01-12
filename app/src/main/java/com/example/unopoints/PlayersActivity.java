package com.example.unopoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayersActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        Button buttonSingle = findViewById(R.id.button_single);
        buttonSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSingle();
            }
        });
        Button buttonMulti = findViewById(R.id.button_multi);
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMulti();
            }
        });
    }



    private void startSingle() {
        Intent intent = new Intent(PlayersActivity.this, SinglePlayerActivity.class);
        startActivity(intent);

    }

    private void startMulti() {
        Intent intent = new Intent(PlayersActivity.this, MultiPlayerActivity.class);
        startActivity(intent);
    }
}


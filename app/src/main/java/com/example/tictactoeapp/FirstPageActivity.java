package com.example.tictactoeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FirstPageActivity extends AppCompatActivity {

    Button btnlogin;

    ImageView fingerprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        btnlogin = findViewById(R.id.btnlogin);
        fingerprint = findViewById(R.id.fingerprint);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstPageActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        fingerprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstPageActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
package com.example.apnabankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {

                Intent intent = new Intent(Dashboard.this, AccountDetails.class);
                startActivity(intent);
            });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {

            Intent intent = new Intent(Dashboard.this, Payment.class);
            startActivity(intent);
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> {

            Intent intent = new Intent(Dashboard.this, Transactions.class);
            startActivity(intent);
        });

        }
    }




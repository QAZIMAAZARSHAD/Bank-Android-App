package com.example.apnabankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        getSupportActionBar().setTitle("Select Payment Mode");

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> {

            Intent intent = new Intent(Payment.this, NewPayment.class);
            startActivity(intent);
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> {

            Intent intent = new Intent(Payment.this, Contacts.class);
            startActivity(intent);
        });
    }
}
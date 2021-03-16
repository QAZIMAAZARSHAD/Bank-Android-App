package com.example.apnabankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Transactions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
        getSupportActionBar().setTitle("Transaction History");
    }
}
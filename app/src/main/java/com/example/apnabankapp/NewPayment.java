package com.example.apnabankapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class NewPayment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_payment);
        getSupportActionBar().setTitle("Enter Account Details");

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

    }
    public void openDialog(){
        popup pop = new popup();
        pop.show(getSupportFragmentManager(), "popup");
    }


}
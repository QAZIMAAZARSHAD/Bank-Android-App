package com.example.apnabankapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Contacts extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Select Contact");

        listView = findViewById(R.id.listView);

        String[] value = new String[]{
                "Daenerys Targaryen", "Hiesenberg", "Jeetu", "John Cena", "Sachin Tendulkar", "Doraemon",
                "Farhan Qureshi", "Sardar Khan", "Gangadhar", "Scarlet", "Prfessor X", "Dumbeldore",
                "Jethalal Champaklal Gada", "Arunabh", "Mario", "Ronaldo Messi"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, value);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 10){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 11){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 12){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 13){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 14){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }
                if (position == 15){
                    Intent intent = new Intent(view.getContext(), DaenerysTargaryen.class);
                    startActivity(intent);
                }




            }
        });

    }
}
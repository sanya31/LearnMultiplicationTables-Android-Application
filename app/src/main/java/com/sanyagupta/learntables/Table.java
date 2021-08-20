package com.sanyagupta.learntables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Intent intent = getIntent();
        int n = intent.getIntExtra(MainActivity.key,0);
        ListView myListView = findViewById(R.id.myTable);
        ArrayList<String> arr = new ArrayList<>();
        for(int i=1; i<=10; i++) {
            int s = n * i;
            arr.add(n + "  X  " + i + "  =  " + s);
        }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.textlayout, arr);
            myListView.setAdapter(arrayAdapter);

    }

}
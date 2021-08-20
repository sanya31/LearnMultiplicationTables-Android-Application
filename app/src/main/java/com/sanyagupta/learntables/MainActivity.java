package com.sanyagupta.learntables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String key = "com.sanyagupta.learntables.key";
    public static final String key2 = "com.sanyagupta.learntables.key2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void generateTable(View view){
        Intent intent = new Intent(this, Table.class);
        EditText editText = findViewById(R.id.editText1);
        int number = Integer.valueOf(editText.getText().toString());
        intent.putExtra(key, number);
        startActivity(intent);
    }
    public void practice(View view){
        Intent intent = new Intent(this, Practice.class);
        EditText editText = findViewById(R.id.editText1);
        int number = Integer.valueOf(editText.getText().toString());
        intent.putExtra(key2, number);
        startActivity(intent);
    }
}
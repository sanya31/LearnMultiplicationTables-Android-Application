package com.sanyagupta.learntables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Practice extends AppCompatActivity {
    Button button;
    TextView text;
    EditText edit;
    ImageView img;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        Intent intent = getIntent();
        int n = intent.getIntExtra(MainActivity.key2, 0);

        button = findViewById(R.id.button2);
        for (int i = 1; i <= 10; i++) {
            String idx = "txt" + i;
            int x = this.getResources().getIdentifier(idx, "id", getPackageName());
            text = findViewById(x);
            text.setText(n + "  X  " + i + "  =  ");
        }
        num = n;
    }
        public void check(View view){
                for(int i=1; i<=10; i++) {
                    String idx = "e"+i;
                    String idy = "i"+i;
                    int x = this.getResources().getIdentifier(idx, "id", getPackageName());
                    int y = this.getResources().getIdentifier(idy, "id", getPackageName());
                    edit = findViewById(x);
                    img = findViewById(y);
                    int ans = Integer.valueOf(edit.getText().toString());
                    int value = num*i;
                    if (value != ans) {
                        img.setImageResource(R.drawable.wrong);
                    } else {
                        img.setImageResource(R.drawable.right);
                    }
                } //for loop ends
            }


}
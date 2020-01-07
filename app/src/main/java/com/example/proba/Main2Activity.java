package com.example.proba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = findViewById(R.id.tv);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
   // Intent intent = getIntent();
 //   String name= intent.getStringExtra("t");
    }


}

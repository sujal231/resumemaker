package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class s6MainActivity extends AppCompatActivity {
    Button btnnextg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s6_main);

        btnnextg = findViewById(R.id.btnnextg);

        btnnextg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s6MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}
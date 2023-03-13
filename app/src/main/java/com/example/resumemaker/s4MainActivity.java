package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class s4MainActivity extends AppCompatActivity {
    Button btnnextd;
    CheckBox comedy,painting,Music,Dance,Drawing,Coding,Sports,Running,reading,gameing;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s4_main);


        btnnextd = findViewById(R.id.btnnextd);
        painting = findViewById(R.id.painting);
        comedy = findViewById(R.id.comedy);
        Music = findViewById(R.id.Music);
        Dance = findViewById(R.id.Dance);
        Drawing = findViewById(R.id.Drawing);
        Coding = findViewById(R.id.Coding);
        Sports = findViewById(R.id.Sports);
        Running = findViewById(R.id.Running);
        reading = findViewById(R.id.reading);
        gameing = findViewById(R.id.gameing);


        btnnextd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(s4MainActivity.this,s5MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class s5MainActivity extends AppCompatActivity {
    CheckBox problemsolving,criticalthinking,projectmanagementney,digitalmarketing,communication,teamwork;
    Button btnnexte;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s5_main);




        btnnexte = findViewById(R.id.btnnexte);
        problemsolving = findViewById(R.id.problemsolving);
        criticalthinking = findViewById(R.id.criticalthinking);
        projectmanagementney = findViewById(R.id.projectmanagementney);
        digitalmarketing = findViewById(R.id.digitalmarketing);
        communication = findViewById(R.id.communication);
        teamwork = findViewById(R.id.teamwork);

        btnnexte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(s5MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });



    }
}
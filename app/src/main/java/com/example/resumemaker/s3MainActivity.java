package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class s3MainActivity extends AppCompatActivity {
    Button btnnextc;
    EditText edschool,edcollege,eddegree,edstdtenpr,edstdtwelvepr;
    SharedPreferences preferences;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3_main);

        btnnextc = findViewById(R.id.btnnextc);
        edschool = findViewById(R.id.edschool);
        edcollege = findViewById(R.id.edcollege);
        eddegree = findViewById(R.id.eddegree);
        edstdtenpr = findViewById(R.id.edstdtenpr);
        edstdtwelvepr = findViewById(R.id.edstdtwelvepr);

        preferences = getSharedPreferences("sujal",0);

        btnnextc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString("school",edschool.getText().toString());
                editor.putString("college",edcollege.getText().toString());
                editor.putString("degree",eddegree.getText().toString());
                editor.putString("stdtenpr",edstdtenpr.getText().toString());
                editor.putString("stdtwelvepr",edstdtwelvepr.getText().toString());

                Intent intent = new Intent(s3MainActivity.this,s4MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
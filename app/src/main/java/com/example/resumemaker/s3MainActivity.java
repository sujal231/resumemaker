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
    EditText edtschool,edtcollege,edtdegree,edtstdtenpr,edtstdtwelvepr;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3_main);

        btnnextc = findViewById(R.id.btnnextc);
        edtschool = findViewById(R.id.edtschool);
        edtcollege = findViewById(R.id.edtcollege);
        edtdegree = findViewById(R.id.edtdegree);
        edtstdtenpr = findViewById(R.id.edtstdtenpr);
        edtstdtwelvepr = findViewById(R.id.edtstdtwelvepr);

        preferences = getSharedPreferences("sujal",0);
        editor = preferences.edit();

        btnnextc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //txtshcool,txtcollege,txtdegree,txtstdtenpr,txtstdtwelvepr

                editor.putString("shcool",edtschool.getText().toString());
                editor.putString("college",edtcollege.getText().toString());
                editor.putString("degree",edtdegree.getText().toString());
                editor.putString("stdtenpr",edtstdtenpr.getText().toString());
                editor.putString("stdtwelvepr",edtstdtwelvepr.getText().toString());
                editor.apply();

                Intent intent = new Intent(s3MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}
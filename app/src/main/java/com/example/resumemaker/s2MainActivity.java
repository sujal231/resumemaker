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

public class s2MainActivity extends AppCompatActivity {
    Button btnnextb;
    EditText edtjob,edtcompname,edtempsal,edtstaryear,edtposition,edtempexp;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2_main);



        btnnextb = findViewById(R.id.btnnextb);
        edtjob = findViewById(R.id.edtjob);
        edtcompname = findViewById(R.id.edtcompname);
        edtempsal = findViewById(R.id.edtempsal);
        edtempexp = findViewById(R.id.edtempexp);
        edtstaryear = findViewById(R.id.edtstaryear);
        edtposition = findViewById(R.id.edtposition);

        preferences = getSharedPreferences("sujal",0);
        editor = preferences.edit();


        btnnextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("job",edtjob.getText().toString());
                editor.putString("compname",edtcompname.getText().toString());
                editor.putString("empsal",edtempsal.getText().toString());
                editor.putString("empexp",edtempexp.getText().toString());
                editor.putString("staryear",edtstaryear.getText().toString());
                editor.putString("position",edtposition.getText().toString());
                editor.apply();



                Intent intent = new Intent(s2MainActivity.this,s3MainActivity.class);
                startActivity(intent);
                
            }
        });

    }
}
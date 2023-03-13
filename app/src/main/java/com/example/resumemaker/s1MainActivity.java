package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class s1MainActivity extends AppCompatActivity {

    Button btnnexta;

    EditText edtfname,edtlname,edtmobilenumber,edtemail,edtweb,edtadd;
    SharedPreferences preferences;

    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1_main);


        btnnexta = findViewById(R.id.btnnexta);
        edtfname = findViewById(R.id.edtfname);
        edtlname = findViewById(R.id.edtlname);
        edtmobilenumber = findViewById(R.id.edtmobilenumber);
        edtemail = findViewById(R.id.edtemail);
        edtweb = findViewById(R.id.edtweb);
        edtadd = findViewById(R.id.edtadd);

        preferences = getSharedPreferences("sujal",0);
        editor = preferences.edit();



        btnnexta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("fname",edtfname.getText().toString());
                editor.putString("lname", edtlname.getText().toString());
                editor.putString("mobilenumber",edtmobilenumber.getText().toString());
                editor.putString("add",edtadd.getText().toString());
                editor.putString("email",edtemail.getText().toString());
                editor.putString("web",edtweb.getText().toString());
                editor.apply();


                Intent intent = new Intent(s1MainActivity.this,s2MainActivity.class);
                startActivity(intent);

            }
        });

    }
}

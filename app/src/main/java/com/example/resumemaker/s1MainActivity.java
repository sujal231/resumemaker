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

    TextView txtpersonal;
    Button btnnexta;
    RadioGroup rdogeneral;
    RadioButton radmale,radfemale;

    EditText edfname,edlname,edmobilenumber,edemail,edweb,edadd;
    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1_main);


        btnnexta = findViewById(R.id.btnnexta);
        edfname = findViewById(R.id.edfname);
        edlname = findViewById(R.id.edlname);
        edmobilenumber = findViewById(R.id.edmobilenumber);
        edemail = findViewById(R.id.edemail);
        edweb = findViewById(R.id.edweb);
        edadd = findViewById(R.id.edadd);
        rdogeneral = findViewById(R.id.rdogeneral);
        radmale = findViewById(R.id.radmale);
        radfemale = findViewById(R.id.radfemale);

        preferences = getSharedPreferences("sujal",0);




        btnnexta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rdo="";
                if (radmale.isChecked())
                {
                    rdo += "male";
                }

                if (radfemale.isChecked())
                {
                    rdo += "female";
                }

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString("fname",edfname.getText().toString());
                editor.putString("lname",edlname.getText().toString());
                editor.putString("mobilenumber",edmobilenumber.getText().toString());
                editor.putString("add",edadd.getText().toString());
                editor.putString("email",edemail.getText().toString());
                editor.putString("web",edweb.getText().toString());
                editor.putString("rdo",rdo);

                editor.apply();


                Intent intent = new Intent(s1MainActivity.this, s2MainActivity.class);
                startActivity(intent);


            }
        });

    }
}
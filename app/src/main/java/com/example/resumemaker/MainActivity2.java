package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    SharedPreferences preferences;
    EditText edfname,edlname;
    TextView txtfname,txtlname,edemail,edmobilenumber,edlinkedin,edadd,edweb,txtjob,txtgeneral,txtpainting;
    Button btnnextf;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edfname = findViewById(R.id.edfname);
        txtfname = findViewById(R.id.txtfname);
        txtlname = findViewById(R.id.txtlname);
        edlname = findViewById(R.id.edlname);
        edemail = findViewById(R.id.edemail);
        txtjob = findViewById(R.id.txtjob);
        txtpainting = findViewById(R.id.txtpainting);
        txtgeneral  = findViewById(R.id.txtgeneral);



        preferences = getSharedPreferences("sujal",0);
        String fname = preferences.getString("fname","");
        String lname = preferences.getString("lname","");
        String job = preferences.getString("job","");
        String general = preferences.getString("general","");
        String painting = preferences.getString("painting","");


        txtfname.setText(""+fname);
        txtlname.setText(""+lname);
        txtjob.setText(""+job);
        txtgeneral.setText(""+general);
        txtpainting.setText(""+painting);






    }
}
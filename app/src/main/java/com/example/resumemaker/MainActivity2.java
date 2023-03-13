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
    TextView txtfname,txtlname,txtjob,txtcompname,txtempsal,txtempexp,txtstaryear,txtposition,txtshcool,txtcollege,txtdegree,txtstdtenpr,txtstdtwelvepr,txtmobilenumber,txtemail,txtweb,txtadd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        preferences = getSharedPreferences("sujal",0);

        txtfname = findViewById(R.id.txtfname);
        txtlname = findViewById(R.id.txtlname);

        txtjob = findViewById(R.id.txtjob);
        txtcompname = findViewById(R.id.txtcompname);
        txtempsal = findViewById(R.id.txtempsal);
        txtempexp = findViewById(R.id.txtempexp);
        txtstaryear = findViewById(R.id.txtstaryear);
        txtposition = findViewById(R.id.txtposition);
        txtshcool = findViewById(R.id.txtshcool);
        txtcollege = findViewById(R.id.txtcollege);
        txtdegree = findViewById(R.id.txtdegree);
        txtstdtenpr = findViewById(R.id.txtstdtenpr);
        txtstdtwelvepr = findViewById(R.id.txtstdtwelvepr);
        txtmobilenumber = findViewById(R.id.txtmobilenumber);
        txtemail = findViewById(R.id.txtemail);
        txtweb = findViewById(R.id.txtweb);
        txtadd = findViewById(R.id.txtadd);
        //txtmobilenumber,txtemail,txtweb,txtadd


        String fname = preferences.getString("fname","");
        String lname = preferences.getString("lname","");
        String mobilenumber = preferences.getString("mobilenumber","");
        String email = preferences.getString("email","");
        String web = preferences.getString("web","");
        String add = preferences.getString("add","");

        String job = preferences.getString("job","");
        String compname = preferences.getString("compname","");
        String empsal = preferences.getString("empsal","");
        String empexp = preferences.getString("empexp","");
        String staryear = preferences.getString("staryear","");
        String position = preferences.getString("position","");

        String shcool = preferences.getString("shcool","");
        String college = preferences.getString("college","");
        String degree = preferences.getString("degree","");
        String stdtenpr = preferences.getString("stdtenpr","");
        String stdtwelvepr = preferences.getString("stdtwelvepr","");

        //txtmobilenumber,txtemail,txtweb,txtadd




        txtfname.setText(fname);
        txtlname.setText(lname);
        txtmobilenumber.setText(mobilenumber);
        txtemail.setText(email);
        txtweb.setText(web);
        txtadd.setText(add);

        txtjob.setText(job);
        txtcompname.setText(compname);
        txtempsal.setText(empsal);
        txtempexp.setText(empexp);
        txtstaryear.setText(staryear);
        txtposition.setText(position);

        txtshcool.setText(shcool);
        txtcollege.setText(college);
        txtdegree.setText(degree);
        txtstdtenpr.setText(stdtenpr);
        txtstdtwelvepr.setText(stdtwelvepr);






    }
}
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

public class MainActivity5 extends AppCompatActivity {
    SharedPreferences preferences;
    TextView txtfname,txtlname,txtjob,txtcompname,txtempsal,txtempexp,txtstaryear,txtposition,txtshcool,txtcollege,txtdegree,txtstdtenpr,txtstdtwelvepr,txtmobilenumber,txtemail,txtweb,txtadd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

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
        txtmobilenumber.setText("Phone no.="+mobilenumber);
        txtemail.setText("Email="+email);
        txtweb.setText("Web="+web);
        txtadd.setText("Address="+add);

        txtjob.setText("job Name="+job);
        txtcompname.setText("compname Name="+compname);
        txtempsal.setText("salary="+empsal);
        txtempexp.setText("Experience="+empexp);
        txtstaryear.setText("staryear="+staryear);
        txtposition.setText("position="+position);

        txtshcool.setText("shcool name="+shcool);
        txtcollege.setText("college name="+college);
        txtdegree.setText("degree="+degree);
        txtstdtenpr.setText("Std10 pr="+stdtenpr);
        txtstdtwelvepr.setText("Std12 pr="+stdtwelvepr);






    }
}
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
    EditText edjob,edcompname,edempsal,edstaryear,edposition,edempexp;
    SharedPreferences preferences;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2_main);



        btnnextb = findViewById(R.id.btnnextb);
        edjob = findViewById(R.id.edjob);
        edcompname = findViewById(R.id.edcompname);
        edempsal = findViewById(R.id.edempsal);
        edempexp = findViewById(R.id.edempexp);
        edstaryear = findViewById(R.id.edstaryear);
        edposition = findViewById(R.id.edposition);

        preferences = getSharedPreferences("sujal",0);

        btnnextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString("job",edjob.getText().toString());
                editor.putString("compname",edcompname.getText().toString());
                editor.putString("empsal",edempsal.getText().toString());
                editor.putString("empexp",edempexp.getText().toString());
                editor.putString("staryear",edstaryear.getText().toString());
                editor.putString("position",edposition.getText().toString());
                editor.apply();

                Intent intent = new Intent(s2MainActivity.this,MainActivity2.class);
                startActivity(intent);
                
            }
        });

    }
}
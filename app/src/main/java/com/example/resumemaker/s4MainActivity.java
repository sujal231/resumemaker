package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class s4MainActivity extends AppCompatActivity {
    Button btnnextd;
    CheckBox comedy,painting,Music,Dance,Drawing,Coding,Sports,Running,reading,gameing;
    SharedPreferences preferences;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s4_main);


        btnnextd = findViewById(R.id.btnnextd);
        painting = findViewById(R.id.painting);
        comedy = findViewById(R.id.comedy);
        Music = findViewById(R.id.Music);
        Dance = findViewById(R.id.Dance);
        Drawing = findViewById(R.id.Drawing);
        Coding = findViewById(R.id.Coding);
        Sports = findViewById(R.id.Sports);
        Running = findViewById(R.id.Running);
        reading = findViewById(R.id.reading);
        gameing = findViewById(R.id.gameing);

        preferences = getSharedPreferences("sujal",0);

        btnnextd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString("painting",painting.getText().toString());
                editor.putString("comedy",comedy.getText().toString());
                editor.putString("Music",Music.getText().toString());
                editor.putString("Dance",Dance.getText().toString());
                editor.putString("Drawing",Drawing.getText().toString());
                editor.putString("Coding",Coding.getText().toString());
                editor.putString("Sports",Sports.getText().toString());
                editor.putString("Running",Running.getText().toString());
                editor.putString("reading",reading.getText().toString());
                editor.putString("gameing",gameing.getText().toString());


                Intent intent = new Intent(s4MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });




    }
}
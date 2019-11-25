package com.example.aidebot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Medicines extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines);


        Button one = (Button) findViewById(R.id.btnButton1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.btnButton2);
        two.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.btnButton1:
                startActivity(new Intent(this, IntroPrescription.class));
                break;

            case R.id.btnButton2:
                startActivity(new Intent(this, NewMedicine.class));
                break;

            default:
                break;
        }

    }
}
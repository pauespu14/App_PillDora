package com.example.aidebot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_information);

        Button one = (Button) findViewById(R.id.btnButton1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.btnButton2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.btnButton3);
        three.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.btnButton1:
                startActivity(new Intent(this, History.class));
                break;

            case R.id.btnButton2:
                startActivity(new Intent(this, CurrentTreatments.class));
                break;

            case R.id.btnButton3:
                startActivity(new Intent(this, Inventory.class));
                break;

            default:
                break;
        }
    }
}

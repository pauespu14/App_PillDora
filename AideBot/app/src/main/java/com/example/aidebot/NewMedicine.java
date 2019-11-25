package com.example.aidebot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewMedicine extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newmed);




        Button one = (Button) findViewById(R.id.but1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.but2);
        two.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.but1:
                startActivity(new Intent(this, TakePic.class));
                break;

            case R.id.but2:
                startActivity(new Intent(this, TextMed.class));
                break;

            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

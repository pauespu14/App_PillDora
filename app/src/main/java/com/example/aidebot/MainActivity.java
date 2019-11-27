package com.example.aidebot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.aidebot.ui.login.LoginActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(this);
        ImageButton four = (ImageButton) findViewById(R.id.imageButton3);
        four.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.button1:
                startActivity(new Intent(this, Medicines.class));
                break;

            case R.id.button2:
                startActivity(new Intent(this, Information.class));
                break;

            case R.id.button3:
                startActivity(new Intent(this, Calendar.class));
                break;

            case R.id.imageButton3:
                startActivity(new Intent(this, LoginActivity.class));
                break;


            default:
                break;
        }
    }
}



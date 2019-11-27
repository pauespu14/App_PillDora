package com.example.aidebot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.getbase.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        FloatingActionButton fab1 = findViewById(R.id.new_med);
        fab1.setOnClickListener(this);
        FloatingActionButton fab2 = findViewById(R.id.new_prescription);
        fab2.setOnClickListener(this);

        /*fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Se presionó el FAB", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.new_med:
                startActivity(new Intent(this, NewMedicine.class));
                break;

            case R.id.new_prescription:
                startActivity(new Intent(this, Information.class));
                break;

            default:
                break;
        }
    }

}

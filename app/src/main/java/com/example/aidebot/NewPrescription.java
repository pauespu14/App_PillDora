package com.example.aidebot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class NewPrescription extends AppCompatActivity implements View.OnClickListener {

    private static HashMap<String, String> message = new HashMap<>();
    private EditText medicineName, frequency, numberPills, endDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_prescription);

        Button insertPrescription = findViewById(R.id.button);
        insertPrescription.setOnClickListener(this);
        medicineName = findViewById(R.id.nameMedicineToFill);
        frequency = findViewById(R.id.frequencyToFill);
        numberPills = findViewById(R.id.numberPillsToFill);
        endDate = findViewById(R.id.endDateToFill);
    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        message.put("name", medicineName.getText().toString());
        message.put("frequency", frequency.getText().toString());
        message.put("quantity", numberPills.getText().toString());
        message.put("end_date", endDate.getText().toString());
        //String returnValue = sendQuery("INTRODUCE PRESCRIPTION", message);
    }

   /*public static HashMap getMessage(){
       return message;
   }*/
}

package com.example.aidebot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;

import java.util.ArrayList;

public class Inventory extends AppCompatActivity {
    private TableLayout tableLayout;
    private EditText txtCurrentTreatments;
    private String[] header= {"Name","Nº Pills","Expire Date"};
    private ArrayList<String[]> rows=new ArrayList<>();
    public int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        tableLayout=(TableLayout)findViewById(R.id.tableCurrent);
        /*txtCurrentTreatments=(EditText)findViewById(R.id.txtCurrentTreatments);*/

        tabla inventory =new tabla(tableLayout, getApplicationContext());
        inventory.addHeader(header);
        inventory.addData(getClients());
        /*inventory.backgroundHeader(Color.BLUE);
        inventory.textColorHeader(Color.WHITE);
        inventory.lineColor(Color.RED);
        inventory.backgroundData(Color.WHITE,Color.WHITE);
        inventory.textColorData(Color.BLACK);*/
        index=inventory.indexRows();


    }


    public void delete (View view) {

        /*String[]  item = new String[]{"6",rows.};*/

    }
    private ArrayList<String[]> getClients(){
        rows.add(new String[]{"1"});
        rows.add(new String[]{"2"});
        rows.add(new String[]{"3"});
        rows.add(new String[]{"4"});
        rows.add(new String[]{"5"});
        rows.add(new String[]{"6"});
        rows.add(new String[]{"7"});
        rows.add(new String[]{"8"});
        rows.add(new String[]{"9"});

        return rows;
    }
}

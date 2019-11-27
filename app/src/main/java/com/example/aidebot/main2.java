package com.example.aidebot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.view.View;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class main2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //per defecte
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new CalendarFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_add:
                            //obrir dropdown toolbar menu
                            //si volguessim obrir un fragment
                            //selectedFragment = new AddFragment(); que hem hagut de crear
                            break;

                        case R.id.nav_info:
                            //obrir dropdown toolbar menu
                            break;

                        case R.id.nav_calendar:
                            selectedFragment = new CalendarFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;

                }
            };

    public void show_popup_add(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.add_popup_menu);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.new_med:
                //start fragment
                Toast.makeText(this, "item1 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.new_prescription:
                //start fragment
                return true;
            default:
                return false;
        }
    }
}

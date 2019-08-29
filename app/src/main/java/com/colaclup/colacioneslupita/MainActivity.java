package com.colaclup.colacioneslupita;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textDesayuno, textAlmuerzo, textOnce;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    textDesayuno.setText("Desayuno");
                    textAlmuerzo.setText("Almuerzo");
                    textOnce.setText("Onc");
                    return true;
                case R.id.navigation_notifications:
                    textDesayuno.setText("");
                    textAlmuerzo.setText("");
                    textOnce.setText("");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        textDesayuno = findViewById(R.id.textDesayuno);
        textAlmuerzo = findViewById(R.id.textAlmuerzo);
        textOnce = findViewById(R.id.textOnce);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}

package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;
//import android.support.design.widget.FloatingActionButton;
import com.google.android.material.floatingactionbutton.*;

public class MainActivity extends Activity {
    FloatingActionButton jfab;
    protected void onCreate(Bundle b) {
        super.onCreate(b); setContentView(R.layout.activity_main);
        jfab = (FloatingActionButton) findViewById(R.id.xfab);
        jfab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Soy un botón de pausa Flotante!", Toast.LENGTH_LONG).show();
            }
        });
    }
}

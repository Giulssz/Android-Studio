package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        
        Intent i = getIntent();
        String mesric = i.getStringExtra("messaggio");
        Toast t = Toast.makeText(getApplicationContext(), mesric, Toast.LENGTH_LONG);
        t.show();
    }
}

package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    Button btnReset;
    EditText editText;
    Button btnTest;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReset = (Button) findViewById(R.id.btnReset);
        editText = (EditText) findViewById(R.id.editText);
        btnTest = (Button) findViewById(R.id.btnTest);
        btnPlay = (Button) findViewById(R.id.btnPlay);
    }

    public void reset(View v){
        editText.setText("");
    }

    public void test(View v){
        Toast.makeText(getApplicationContext(),editText.getText(),Toast.LENGTH_LONG).show();
    }

    public void secondact(View v){
        Intent i = new Intent(getApplicationContext(),activity2.class);
        i.putExtra("messaggio", editText.getText());
        startActivity(i);
    }
}

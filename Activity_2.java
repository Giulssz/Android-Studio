package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    TextView username;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        username = (TextView) findViewById(R.id.username);
        editText = (EditText) findViewById(R.id.editText);

        Intent i = getIntent();
        String mesric = i.getStringExtra("messaggio");
        Toast t = Toast.makeText(getApplicationContext(), mesric, Toast.LENGTH_LONG);
        t.show();
    }

    public void setUsername(View v){
        username.setText((CharSequence) editText);
    }
}

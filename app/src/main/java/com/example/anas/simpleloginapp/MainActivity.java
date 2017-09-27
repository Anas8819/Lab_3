package com.example.anas.simpleloginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,pass;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editText4);
        pass = (EditText) findViewById(R.id.editText5);
        btn = (Button) findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("") || pass.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Username and Password", Toast.LENGTH_SHORT).show();
                }
                else if (username.getText().toString().equals(pass.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Username and Password are same", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Username and Password not same", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

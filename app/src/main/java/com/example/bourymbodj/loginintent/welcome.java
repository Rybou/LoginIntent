package com.example.bourymbodj.loginintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcome= (TextView) findViewById(R.id.text);



        Intent intentObject = getIntent();
        String userName1=intentObject.getExtras().getString("Username");
        welcome.setText("Welcome  " + userName1);


    }

}


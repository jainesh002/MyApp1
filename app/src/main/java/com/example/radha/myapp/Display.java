package com.example.radha.myapp;

/**
 * Created by radha on 2/23/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

/**
 * Created by radha on 2/13/2017.
 */

public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username= getIntent().getStringExtra("Username");

        TextView tv=(TextView)findViewById(R.id.TVusername);
        tv.setText(username);





    }



}
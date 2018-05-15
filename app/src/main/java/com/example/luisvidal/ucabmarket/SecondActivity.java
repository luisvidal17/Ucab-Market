package com.example.luisvidal.ucabmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.luisvidal.ucabmarket.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void returnReply(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity (intent);
    }
}

package com.example.luisvidal.ucabmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView CompraTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CompraTextView = (TextView) findViewById(R.id.arroz);

    }

    public void launchSecondActivity(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        Intent intent = new Intent (this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);

    }

    public void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                CompraTextView.setText(reply);
            } }
    }
}

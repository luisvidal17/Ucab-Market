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
    private int count = 1;

    private TextView m1;
    private TextView m2;
    private TextView m3;
    private TextView m4;
    private TextView m5;
    private TextView m6;
    private TextView m7;
    private TextView m8;
    private TextView m9;
    private TextView m10;
    private TextView m11;
    private TextView m12;
    private TextView m13;
    private TextView m14;
    private TextView m15;
    private TextView m16;
    private TextView m17;
    private TextView m18;
    private TextView m19;
    private TextView m20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = (TextView) findViewById(R.id.textView1);
        m2 = (TextView) findViewById(R.id.textView2);
        m3 = (TextView) findViewById(R.id.textView3);
        m4 = (TextView) findViewById(R.id.textView4);
        m5 = (TextView) findViewById(R.id.textView5);
        m6 = (TextView) findViewById(R.id.textView6);
        m7 = (TextView) findViewById(R.id.textView7);
        m8 = (TextView) findViewById(R.id.textView8);
        m9 = (TextView) findViewById(R.id.textView9);
        m10 = (TextView) findViewById(R.id.textView10);
        m11 = (TextView) findViewById(R.id.textView11);
        m12 = (TextView) findViewById(R.id.textView12);
        m13 = (TextView) findViewById(R.id.textView13);
        m14 = (TextView) findViewById(R.id.textView14);
        m15 = (TextView) findViewById(R.id.textView15);
        m16 = (TextView) findViewById(R.id.textView16);
        m17 = (TextView) findViewById(R.id.textView17);
        m18 = (TextView) findViewById(R.id.textView18);
        m19 = (TextView) findViewById(R.id.textView19);
        m20 = (TextView) findViewById(R.id.textView20);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {

                m1.setText(savedInstanceState.getString("reply_text1"));
                m1.setVisibility(View.VISIBLE);

                m2.setText(savedInstanceState.getString("reply_text2"));
                m2.setVisibility(View.VISIBLE);


                m3.setText(savedInstanceState.getString("reply_text3"));
                m3.setVisibility(View.VISIBLE);


                m4.setText(savedInstanceState.getString("reply_text4"));
                m4.setVisibility(View.VISIBLE);


                m5.setText(savedInstanceState.getString("reply_text5"));
                m5.setVisibility(View.VISIBLE);


                m6.setText(savedInstanceState.getString("reply_text6"));
                m6.setVisibility(View.VISIBLE);


                m7.setText(savedInstanceState.getString("reply_text7"));
                m7.setVisibility(View.VISIBLE);


                m8.setText(savedInstanceState.getString("reply_text8"));
                m8.setVisibility(View.VISIBLE);


                m9.setText(savedInstanceState.getString("reply_text9"));
                m9.setVisibility(View.VISIBLE);


                m10.setText(savedInstanceState.getString("reply_text10"));
                m10.setVisibility(View.VISIBLE);


                m11.setText(savedInstanceState.getString("reply_text11"));
                m11.setVisibility(View.VISIBLE);


                m12.setText(savedInstanceState.getString("reply_text12"));
                m12.setVisibility(View.VISIBLE);


                m13.setText(savedInstanceState.getString("reply_text13"));
                m13.setVisibility(View.VISIBLE);


                m14.setText(savedInstanceState.getString("reply_text14"));
                m14.setVisibility(View.VISIBLE);


                m15.setText(savedInstanceState.getString("reply_text15"));
                m15.setVisibility(View.VISIBLE);


                m16.setText(savedInstanceState.getString("reply_text16"));
                m16.setVisibility(View.VISIBLE);


                m17.setText(savedInstanceState.getString("reply_text17"));
                m17.setVisibility(View.VISIBLE);


                m18.setText(savedInstanceState.getString("reply_text18"));
                m18.setVisibility(View.VISIBLE);


                m19.setText(savedInstanceState.getString("reply_text19"));
                m19.setVisibility(View.VISIBLE);


                m20.setText(savedInstanceState.getString("reply_text20"));
                m20.setVisibility(View.VISIBLE);


            }
        }


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

                if(count==1){
                String reply1 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                m1.setText(reply1);
                }

                if(count==2){
                    String reply2 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m2.setText(reply2);
                }

                if(count==3){
                    String reply3 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m3.setText(reply3);
                }

                if(count==4){
                    String reply4 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m4.setText(reply4);
                }

                if(count==5){
                    String reply5 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m5.setText(reply5);
                }

                if(count==6){
                    String reply6 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m6.setText(reply6);
                }

                if(count==7){
                    String reply7 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m7.setText(reply7);
                }

                if(count==8){
                    String reply8 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m8.setText(reply8);
                }

                if(count==9){
                    String reply9 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m9.setText(reply9);
                }

                if(count==10){
                    String reply10 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m10.setText(reply10);
                }

                if(count==11){
                    String reply11 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m11.setText(reply11);
                }

                if(count==12){
                    String reply12 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m12.setText(reply12);
                }

                if(count==13){
                    String reply13 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m13.setText(reply13);
                }

                if(count==14){
                    String reply14 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m14.setText(reply14);
                }

                if(count==15){
                    String reply15 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m15.setText(reply15);
                }

                if(count==16){
                    String reply16 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m16.setText(reply16);
                }

                if(count==17){
                    String reply17 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m17.setText(reply17);
                }

                if(count==18){
                    String reply18 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m18.setText(reply18);
                }

                if(count==19){
                    String reply19 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                    m19.setText(reply19);
                }

                if(count==20){
                    String reply20 = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                   m20.setText(reply20);
                }


                count = count + 1;
            }
        }
    }


    @Override public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("reply_visible", true);
        outState.putString("reply_text1", m1.getText().toString());
        outState.putString("reply_text2", m2.getText().toString());
        outState.putString("reply_text3", m3.getText().toString());
        outState.putString("reply_text4", m4.getText().toString());
        outState.putString("reply_text5", m5.getText().toString());
        outState.putString("reply_text6", m6.getText().toString());
        outState.putString("reply_text7", m7.getText().toString());
        outState.putString("reply_text8", m8.getText().toString());
        outState.putString("reply_text9", m9.getText().toString());
        outState.putString("reply_text10", m10.getText().toString());
        outState.putString("reply_text11", m11.getText().toString());
        outState.putString("reply_text12", m12.getText().toString());
        outState.putString("reply_text13", m13.getText().toString());
        outState.putString("reply_text14", m14.getText().toString());
        outState.putString("reply_text15", m15.getText().toString());
        outState.putString("reply_text16", m16.getText().toString());
        outState.putString("reply_text17", m17.getText().toString());
        outState.putString("reply_text18", m18.getText().toString());
        outState.putString("reply_text19", m19.getText().toString());
        outState.putString("reply_text20", m20.getText().toString());




    }


}

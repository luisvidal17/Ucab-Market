package com.example.luisvidal.ucabmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.luisvidal.ucabmarket.extra.REPLY";

    private TextView arroz;
    private TextView pasta;
    private TextView leche;
    private TextView jugo;
    private TextView agua;
    private TextView caraota;
    private TextView ajo;
    private TextView harina;
    private TextView pollo;
    private TextView ace;
    private TextView pan;
    private TextView sal;
    private TextView azucar;
    private TextView pescado;
    private TextView jamon;
    private TextView lenteja;
    private TextView mostaza;
    private TextView carne;
    private TextView queso;
    private TextView vino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        arroz = (TextView) findViewById(R.id.arroz);
        pasta = (TextView) findViewById(R.id.pasta);
        leche = (TextView) findViewById(R.id.leche);
        jugo = (TextView) findViewById(R.id.jugo);
        agua = (TextView) findViewById(R.id.agua);
        caraota = (TextView) findViewById(R.id.caraota);
        ajo = (TextView) findViewById(R.id.ajo);
        harina = (TextView) findViewById(R.id.harina);
        pollo = (TextView) findViewById(R.id.pollo);
        ace = (TextView) findViewById(R.id.ace);
        pan = (TextView) findViewById(R.id.pan);
        sal = (TextView) findViewById(R.id.sal);
        azucar = (TextView) findViewById(R.id.azucar);
        pescado = (TextView) findViewById(R.id.pescado);
        jamon = (TextView) findViewById(R.id.jamon);
        lenteja = (TextView) findViewById(R.id.lenteja);
        mostaza = (TextView) findViewById(R.id.mostaza);
        carne = (TextView) findViewById(R.id.carne);
        queso = (TextView) findViewById(R.id.queso);
        vino= (TextView) findViewById(R.id.vino);

    }


    public void click_arroz(View view) {
        String reply = arroz.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void click_pasta(View view) {
    }

    public void click_leche(View view) {
    }

    public void click_jugo(View view) {
    }

    public void click_agua(View view) {
    }

    public void click_caraota(View view) {
    }

    public void click_ajo(View view) {
    }

    public void click_harina(View view) {
    }

    public void click_pollo(View view) {
    }

    public void click_ace(View view) {
    }

    public void click_pan(View view) {
    }

    public void click_sal(View view) {
    }

    public void click_azucar(View view) {
    }

    public void click_pescado(View view) {
    }

    public void click_jamon(View view) {
    }

    public void click_lenteja(View view) {
    }

    public void click_mostaza(View view) {
    }

    public void click_carne(View view) {
    }

    public void click_queso(View view) {
    }

    public void click_vino(View view) {
    }
}

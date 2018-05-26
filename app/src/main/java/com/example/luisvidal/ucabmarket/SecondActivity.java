package com.example.luisvidal.ucabmarket;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/** Esta clase define los articulos ofrecidos para comprar
 *  @author Luis V. Boada
 */
public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.luisvidal.twoactivities.extra.REPLY";


    private TextView c_arroz;
    private TextView c_pasta;
    private TextView c_leche;
    private TextView c_jugo;
    private TextView c_agua;
    private TextView c_caraota;
    private TextView c_ajo;
    private TextView c_harina;
    private TextView c_pollo;
    private TextView c_ace;
    private TextView c_pan;
    private TextView c_sal;
    private TextView c_azucar;
    private TextView c_pescado;
    private TextView c_jamon;
    private TextView c_lenteja;
    private TextView c_mostaza;
    private TextView c_carne;
    private TextView c_queso;
    private TextView c_vino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        c_arroz = (TextView) findViewById(R.id.arroz);
        c_pasta = (TextView) findViewById(R.id.pasta);
        c_leche = (TextView) findViewById(R.id.leche);
        c_jugo = (TextView) findViewById(R.id.jugo);
        c_agua = (TextView) findViewById(R.id.agua);
        c_caraota = (TextView) findViewById(R.id.caraota);
        c_ajo = (TextView) findViewById(R.id.ajo);
        c_harina = (TextView) findViewById(R.id.harina);
        c_pollo = (TextView) findViewById(R.id.pollo);
        c_ace = (TextView) findViewById(R.id.ace);
        c_pan = (TextView) findViewById(R.id.pan);
        c_sal = (TextView) findViewById(R.id.sal);
        c_azucar = (TextView) findViewById(R.id.azucar);
        c_pescado = (TextView) findViewById(R.id.pescado);
        c_jamon = (TextView) findViewById(R.id.jamon);
        c_lenteja = (TextView) findViewById(R.id.lenteja);
        c_mostaza = (TextView) findViewById(R.id.mostaza);
        c_carne = (TextView) findViewById(R.id.carne);
        c_queso = (TextView) findViewById(R.id.queso);
        c_vino= (TextView) findViewById(R.id.vino);

    }

    /** Este metodo regresa a la primera actividad guardando el articulo que se compro
     *  @param view la vista
     *  @return la vista de la primera actividad guardando el producto que se compro en formmato string
     *
     *  SE REPITE LO MISMO PARA LOS DEMAS CASOS
     */

    public void click_arroz(View view) {
        String reply1 = c_arroz.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply1);
        setResult(RESULT_OK,replyIntent);
        finish();


    }

    public void click_pasta(View view) {
        String reply2 = c_pasta.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply2);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void click_leche(View view) {
        String reply3 = c_leche.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply3);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void click_jugo(View view) {
        String reply4 = c_jugo.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply4);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void click_agua(View view) {
        String reply5 = c_agua.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply5);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void click_caraota(View view) {
        String reply6 = c_caraota.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply6);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void click_ajo(View view) {
        String reply7 = c_ajo.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply7);
        setResult(RESULT_OK,replyIntent);
        finish();

          }

    public void click_harina(View view) {
        String reply8 = c_harina.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply8);
        setResult(RESULT_OK,replyIntent);
        finish();

      }

    public void click_pollo(View view) {
        String reply9 = c_pollo.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply9);
        setResult(RESULT_OK,replyIntent);
        finish();

       }

    public void click_ace(View view) {
        String reply10 = c_ace.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply10);
        setResult(RESULT_OK,replyIntent);
        finish();

        }

    public void click_pan(View view) {
        String reply11 = c_pan.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply11);
        setResult(RESULT_OK,replyIntent);
        finish();

      }

    public void click_sal(View view) {
        String reply12 = c_sal.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply12);
        setResult(RESULT_OK,replyIntent);
        finish();

        }

    public void click_azucar(View view) {
        String reply13 = c_azucar.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply13);
        setResult(RESULT_OK,replyIntent);
        finish();

        }

    public void click_pescado(View view) {
        String reply14 = c_pescado.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply14);
        setResult(RESULT_OK,replyIntent);
        finish();

        }

    public void click_jamon(View view) {
        String reply15 = c_jamon.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply15);
        setResult(RESULT_OK,replyIntent);
        finish();

      }

    public void click_lenteja(View view) {
        String reply16 = c_lenteja.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply16);
        setResult(RESULT_OK,replyIntent);
        finish();

        }

    public void click_mostaza(View view) {
        String reply17 = c_mostaza.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply17);
        setResult(RESULT_OK,replyIntent);
        finish();

       }

    public void click_carne(View view) {
        String reply18 = c_carne.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply18);
        setResult(RESULT_OK,replyIntent);
        finish();

        }

    public void click_queso(View view) {
        String reply19 = c_queso.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply19);
        setResult(RESULT_OK,replyIntent);
        finish();

       }

    public void click_vino(View view) {
        String reply20 = c_vino.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply20);
        setResult(RESULT_OK,replyIntent);
        finish();

       }

}

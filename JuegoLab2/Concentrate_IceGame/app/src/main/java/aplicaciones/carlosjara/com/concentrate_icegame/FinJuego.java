package aplicaciones.carlosjara.com.concentrate_icegame;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class FinJuego extends AppCompatActivity {
    private String nombre;
    private int puntaje;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
    public void aboutMenu(MenuItem item) {
        Intent intent = new Intent(this,Acerca.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_juego);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        nombre = intent.getStringExtra("Nombre");
        puntaje = intent.getIntExtra("Puntaje", 0);
        TextView GanadorTxt = (TextView) findViewById(R.id.GanadorS);
        TextView PuntosTxt = (TextView) findViewById(R.id.PuntajeS);
        GanadorTxt.setText(nombre);
        PuntosTxt.setText(String.valueOf(puntaje)+" Puntos");
    }

    public void NuevoJuego(View view) {
        Intent intent = new Intent(this, SeleccionJugadores.class);
        startActivity(intent);
    }
}
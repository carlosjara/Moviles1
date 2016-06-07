package aplicaciones.carlosjara.com.concentrate_icegame;

import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class SeleccionJugadores extends AppCompatActivity {
    public static final String Cantidad = "nJugadores";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_jugadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
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
    public void seleccionNombres(View view){
        EditText Cantidadtxt = (EditText) findViewById(R.id.CantidadTxt);
        int entero = Integer.parseInt(Cantidadtxt.getText().toString());
        Intent intent = new Intent(this,SeleccionNombres.class);
        intent.putExtra(Cantidad,entero);
        startActivity(intent);

    }

}

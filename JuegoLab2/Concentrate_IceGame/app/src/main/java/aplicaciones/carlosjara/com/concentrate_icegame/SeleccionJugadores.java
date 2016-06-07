package aplicaciones.carlosjara.com.concentrate_icegame;

import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SeleccionJugadores extends AppCompatActivity {
    public static final String Cantidad = "nJugadores";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_jugadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void seleccionNombres(View view){
        int id = view.getId();
        if (id == R.id.BJugador1){
            Intent intent = new Intent(this,SeleccionNombres.class);
            intent.putExtra(Cantidad,1);
            startActivity(intent);
        }
        else if (id == R.id.BJugador2){
            Intent intent = new Intent(this,SeleccionNombres.class);
            intent.putExtra(Cantidad,2);
            startActivity(intent);
        }

    }

}

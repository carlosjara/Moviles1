package aplicaciones.carlosjara.com.concentrate_icegame;

import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//Icono Tomado de: http://icons.mysitemyway.com/legacy-icon/061045-blue-jelly-icon-people-things-brain/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void Iniciar(View view){

        Intent intent = new Intent(this,SeleccionJugadores.class);
        startActivity(intent);
    }
}

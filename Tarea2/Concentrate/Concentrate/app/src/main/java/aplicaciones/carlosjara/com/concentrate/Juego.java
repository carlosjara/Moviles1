package aplicaciones.carlosjara.com.concentrate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Juego extends AppCompatActivity {
    TextView VisorNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego); //Carga la vista

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        VisorNombre = (TextView) findViewById(R.id.visor);
        setSupportActionBar(toolbar);

        VisorNombre.setText(getIntent().getStringExtra("nombre"));
    }

}

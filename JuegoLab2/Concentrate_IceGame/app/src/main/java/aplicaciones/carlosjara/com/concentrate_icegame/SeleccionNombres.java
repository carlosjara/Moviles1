package aplicaciones.carlosjara.com.concentrate_icegame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SeleccionNombres extends AppCompatActivity {
    private ArrayList<String> Nombres;
    public static final String nombreIntent = "Nombres";
    private int Cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_nombres);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Seleccion del layout donde se posicionarán los EditText para capturar Los nombres
        LinearLayout linearL = (LinearLayout) findViewById(R.id.layoutNombres);
        Intent intent = getIntent();
        Cantidad = intent.getIntExtra(SeleccionJugadores.Cantidad,0);
        for (int i = 0; i < Cantidad;++i){
            TextView JugadorTxt = new TextView(this);
            EditText NombreJ = new EditText(this);
            JugadorTxt.setText("Jugador "+String.valueOf(i + 1) + " "+ getResources().getString(R.string.nombrePedir)+"");
            JugadorTxt.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            JugadorTxt.setTextSize(20);
            NombreJ.setId(i);
            NombreJ.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            linearL.addView(JugadorTxt);
            linearL.addView(NombreJ);
        }
        Button Iniciar = new Button(this);
        Iniciar.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        Iniciar.setPadding(32, 32, 32, 32);
        Iniciar.setText(R.string.Iniciar);
        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nombres = new ArrayList<String>();
                String nombre;
                for (int i = 0; i < Cantidad; ++i) {
                    EditText NombreJ = (EditText) findViewById(i);
                    nombre = NombreJ.getText().toString();
                    if (nombre.isEmpty()) {
                        AlertDialog.Builder build = new AlertDialog.Builder(v.getContext());
                        build.setMessage(getResources().getString(R.string.AlertaNombre));
                        build.setPositiveButton("Hecho", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                            }
                        });
                        AlertDialog Error = build.create();
                        Error.show();
                        return;
                    }
                    Nombres.add(nombre);
                }
                Intent intent = new Intent(v.getContext(), LogicaJuego.class);
                intent.putStringArrayListExtra(nombreIntent,Nombres);
                startActivity(intent);
            }
        });
        linearL.addView(Iniciar);
    }

}

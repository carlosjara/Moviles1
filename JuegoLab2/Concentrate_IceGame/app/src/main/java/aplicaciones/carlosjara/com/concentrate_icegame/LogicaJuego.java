package aplicaciones.carlosjara.com.concentrate_icegame;

import android.graphics.Color;
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
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;


public class LogicaJuego extends AppCompatActivity {
    private ArrayList<Jugador> jugadores;
    private ArrayList<String> nombres;
    private ArrayList<Integer> puntajes;

    private int ConteoParejas;
    private int Jugando;
    private int ficha1Id;
    private int ficha2Id;
    private int ganador;
    private int puntajeM;
    private String nombreG;
    private int puntajeG;

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
        setContentView(R.layout.activity_logica_juego);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nombres = new ArrayList<String>();
        puntajes = new ArrayList<Integer>();

        Intent intent= getIntent();
        nombres = intent.getStringArrayListExtra(SeleccionNombres.nombreIntent);
        jugadores = new ArrayList<Jugador>();
        for (int i = 0; i < nombres.size(); i++){
            Jugador J1 = new Jugador(nombres.get(i),0);
            jugadores.add(J1);
        }
        ganador = 0;
        nombreG = jugadores.get(0).getNombre();
        puntajeG = jugadores.get(0).getPuntaje();
        puntajeM = jugadores.get(0).getPuntaje();;
        ArrayList<String> Colors = new ArrayList<String>(Arrays.asList("#FF0000",
                                                                  "#0000FF",
                                                                  "#00FF00",
                                                                  "#FFF000",
                                                                  "#000000",
                                                                  "#FFFFFF",
                                                                  "#082295",
                                                                        "#5C9501",
                                                                    "#FF0000",
                                                                    "#0000FF",
                                                                    "#00FF00",
                                                                    "#FFF000",
                                                                    "#000000",
                                                                    "#FFFFFF",
                                                                    "#082295",
                                                                        "#5C9501"));
        Collections.shuffle(Colors);
        ArrayList<Integer> ids = new ArrayList<Integer>(Arrays.asList(R.id.button,
                                                                        R.id.button2,
                                                                        R.id.button3,
                                                                        R.id.button4,
                                                                        R.id.button5,
                                                                        R.id.button6,
                                                                        R.id.button7,
                                                                        R.id.button8,
                                                                        R.id.button9,
                                                                        R.id.button10,
                                                                        R.id.button11,
                                                                        R.id.button12,
                                                                        R.id.button13,
                                                                        R.id.button14,
                                                                        R.id.button15,
                                                                        R.id.button16));
        for (int i=0;i < ids.size();++i){
            Button button=(Button)findViewById(ids.get(i));
            button.setTag(Colors.get(i));
            button.setBackgroundColor(Color.LTGRAY);
        }
        ConteoParejas = 0;
        Jugando = 0;
        ficha1Id = 0;
        VerJuego(jugadores.get(Jugando).getNombre(), jugadores.get(Jugando).getPuntaje());
    }

    public void Seleccion(View view){
        if (ficha1Id == 0){
            ficha1Id = view.getId();
            Button btn = (Button) findViewById(ficha1Id);
            String color = btn.getTag().toString();
            btn.setBackgroundColor(Color.parseColor(color));
        }
        else{
            if (ficha1Id == view.getId()){
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(view.getContext(), getResources().getString(R.string.ErrorClick), duration);
                toast.show();
            }
            else {
                Button btn1 = (Button) findViewById(ficha1Id);
                Button btn2 = (Button) findViewById(view.getId());
                String color = btn2.getTag().toString();
                ficha2Id = view.getId();
                btn2.setBackgroundColor(Color.parseColor(color));
                if (btn1.getTag().toString().equals(btn2.getTag().toString())){
                    btn1.setClickable(false);
                    btn2.setClickable(false);
                    btn2.setBackgroundColor(Color.parseColor(color));
                    jugadores.get(Jugando).sumarPuntaje(1);
                    VerJuego(jugadores.get(Jugando).getNombre(), jugadores.get(Jugando).getPuntaje());
                    ConteoParejas+=1;
                    ficha1Id = 0;
                    if (ConteoParejas == 8){
                        Intent intent = new Intent(this,FinJuego.class);
                        ganador = FINALComparar();
                        nombreG= jugadores.get(ganador).getNombre();
                        puntajeG = jugadores.get(ganador).getPuntaje();
                        intent.putExtra("Nombre",nombreG);
                        intent.putExtra("Puntaje", puntajeG);
                        //intent.putExtra("Puntaje", puntajeM);
                        Log.d("PASO", "SEPASO EL PUNTAJE");
                        startActivity(intent);
                    }
                }
                else {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Button btn1 = (Button) findViewById(ficha1Id);
                            btn1.setBackgroundColor(Color.LTGRAY);
                            Button btn2 = (Button) findViewById(ficha2Id);
                            btn2.setBackgroundColor(Color.LTGRAY);
                            ficha1Id = 0;
                        }
                    }, 300);
               Jugando = (Jugando+1)%jugadores.size();
                    VerJuego(jugadores.get(Jugando).getNombre(), jugadores.get(Jugando).getPuntaje());
                }

            }
        }
    }
    public void VerJuego(String name,int puntaje){
        TextView nombre = (TextView) findViewById(R.id.NombreJugador);
        TextView puntos = (TextView) findViewById(R.id.PuntajeJugador);
        nombre.setText(name);
        puntos.setText(String.valueOf(puntaje));
    }
    public int FINALComparar(){
        int ganador1 = 0;
        for (int i = 0; i < jugadores.size();i++){
            if (jugadores.get(i).getPuntaje()> puntajeM) {
                puntajeM = jugadores.get(i).getPuntaje();
                ganador = i;
            }
        }
        return ganador;

    }

}

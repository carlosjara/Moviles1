package aplicaciones.carlosjara.com.concentrate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EditText EntradaUser2;
    private EditText EntradaUser1;
    private Button bIniciar;
    Spinner spinner;
    public Integer numberofUsers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EntradaUser1 = (EditText) findViewById(R.id.username);
        EntradaUser2 = (EditText) findViewById(R.id.username2);
        if(numberofUsers==1){
            EntradaUser1.setVisibility(View.VISIBLE);
            EntradaUser2.setVisibility(View.GONE);
        }
        if(numberofUsers==2){
            EntradaUser1.setVisibility(View.VISIBLE);
            EntradaUser2.setVisibility(View.VISIBLE);
        }
        bIniciar = (Button) findViewById(R.id.BIniciar);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Jugadores, android.R.layout.simple_spinner_dropdown_item);
        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter(adapter);
        bIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutar(v);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ejecutar(View view) {
        Intent intent = new Intent(getApplicationContext(),Juego.class);
        intent.putExtra("nombre", EntradaUser1.getText().toString());
        //if(numberofUsers==1) {
        //    intent.putExtra("nombre", EntradaUser1.getText().toString());
        //}
        //else{
        //    if(numberofUsers == 2){
        //        intent.putExtra("nombre", EntradaUser1.getText().toString());
        //        intent.putExtra("nombre", EntradaUser2.getText().toString());
        //    }
        //}
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView mostrar = (TextView) view;
        Toast.makeText(getApplicationContext(),"Se ha seleccionado la opcion: "+mostrar.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

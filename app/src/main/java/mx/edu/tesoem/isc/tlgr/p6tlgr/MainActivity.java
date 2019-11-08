package mx.edu.tesoem.isc.tlgr.p6tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton vIsc, vTics, vAmbiental, vGastro;
    CheckBox vCasa, vEscuela, vTrabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vIsc = (RadioButton)findViewById(R.id.rdisc);
        vTics = (RadioButton)findViewById(R.id.rdtics);
        vAmbiental = (RadioButton)findViewById(R.id.rdambiental);
        vGastro = (RadioButton)findViewById(R.id.rdgastro);

        vCasa = (CheckBox)findViewById(R.id.cbcasa);
        vTrabajo = (CheckBox)findViewById(R.id.cbtrabajo);
        vEscuela = (CheckBox)findViewById(R.id.cbescuela);
    }

    public void selectView(View view)
    {
        if(vIsc.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(vTics.isChecked()) Toast.makeText(this, "Ingenieria en Tecnologias de la Informacion y Comunicacion", Toast.LENGTH_SHORT).show();
        if(vAmbiental.isChecked()) Toast.makeText(this, "Ingenieria Ambiental", Toast.LENGTH_SHORT).show();
        if(vGastro.isChecked()) Toast.makeText(this, "Licenciatura en Gastronomia", Toast.LENGTH_SHORT).show();
        if(vCasa.isChecked()) Toast.makeText(this, "Seleccionaste Casa", Toast.LENGTH_SHORT).show();
        if(vTrabajo.isChecked()) Toast.makeText(this, "Seleccionaste Trabajo", Toast.LENGTH_SHORT).show();
        if(vEscuela.isChecked()) Toast.makeText(this, "Seleccionaste Escuela", Toast.LENGTH_SHORT).show();
    }

}

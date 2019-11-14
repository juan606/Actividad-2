package com.example.secion1;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class RespuestaActivity extends AppCompatActivity {

    private TextView etdRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        etdRespuesta = (TextView) findViewById(R.id.TextResp);
        String numero = getIntent().getStringExtra("Numero");
        etdRespuesta.setText("Numeros ordenados de menor a mayor:\n"+numero);
    }

    public void Regresar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}

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

import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button mBTnPros;

    EditText valor1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=  (EditText) findViewById(R.id.D1);



        mBTnPros = (Button) findViewById(R.id.Procesar);
        mBTnPros.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View view) {
                                            if(valor1.getText().toString().matches("\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}+,+\\d{1,4}")){

                                                String[] parts = valor1.getText().toString().split(",");

                                                final int[] ints = new int[parts.length];
                                                for (int i=0; i < parts.length; i++) {
                                                    ints[i] = Integer.parseInt(parts[i]);
                                                }

                                                Arrays.sort(ints);
                                                //Toast.makeText(MainActivity.this, "si se puede"+ints[0]+ints[1]+ints[2]+parts[3] + parts[4] + parts[5] + parts[6] + parts[7] + parts[8] + parts[9] + parts[10] + parts[11] + parts[12] + parts[13] + parts[14] + parts[15] + parts[16] + parts[17] + parts[18] + parts[19], Toast.LENGTH_SHORT).show();
                                                //Toast.makeText(MainActivity.this, parts[19]+" "+parts[19].length(), Toast.LENGTH_SHORT).show();
                                                Intent i = new Intent(MainActivity.this, RespuestaActivity.class);
                                                i.putExtra("Numero",ints[0]+" , "+ints[1]+" , "+ints[2]+" , "+ints[3] +" , "+ ints[4] +" , "+ ints[5] +" , "+ ints[6] +" , "+ ints[7] +" , "+ ints[8] +" , "+ ints[9] +" , "+ ints[10] +" , "+ ints[11] +" , "+ ints[12] +" , "+ ints[13] +" , "+ ints[14] +" , "+ ints[15] +" , "+ ints[16] +" , "+ ints[17] +" , "+ ints[18] +" , "+ ints[19]);
                                                startActivity(i);
                                            }else {
                                                Toast.makeText(MainActivity.this, "nose puede", Toast.LENGTH_SHORT).show();
                                            }


                                        }
                                    }
        );


    }
    }







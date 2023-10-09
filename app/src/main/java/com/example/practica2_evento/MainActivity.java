package com.example.practica2_evento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button borrar;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button punto;
    Button multiplicar;
    Button division;
    Button suma;
    Button resta;
    Button igual;
    TextView pantallaTextView;

    double numero1 = 0;
    double numero2 = 0;
    double resultado = 0;
    String operacionActual = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        borrar = findViewById(R.id.borrar);
        multiplicar = findViewById(R.id.multiplicar);
        igual = findViewById(R.id.igual);
        resta = findViewById(R.id.resta);
        division = findViewById(R.id.division);
        suma = findViewById(R.id.suma);
        punto = findViewById(R.id.punto);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        pantallaTextView = findViewById(R.id.pantalla);

        borrar.setOnClickListener(this);

        multiplicar.setOnClickListener(this);
        igual.setOnClickListener(this);
        resta.setOnClickListener(this);
        suma.setOnClickListener(this);
        division.setOnClickListener(this);
        punto.setOnClickListener(this);
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.borrar) {
            pantallaTextView.setText("");
            numero1 = 0;
            numero2 = 0;
            resultado = 0;
        } else if (view.getId() == R.id.num0 ||
                view.getId() == R.id.num1 ||
                view.getId() == R.id.num2 ||
                view.getId() == R.id.num3 ||
                view.getId() == R.id.num4 ||
                view.getId() == R.id.num5 ||
                view.getId() == R.id.num6 ||
                view.getId() == R.id.num7 ||
                view.getId() == R.id.num8 ||
                view.getId() == R.id.punto||
                view.getId() == R.id.num9){
            Button botonNumero = (Button) view;
            String numero = botonNumero.getText().toString();
            pantallaTextView.append(numero);
        } else if (view.getId() == R.id.suma) {
            if (!pantallaTextView.getText().toString().isEmpty()) {
                numero1 = Double.parseDouble(pantallaTextView.getText().toString());
                pantallaTextView.setText("");
                operacionActual = "suma";
            }
        } else if (view.getId() == R.id.igual) {
            if (!pantallaTextView.getText().toString().isEmpty()) {
                numero2 = Double.parseDouble(pantallaTextView.getText().toString());
                double resultado = 0;

                if (operacionActual.equals("suma")) {
                    resultado = numero1 + numero2;
                } else if (operacionActual.equals("resta")) {
                    resultado = numero1 - numero2;
                } else if (operacionActual.equals("multiplicacion")) {
                    resultado = numero1 * numero2;
                } else if (operacionActual.equals("division")) {
                    resultado = numero1 / numero2;
                }
                pantallaTextView.setText(String.valueOf(resultado));
            }
        } else if (view.getId() == R.id.resta) {
            if (!pantallaTextView.getText().toString().isEmpty()) {
                numero1 = Double.parseDouble(pantallaTextView.getText().toString());
                pantallaTextView.setText("");
                operacionActual = "resta";
            }
        } else if (view.getId() == R.id.multiplicar) {
            if (!pantallaTextView.getText().toString().isEmpty()) {
                numero1 = Double.parseDouble(pantallaTextView.getText().toString());
                pantallaTextView.setText("");
                operacionActual = "multiplicacion";
            }
        } else if (view.getId() == R.id.division) {
            if (!pantallaTextView.getText().toString().isEmpty()) {
                numero1 = Double.parseDouble(pantallaTextView.getText().toString());
                pantallaTextView.setText("");
                operacionActual = "division";
            }
        }


    }
}
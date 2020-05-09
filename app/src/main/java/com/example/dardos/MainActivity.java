package com.example.dardos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textPuntos;
    int puntuacion;
    boolean doble = false;
    boolean triple = false;
    int jugadorActivo = 1;
    int puntuacionJugador1 = 351;
    int puntuacionJugador2 = 351;
    int puntuacionJugador3 = 351;
    int puntuacionJugador4 = 351;
    Button buttonx2;
    Button buttonx3;
    Button buttonP1;
    Button buttonP2;
    Button buttonP3;
    Button buttonP4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);
        final Button button11 = (Button) findViewById(R.id.button11);
        final Button button12 = (Button) findViewById(R.id.button12);
        final Button button13 = (Button) findViewById(R.id.button13);
        final Button button14 = (Button) findViewById(R.id.button14);
        final Button button15 = (Button) findViewById(R.id.button15);
        final Button button16 = (Button) findViewById(R.id.button16);
        final Button button17 = (Button) findViewById(R.id.button17);
        final Button button18 = (Button) findViewById(R.id.button18);
        final Button button19 = (Button) findViewById(R.id.button19);
        final Button button20 = (Button) findViewById(R.id.button20);
        final Button button25 = (Button) findViewById(R.id.button25);
        final Button button50 = (Button) findViewById(R.id.button50);
        buttonx2 = (Button) findViewById(R.id.buttonx2);
        buttonx3 = (Button) findViewById(R.id.buttonx3);
        buttonP1 = (Button) findViewById(R.id.buttonP1);
        buttonP2 = (Button) findViewById(R.id.buttonP2);
        buttonP3 = (Button) findViewById(R.id.buttonP3);
        buttonP4 = (Button) findViewById(R.id.buttonP4);
        final Button reset = (Button) findViewById(R.id.reset);

        buttonP1.setOnClickListener(cambiarJugador);
        buttonP2.setOnClickListener(cambiarJugador);
        buttonP3.setOnClickListener(cambiarJugador);
        buttonP4.setOnClickListener(cambiarJugador);

        button1.setOnClickListener(calcularPuntos);
        button2.setOnClickListener(calcularPuntos);
        button3.setOnClickListener(calcularPuntos);
        button4.setOnClickListener(calcularPuntos);
        button5.setOnClickListener(calcularPuntos);
        button6.setOnClickListener(calcularPuntos);
        button7.setOnClickListener(calcularPuntos);
        button8.setOnClickListener(calcularPuntos);
        button9.setOnClickListener(calcularPuntos);
        button10.setOnClickListener(calcularPuntos);
        button11.setOnClickListener(calcularPuntos);
        button12.setOnClickListener(calcularPuntos);
        button13.setOnClickListener(calcularPuntos);
        button14.setOnClickListener(calcularPuntos);
        button15.setOnClickListener(calcularPuntos);
        button16.setOnClickListener(calcularPuntos);
        button17.setOnClickListener(calcularPuntos);
        button18.setOnClickListener(calcularPuntos);
        button19.setOnClickListener(calcularPuntos);
        button20.setOnClickListener(calcularPuntos);
        button25.setOnClickListener(calcularPuntos);
        button50.setOnClickListener(calcularPuntos);
        buttonx2.setOnClickListener(multiplicarPuntos);
        buttonx3.setOnClickListener(multiplicarPuntos);
        reset.setOnClickListener(limpiar);

        buttonP1.setBackgroundColor(Color.GREEN);

        textPuntos = (EditText) findViewById(R.id.puntos);
        textPuntos.setEnabled(false);

    }

    private View.OnClickListener calcularPuntos = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            puntuacion =  Integer.parseInt(textPuntos.getText().toString());
            int puntos = 0;
            switch(v.getId()){
                case R.id.button1:
                    puntos = 1;
                    break;
                case R.id.button2:
                    puntos = 2;
                    break;
                case R.id.button3:
                    puntos = 3;
                    break;
                case R.id.button4:
                    puntos = 4;
                    break;
                case R.id.button5:
                    puntos = 5;
                    break;
                case R.id.button6:
                    puntos = 6;
                    break;
                case R.id.button7:
                    puntos = 7;
                    break;
                case R.id.button8:
                    puntos = 8;
                    break;
                case R.id.button9:
                    puntos = 9;
                    break;
                case R.id.button10:
                    puntos = 10;
                    break;
                case R.id.button11:
                    puntos = 11;
                    break;
                case R.id.button12:
                    puntos = 12;
                    break;
                case R.id.button13:
                    puntos = 13;
                    break;
                case R.id.button14:
                    puntos = 14;
                    break;
                case R.id.button15:
                    puntos = 15;
                    break;
                case R.id.button16:
                    puntos = 16;
                    break;
                case R.id.button17:
                    puntos = 17;
                    break;
                case R.id.button18:
                    puntos = 18;
                    break;
                case R.id.button19:
                    puntos = 19;
                    break;
                case R.id.button20:
                    puntos = 20;
                    break;
                case R.id.button25:
                    puntos = 25;
                    break;
                case R.id.button50:
                    puntos = 50;
                    break;
            }

            if (doble){
                puntos = puntos * 2;
                doble = false;
                buttonx2.setBackgroundColor(Color.LTGRAY);
            } else if (triple){
                puntos = puntos * 3;
                triple = false;
                buttonx3.setBackgroundColor(Color.LTGRAY);
            }

            if (jugadorActivo == 1){
                puntuacionJugador1 -= puntos;
                textPuntos.setText(String.valueOf(puntuacionJugador1));
            }

            if (jugadorActivo == 2){
                puntuacionJugador2 -= puntos;
                textPuntos.setText(String.valueOf(puntuacionJugador2));
            }

            if (jugadorActivo == 3){
                puntuacionJugador3 -= puntos;
                textPuntos.setText(String.valueOf(puntuacionJugador3));
            }

            if (jugadorActivo == 4){
                puntuacionJugador4 -= puntos;
                textPuntos.setText(String.valueOf(puntuacionJugador4));
            }

            if (puntuacionJugador1 < 0 || puntuacionJugador2 < 0 || puntuacionJugador3 < 0 || puntuacionJugador4 < 0){
                lanzar();
            }
        }
    };

    private void lanzar() {
        Intent i = new Intent(this, Victory.class );
        startActivity(i);
    }


    private View.OnClickListener multiplicarPuntos = new View.OnClickListener() {
       @Override
        public void onClick(View v) {
            puntuacion =  Integer.parseInt(textPuntos.getText().toString());
            int puntos = 0;
            switch(v.getId()){
                case R.id.buttonx2:
                    doble = true;
                    buttonx2.setBackgroundColor(Color.RED);
                    break;
                case R.id.buttonx3:
                    triple = true;
                    buttonx3.setBackgroundColor(Color.RED);
                    break;
            }
        }
    };


    private View.OnClickListener cambiarJugador = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.buttonP1:
                    jugadorActivo = 1;
                    textPuntos.setText(String.valueOf(puntuacionJugador1));
                    buttonP1.setBackgroundColor(Color.GREEN);
                    buttonP2.setBackgroundColor(Color.LTGRAY);
                    buttonP3.setBackgroundColor(Color.LTGRAY);
                    buttonP4.setBackgroundColor(Color.LTGRAY);
                    break;
                case R.id.buttonP2:
                    jugadorActivo = 2;
                    textPuntos.setText(String.valueOf(puntuacionJugador2));
                    buttonP1.setBackgroundColor(Color.LTGRAY);
                    buttonP2.setBackgroundColor(Color.GREEN);
                    buttonP3.setBackgroundColor(Color.LTGRAY);
                    buttonP4.setBackgroundColor(Color.LTGRAY);
                    break;
                case R.id.buttonP3:
                    jugadorActivo = 3;
                    textPuntos.setText(String.valueOf(puntuacionJugador3));
                    buttonP1.setBackgroundColor(Color.LTGRAY);
                    buttonP2.setBackgroundColor(Color.LTGRAY);
                    buttonP3.setBackgroundColor(Color.GREEN);
                    buttonP4.setBackgroundColor(Color.LTGRAY);
                    break;
                case R.id.buttonP4:
                    jugadorActivo = 4;
                    textPuntos.setText(String.valueOf(puntuacionJugador4));
                    buttonP1.setBackgroundColor(Color.LTGRAY);
                    buttonP2.setBackgroundColor(Color.LTGRAY);
                    buttonP3.setBackgroundColor(Color.LTGRAY);
                    buttonP4.setBackgroundColor(Color.GREEN);
                    break;
            }
        }
    };

    private View.OnClickListener limpiar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            puntuacionJugador1 = 351;
            puntuacionJugador2 = 351;
            puntuacionJugador3 = 351;
            puntuacionJugador4 = 351;
            textPuntos.setText(String.valueOf(puntuacionJugador1));
            textPuntos.setText(String.valueOf(puntuacionJugador2));
            textPuntos.setText(String.valueOf(puntuacionJugador3));
            textPuntos.setText(String.valueOf(puntuacionJugador4));
        }
    };

}



package com.reyes.martinez.claculadora_personal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Double numero1, numero2, resultado;
    String operador;

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "1" );

    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "2" );

    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "3" );

    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "4" );

    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "5" );

    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "6" );

    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "7" );

    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "8" );

    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "9" );

    }

    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "0" );

    }

    public void onClickReset(View miView){
        TextView tv = findViewById(R.id.textView);
        tv.setText("");

    }

    public void onClickOperacionCapturaNumero1(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView){

        try {
            operador = "+";
            onClickOperacionCapturaNumero1(miView);
        }
        catch (NumberFormatException nfe){
            Toast.makeText(this,"Formato no valido", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickResta(View miView){

        try {
            operador = "-";
            onClickOperacionCapturaNumero1(miView);
        }
        catch (NumberFormatException nfe){
            Toast.makeText(this,"Formato no valido", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickMultiplicacion(View miView){

        try {
            operador = "*";
            onClickOperacionCapturaNumero1(miView);
        }
        catch (NumberFormatException nfe){
            Toast.makeText(this,"Formato no valido", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickDivicion(View miView){

        try {
            operador = "/";
            onClickOperacionCapturaNumero1(miView);
        }
        catch (NumberFormatException nfe){
            Toast.makeText(this,"Formato no valido", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickExp(View miView){
        try {
            operador = "exp";
            onClickOperacionCapturaNumero1(miView);

        }
        catch (NumberFormatException nfe){
            Toast.makeText(this,"Formato no valido", Toast.LENGTH_SHORT).show();
        }
    }




    public void onClickIgual(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero2 = Double.parseDouble(tv.getText().toString());

        try {

            if (operador.equals("+")){
                resultado = numero1 + numero2;

            }

            if (operador.equals("-")){
                resultado = numero1 - numero2;

            }

            if (operador.equals("*")){
                resultado = numero1 * numero2;

            }

            if (operador.equals("/")){
                resultado = numero1 / numero2;

            }
            if (operador.equals("exp")){
                resultado = Math.pow(numero1, numero2);

            }

            tv.setText(resultado.toString());
        }
        catch (NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", Toast.LENGTH_SHORT).show();


        }
    }
    public void onClickRandom(View myView){
        TextView tv = (TextView) findViewById(R.id.textView);
        Random nr = new Random();
        int valorDado = nr.nextInt(1000)-1;
        tv.setText(String.valueOf(valorDado));

    }

}
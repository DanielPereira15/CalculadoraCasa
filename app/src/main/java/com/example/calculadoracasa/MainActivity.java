package com.example.calculadoracasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvNums;
    int result1,result2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNums = findViewById(R.id.tvNums);
    }

    public void general (View v){
        Button b= (Button)v;
        switch (b.getTag().toString()){
            case "uno":
                    Toast.makeText(this,"boton1",Toast.LENGTH_SHORT).show();
                break;
            case "dos":
                Toast.makeText(this,"boton2",Toast.LENGTH_SHORT).show();
                break;
        }

    }
    public void inser1(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("1");
        } else {
            tvNums.setText(tvNums.getText() + "1");
        }
    }

    public void inser2(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("2");
        } else {
            tvNums.setText(tvNums.getText() + "2");
        }

    }

    public void inser3(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("3");
        } else {
            tvNums.setText(tvNums.getText() + "3");
        }
    }

    public void inser4(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("4");
        } else {
            tvNums.setText(tvNums.getText() + "4");
        }
    }

    public void inser5(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("5");
        } else {
            tvNums.setText(tvNums.getText() + "5");
        }
    }

    public void inser6(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("6");
        } else {
            tvNums.setText(tvNums.getText() + "6");
        }
    }

    public void inser7(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("7");
        } else {
            tvNums.setText(tvNums.getText() + "7");
        }
    }

    public void inser8(View view) {
        if (tvNums.getText().equals("0")) {
            tvNums.setText("8");
        } else {
            tvNums.setText(tvNums.getText() + "8");
        }
    }
        public void inser9 (View view){
            if (tvNums.getText().equals("0")) {
                tvNums.setText("9");
            } else {
                tvNums.setText(tvNums.getText() + "9");
            }
        }

        public void inser0 (View view){
            if (tvNums.getText().equals("0")) {
                tvNums.setText("0");
            } else {
                tvNums.setText(tvNums.getText() + "0");
            }
        }

        public void sumar(View v){
        result1=Integer.parseInt(tvNums.getText().toString());
        tvNums.setText("");
        operador="+";
        }
    public void restar(View v){
        result1=Integer.parseInt(tvNums.getText().toString());
        tvNums.setText("");
        operador="-";
    }
    public void multi(View v){
        result1=Integer.parseInt(tvNums.getText().toString());
        tvNums.setText("");
        operador="x";
    }
    public void dividir(View v){
        result1=Integer.parseInt(tvNums.getText().toString());
        tvNums.setText("");
        operador="/";
    }

    public void igual(View v){
        result2=Integer.parseInt(tvNums.getText().toString());
        if (operador.equals("+")){
            resultado=result1+result2;
            tvNums.setText(""+resultado);
        }else if(operador.equals("-")){
           resultado=result1-result2;
            tvNums.setText(""+resultado);
        }else if(operador.equals("x")){
            resultado=result1*result2;
            tvNums.setText(""+resultado);
        }else if(operador.equals("/")){
            resultado=result1/result2;
            tvNums.setText(""+resultado);
        }else{
            Toast.makeText(this,"Valor erroneo",Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view){
        tvNums.setText("0");
    }

    }


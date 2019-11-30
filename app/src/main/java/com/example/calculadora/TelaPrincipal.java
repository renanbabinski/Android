package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }
    public void calcular(View view){
        AlertDialog alertdialog;
        alertdialog = new AlertDialog.Builder(this).create();
        alertdialog.setTitle("Botão Apertado");
        alertdialog.setMessage("Você apertou o botão");
        alertdialog.show();
    }
    public void calcular2(View view){
        //EditText edit1;
        //edit1 = new EditText.
        //textview.  //
    }





}

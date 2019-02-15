package com.example.aluno.informtica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FormaPagamentoBoleto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pagamento_boleto);

        Intent intent= getIntent();
    }

    public void finalizar_compra(View view) {
        String message;
        message = "Seu boleto será enviado para o seu email";
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        finish();
    }
}

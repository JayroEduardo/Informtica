package com.example.aluno.informtica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.aluno.informtica.MainActivity;

public class ComprarItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar_item);
        //MainActivity.listaCarrinho.get(i).getDescricao();
    }

    public void Play(String Mensagem){
        Toast.makeText(getApplicationContext(), Mensagem, Toast.LENGTH_SHORT).show();
    }

    public void forma_pagamento_boleto(View view) {
        Intent intent = new Intent(ComprarItem.this, FormaPagamentoBoleto.class);
        startActivity(intent);
    }

    public void forma_pagamento_cartao(View view) {
        Intent intent = new Intent(ComprarItem.this, FormaPagamentoCartao.class);
        startActivity(intent);
    }

    public void forma_pagamento_paypal(View view) {
        Intent intent = new Intent(ComprarItem.this, FormaPagamentoPayPal.class);
        startActivity(intent);
    }
}

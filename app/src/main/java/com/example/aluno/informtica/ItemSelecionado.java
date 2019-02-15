package com.example.aluno.informtica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.aluno.informtica.MainActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ItemSelecionado extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selecionado);

        Intent intent = getIntent();
        String parametro = (String) intent.getSerializableExtra("descrição");
        String parametro1 = (String) intent.getSerializableExtra("preço");
        int parametro2 = (int) intent.getSerializableExtra("imagem");

        TextView texto = (TextView) findViewById(R.id.texto01);
        TextView texto2 = (TextView) findViewById(R.id.texto02);
        ImageView imagem = (ImageView) findViewById(R.id.imageView2);

        texto.setText(parametro);
        texto2.setText(parametro1);
        imagem.setImageResource(Integer.parseInt(String.valueOf(parametro2)));


        Item a = new Item(parametro2, parametro, parametro1);

        MainActivity.listaCarrinho.add(a);
        Intent it = getIntent();
    }

    public void Adicionar(View view) {
        String message;
        message = "Item adicionado ao carrinho";
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        finish();
    }

    /*String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();*/
}

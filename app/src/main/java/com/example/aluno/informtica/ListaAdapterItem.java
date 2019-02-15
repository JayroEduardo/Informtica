package com.example.aluno.informtica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAdapterItem extends ArrayAdapter<Item> {

    private Context context;
    private ArrayList<Item> lista;

    public ListaAdapterItem(Context context, ArrayList<Item> lista){
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item itemposicao = this.lista.get(position);
        convertView = LayoutInflater.from(this.context).inflate(R.layout.item,null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView10);
        imageView.setImageResource(itemposicao.getImagem());

        TextView textView = (TextView) convertView.findViewById(R.id.textView3);
        textView.setText(itemposicao.getNome());

        TextView textViewdescricao = (TextView) convertView.findViewById(R.id.textView4);
        textViewdescricao.setText(itemposicao.getDescricao());

        return convertView;
    }
}

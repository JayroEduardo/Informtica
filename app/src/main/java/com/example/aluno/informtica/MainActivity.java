package com.example.aluno.informtica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.android.informatica.extra.MESSAGE";
    String mOrderMessage;

    public final static ArrayList<Item> listaCarrinho = new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprar();
            }
        });

        final ArrayList<Item> lista = new ArrayList<Item>();

        Item a = new Item(R.drawable.computador, "Computador EasyPC Intel Core i3 4GB HD 500GB Windows 10", "R$ 1.649,88");
        Item b = new Item(R.drawable.computador1, "Computador com monitor de 19.5 Intel Core I3 6gb HD 500gb", "R$ 1.399,00");
        Item c = new Item(R.drawable.computador2, "Computador com Monitor LED 15.6, 3green Intel Dual Core HD 500GB", "R$ 990,00");
        Item d = new Item(R.drawable.notebook1, "Notebook Dell Inspiron Intel Core 7ª 1TB Tela LED 15.6", "R$ 2.499,99");
        Item e = new Item(R.drawable.notebook2, "Notebook Positivo Intel Atom Quad Core 32GB Tela LCD 14", "R$ 949,99");
        Item f = new Item(R.drawable.notebook3, "Notebook Samsung Essentials E30 Intel Core I3 4GB 1TB LED 15.6", "R$ 1.899,99");
        Item g = new Item(R.drawable.netbook1, "Netbook Intel Pc101 Windows 10 2gb Ram 32gb", "R$ 1.199,99");
        Item h = new Item(R.drawable.netbook2, "Netbook Dell Inspirion 4gb 32gb 11 Polegadas Win10 - Cinza", "R$ 1.399,00");
        Item j = new Item(R.drawable.netbook3, "Netbook Positivo Mobo 5500 Outlet 4gb 32gb", "R$ 790,00");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);
        lista.add(h);
        lista.add(j);

        ListaAdapterItem adapterItem = new ListaAdapterItem(this, lista);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapterItem);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ItemSelecionado.class);
                intent.putExtra("descrição", lista.get(i).getNome());
                intent.putExtra("preço", lista.get(i).getDescricao());
                intent.putExtra("imagem", lista.get(i).getImagem());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void comprar() {
        Intent intent = new Intent(MainActivity.this, ComprarItem.class);
    //  intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
        startActivity(intent);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void Adicionar(View view) {
    }
}

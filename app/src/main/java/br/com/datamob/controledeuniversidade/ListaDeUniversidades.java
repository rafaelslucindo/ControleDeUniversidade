package br.com.datamob.controledeuniversidade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

public class ListaDeUniversidades extends AppCompatActivity
{
    private ListView lvInformacoes;
    private Button btAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_universidades);
        inicializaComponentes();
    }

    private void inicializaComponentes()
    {
        lvInformacoes = findViewById(R.id.lvInformacoes);
        btAdicionar = findViewById(R.id.btAdicionar);
    }

}

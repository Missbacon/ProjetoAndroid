package com.example.ondeestudar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView text_bemVindo;
    String nome;
    int id;
    ImageView image_linkedin, image_biblioteca, image_podcasts, image_artigos, image_descontos, image_calendario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        text_bemVindo = findViewById(R.id.text_bemVindo);
        image_linkedin = findViewById(R.id.image_linkedin);
        image_biblioteca = findViewById(R.id.image_biblioteca);
        image_podcasts = findViewById(R.id.image_podcasts);
        image_artigos = findViewById(R.id.image_artigos);
        image_descontos = findViewById(R.id.image_descontos);
        image_calendario = findViewById(R.id.image_calendario);

        SharedPreferences userlog = getSharedPreferences("userlog", MODE_PRIVATE);
        nome = userlog.getString("nome","");
        text_bemVindo.setText("Bem vindo, " + nome);

        image_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.linkedin.com/jobs/information-technology-vagas"));
                startActivity(browserIntent);
            }
        });

        image_artigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tecmundo.com.br/tecnologia-da-informacao"));
                startActivity(browserIntent);
            }
        });

        image_descontos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://querobolsa.com.br"));
                startActivity(browserIntent);
            }
        });

        image_podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://podcasts.google.com/search/ti"));
                startActivity(browserIntent);
            }
        });

        image_biblioteca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com.br/Livros-Computacao-Informatica-Midias-Digitais/b?ie=UTF8&node=7842641011"));
                startActivity(browserIntent);
            }
        });


    }
}
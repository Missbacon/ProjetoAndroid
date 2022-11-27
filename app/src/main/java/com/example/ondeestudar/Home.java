package com.example.ondeestudar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView text_bemVindo;
    String nome;
    int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        text_bemVindo = findViewById(R.id.text_bemVindo);

        SharedPreferences userlog = getSharedPreferences("userlog", MODE_PRIVATE);
        nome = userlog.getString("nome","");
        text_bemVindo.setText("Bem vindo, " + nome);

    }
}
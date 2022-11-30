package com.example.ondeestudar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.widget.ProgressBar;

public class Tela_carregamento extends AppCompatActivity {

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_carregamento);
        progressBar = findViewById(R.id.progressBar_carregamento);
        getSupportActionBar().hide();

        countDownTimer.start();


    }

    private CountDownTimer countDownTimer = new CountDownTimer(10000, 100) {
        public void onTick(long millisUntilFinished) {
            progressBar.setProgress(Math.abs((int) millisUntilFinished / 100 - 100));
        }

        @Override
        public void onFinish() {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
        }
    };

}
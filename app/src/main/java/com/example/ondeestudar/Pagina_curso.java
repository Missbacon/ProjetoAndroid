package com.example.ondeestudar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Pagina_curso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_curso);
        getSupportActionBar().hide();
    }
}
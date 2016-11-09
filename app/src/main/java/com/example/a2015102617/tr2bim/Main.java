package com.example.a2015102617.tr2bim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class Main extends AppCompatActivity {
    EditText nomeEditText;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomeEditText = (EditText) findViewById(R.id.editTextTitulo);
    }
    public void inserir(View view){
        Intent intent = new Intent(this, DetalesActivity.class);
    }




}

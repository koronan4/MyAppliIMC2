package com.example.myappliimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.lang.String;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView nom, prenom, email, numero, Age;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            nom = (EditText) findViewById(R.id.nom);
            prenom = (EditText) findViewById(R.id.prenom);
            email = (EditText) findViewById(R.id.email);
            numero = (EditText) findViewById(R.id.numero);
            Age = (EditText) findViewById(R.id.Age);
            btn = (Button) findViewById(R.id.boutonenvoi);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     String nomsaisi = nom.getText().toString();
                     String prenomsaisi = prenom.getText().toString();
                     String emailsaisi = email.getText().toString();
                     //String numerosaisi = numero.getText().toString();
                     //String agesaisi = Age.getText().toString();
                    Intent intent = new Intent(MainActivity.this, activity2.class);
                    intent.putExtra("lenom", nomsaisi);
                    intent.putExtra("leprenom", prenomsaisi);
                    intent.putExtra("leemail", emailsaisi);
                    //intent.putExtra("lenumero", numerosaisi);
                    //intent.putExtra("lage", agesaisi);
                    startActivity(intent);

                }
            });


        }
    }





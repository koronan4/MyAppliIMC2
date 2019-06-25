package com.example.myappliimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class activity2 extends AppCompatActivity {

    private String leprenom, lenom,leemail,lenumero,lage;
    private TextView textprenom, textnom,tail,poi,rst,textemail,textnumero,textage, mail;
    private Button btn,btt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);


        lenom=getIntent().getStringExtra("lenom");
        leprenom=getIntent().getStringExtra("leprenom");
        leemail=getIntent().getStringExtra("leemail");
        lenumero=getIntent().getStringExtra("lenumero");
        lage=getIntent().getStringExtra("lage");

        textnom = (TextView)findViewById(R.id.nom);
        textprenom=(TextView)findViewById(R.id.textView5);
        textemail=(TextView)findViewById(R.id.textView11);
        //textnumero=(TextView)findViewById(R.id.numero);
        //textage=(TextView)findViewById(R.id.textView8);
        poi=(TextView)findViewById(R.id.editText8);
        rst=(TextView)findViewById(R.id.textView17);
        tail=(TextView)findViewById(R.id.editText9);
        btn = (Button)findViewById(R.id.button3);
        btt = (Button)findViewById(R.id.button2);

        textnom.setText(lenom);
        textprenom.setText(leprenom);
        textemail.setText(leemail);
        textnumero.setText(lenumero);
        textage.setText(lage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double lataille = Double.parseDouble(tail.getText().toString());
                Double lepoids = Double.parseDouble(poi.getText().toString());
                Double imc = lepoids/(lataille*lataille);
                rst.setText("M."+lenom+" votre imc est: "+imc);
            }
        });

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst.setText("Pas encore implémenté !");

            }
        });






    }
}

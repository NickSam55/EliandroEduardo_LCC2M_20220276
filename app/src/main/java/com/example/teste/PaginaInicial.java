package com.example.teste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class PaginaInicial extends AppCompatActivity {

    private EditText id_telefone, id_palavraPasse;
    private TextView id_botao_esqueceu;
    private TextView id_botao_trocar_login;
    private Button id_botao_entrar;
    private Button id_botao_criar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        id_telefone = findViewById(R.id.id_telefone);
        id_palavraPasse = findViewById(R.id.id_palavraPasse);
        id_botao_criar = findViewById(R.id.id_botao_criar);
        id_botao_entrar = findViewById(R.id.id_botao_entrar);
        id_botao_esqueceu = findViewById(R.id.id_botao_esqueceu);

        id_botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id_telefone = "Eliandro adm";
                String id_palavraPasse = "12345";

                if (id_telefone == "Eliandro adm" || id_palavraPasse == "12345"){
                    Intent intent = new Intent(PaginaInicial.this, TelaAdmin.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(PaginaInicial.this, PaginaMenu.class);
                    startActivity(intent);
                    startActivity(intent);
                    startActivity(intent);
                }
            }
        });


        id_botao_esqueceu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaginaInicial.this, PaginaEsquecer.class);
                startActivity(intent);
            }
        });


        id_botao_criar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaginaInicial.this, MainActivity.class);
                startActivity(intent);
            }
        });

        id_botao_trocar_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaginaInicial.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
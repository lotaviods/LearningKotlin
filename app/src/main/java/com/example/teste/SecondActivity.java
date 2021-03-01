package com.example.teste;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.teste.dao.AlunoDAO;
import com.example.teste.model.Aluno;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final AlunoDAO dao = new AlunoDAO();

        Button botaoSalvar = findViewById(R.id.form_botao_salvar);
        final EditText nome = findViewById(R.id.form_nome);
        final EditText telefone = findViewById(R.id.form_telefone);
        final EditText email = findViewById(R.id.form_email);

        botaoSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String StringNome = nome.getText().toString();
                String StringTelefone = telefone.getText().toString();
                String StringEmail = email.getText().toString();

                Aluno alunoCriado = new Aluno(StringNome, StringTelefone, StringEmail);
                dao.salva(alunoCriado);

                Toast.makeText(SecondActivity.this, dao.Lista().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}


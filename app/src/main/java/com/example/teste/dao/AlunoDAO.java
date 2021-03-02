package com.example.teste.dao;

import com.example.teste.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO extends ArrayList<String> {


    private final static List<Aluno> alunos = new ArrayList<>();
    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }
    public String Lista(){
        return alunos.toString();
    }
}

package com.example.teste.dao;

import com.example.teste.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {


    private final static List<Aluno> alunos = new ArrayList<>();
    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }
    public ArrayList<Aluno> Lista(){
        return new ArrayList<Aluno>(alunos);
    }
}

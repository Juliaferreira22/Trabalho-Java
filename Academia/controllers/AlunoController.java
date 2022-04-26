package controllers;

import java.util.ArrayList;

import models.Aluno;

public class AlunoController {
    
    private ArrayList<Aluno> clientes = new ArrayList<Aluno>();

    public void cadastrar(Aluno aluno) {
        clientes.add(aluno);
    }

    public ArrayList<Aluno> listar() {
        return aluno;
    }

}

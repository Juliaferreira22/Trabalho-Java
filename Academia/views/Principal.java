package views;



import java.util.ArrayList;

import models.Aluno;
import models.Treino;
import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
    Aluno aluno;
    Treino treino; 
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    ArrayList<Treino> treinos = new ArrayList<Treino>();

    do {
        System.out.println("\n -- ACADEMIA -- \n");
        System.out.println("1 - Cadastrar Alunos");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Cadastrar Treinos");
        System.out.println("4 - Listar Treinos");
        System.out.println("0 - Sair\n");
        opcao = Console.readInt("Digite uma opção: ");

        switch (opcao) {
            case 1:
                    aluno = new Aluno();
                    System.out.println("\n -- CADASTRO DE ALUNOS -- \n");
                    aluno.setNome(Console.readString("Digite o nome do aluno: "));
                    aluno.setCpf(Console.readString("Digite o CPF do funcionário: "));
                    aluno.setDataNascimento(Console.readInt("Digite a data de nascimento:"));
                    aluno.setEndereco(Console.readString("Digite o endereço:"));
                    aluno.setTelefone(Console.readInt("Digite o telefone:"));
                    aluno.setTefefoneEmergencia(Console.readInt("Digite o telefone emergencial:"));
                    alunos.add(aluno);
                    System.out.println("\fFuncionário cadastrado !!!");
                    break;
                case 2:
                    System.out.println("\n -- LISTAGEM DE ALUNOS -- \n");
                    for (Aluno alunoCadastrado : alunos) {
                        System.out.println(alunoCadastrado);
                    }
                    break;

                    
        }



    }
    
}

package br.com.unifil.revisao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Revisao {
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList iniciarBanco() {
        ArrayList<ArrayList> banco = new ArrayList<>();
        banco.add(new ArrayList<String>());
        banco.add(new ArrayList<Integer>());
        banco.add(new ArrayList<Double>());
        banco.add(new ArrayList<Boolean>());
        return banco;
    }

    public static void cadastrarAluno(ArrayList<ArrayList> banco) {
        ArrayList<ArrayList> auxBanco = banco;
        try {
            System.out.println("Insira o nome do Aluno: ");
            String aluno = scanner.next();
            System.out.println("Insira a idade do Aluno: ");
            Integer idade = scanner.nextInt();
            System.out.println("Insira a média final do Aluno (Ex.: X,XX): ");
            Double nota = scanner.nextDouble();

            if (nota >= 7.0 && nota <= 10.0) {
                auxBanco.get(0).add(aluno);
                auxBanco.get(1).add(idade);
                auxBanco.get(2).add(nota);
                auxBanco.get(3).add(true);
            } else if (nota >= 0.0 && nota < 7.0) {
                auxBanco.get(0).add(aluno);
                auxBanco.get(1).add(idade);
                auxBanco.get(2).add(nota);
                auxBanco.get(3).add(false);
            } else {
                System.out.println("Valor de nota inválida");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ocorreu um erro na entrada dos dados");
        }
        banco = auxBanco;
    }

    public static void consultarAlunos(ArrayList<ArrayList> banco) {
        ArrayList<String> nomesAluno = banco.get(0);

        System.out.println("Informe o nome do produto: ");
        String nome = scanner.next();
        for (int i = 0; i < nomesAluno.size(); i++) {
            if (banco.get(0).get(i).equals(nome)) {
                String nomeAluno = (String) banco.get(0).get(i);
                Integer idadeAluno = (Integer) banco.get(1).get(i);
                Double notaAluno = (Double) banco.get(2).get(i);
                Boolean aprovacaoAluno = (Boolean) banco.get(3).get(i);
                String aprovacao;
                if (aprovacaoAluno) {
                    aprovacao = "Aprovado";
                } else {
                    aprovacao = "Reprovado";
                }
                System.out.format("Nome: %s\n", nomeAluno);
                System.out.format("Idade: %d%n", idadeAluno);
                System.out.format("Nota: %.2f%n", notaAluno);
                System.out.format("Situação: %s\n", aprovacao);
            } else {
                System.out.println("Aluno não encontrado");
            }
        }
    }

    public static String listarAlunosAprovados(ArrayList<ArrayList> banco){
        ArrayList<String> nomes = banco.get(0);
        ArrayList<Boolean> auxBanco = banco.get(3);
        ArrayList<String> aprovados = new ArrayList<>();

        for(int i = 0; i < auxBanco.size() ;i++){
            if(auxBanco.get(i)){
                aprovados.add(nomes.get(i));
            }
        }
        return aprovados.toString();
    }

    public static String listarAlunosReprovados(ArrayList<ArrayList> banco){
        ArrayList<String> nomes = banco.get(0);
        ArrayList<Boolean> auxBanco = banco.get(3);
        ArrayList<String> reprovados = new ArrayList<>();

        for(int i = 0; i < auxBanco.size() ;i++){
            if(!auxBanco.get(i)){
                reprovados.add(nomes.get(i));
            }
        }
        return reprovados.toString();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList> banco = iniciarBanco();
        int op;
        try {
            do {
                System.out.println("================Menu================");
                System.out.println("Escolha o numero corresponde a operação que deseja fazer");
                System.out.println("1 - Cadastrar aluno");
                System.out.println("2 - Consultar aluno");
                System.out.println("3 - Listar aprovados");
                System.out.println("4 - Listar reprovados");
                System.out.println("0 - SAIR");
                op = scanner.nextInt();

                if (op == 1) {
                    cadastrarAluno(banco);
                } else if (op == 2) {
                    consultarAlunos(banco);
                } else if (op == 3) {
                    System.out.println(listarAlunosAprovados(banco));
                } else if (op == 4) {
                    System.out.println(listarAlunosReprovados(banco));
                }

            } while (op != 0);
            System.out.println("============PROGRAMA ENCERRADO============");
        } catch (InputMismatchException e) {
            System.out.println("Favor inserir um valor válido");
        }
    }
}

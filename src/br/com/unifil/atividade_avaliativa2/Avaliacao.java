package br.com.unifil.atividade_avaliativa2;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Avaliacao {
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList iniciarBanco() {
        ArrayList<ArrayList> banco = new ArrayList<>();

        banco.add(new ArrayList<String>());
        banco.add(new ArrayList<Double>());
        banco.add(new ArrayList<Integer>());

        return banco;
    }

    //Funções de cadastro de nome, valor e quantidade
    public static void cadastrarProdutoNome(ArrayList<String> banco) {
        System.out.println("Insira o nome do produto: ");
        String nome = scanner.next();
        banco.add(nome.toLowerCase().trim());
    }

    public static void cadastrarProdutoValor(ArrayList<Double> banco) {
        try {
            System.out.println("Insira o valor do produto: ");
            banco.add(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Favor inserir um valor válido (Ex: xx,xx");
        }
    }

    public static void cadastrarProdutoQuantidade(ArrayList<Integer> banco) {
        try {
            System.out.println("Insira a quantidade em estoque do produto: ");
            banco.add(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Favor inserir um valor válido");
        }
    }

    //função de consultar produtos
    public static void consultarProduto(ArrayList<ArrayList> banco) {
        ArrayList<ArrayList> bancoNomes = banco.get(0);
        System.out.println("Informe o nome do produto: ");
        String nome = scanner.next();

        for (int i = 0; i < bancoNomes.size(); i++) {
            if (banco.get(0).get(i).equals(nome.toLowerCase().trim())) {
                String nomeProduto = (String) banco.get(0).get(i);
                Double valorProduto = (Double) banco.get(1).get(i);
                Integer qtdProduto = (Integer) banco.get(2).get(i);

                System.out.format("Nome: %s\n", nomeProduto);
                System.out.format("Valor: R$%.2f%n", valorProduto);
                System.out.format("Quantidade: %d%n", qtdProduto);
            } else {
                System.out.println("Produto não encontrado");
            }
        }
    }

    public static void adicionarNovoEstoque(ArrayList<ArrayList> banco) {
        ArrayList<ArrayList> bancoNomes = banco.get(0);
        System.out.println("Informe o nome do produto: ");
        String nome = scanner.next();

        try {
            for (int i = 0; i < bancoNomes.size(); i++) {
                if (banco.get(0).get(i).equals(nome.toLowerCase().trim())) {
                    System.out.println("Informe a nova quantidade em estoque: ");
                    Integer novaQuantidade = scanner.nextInt();
                    banco.get(2).set(i, novaQuantidade);
                } else {
                    System.out.println("Produto não encontrado");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Favor inserir um valor válido");
        }
    }

    public static void venderProduto(ArrayList<ArrayList> banco) {
        ArrayList<ArrayList> bancoNomes = banco.get(0);
        System.out.println("Informe o nome do produto: ");
        String nome = scanner.next();
        System.out.println("Infome a quantidade de produtos vendidos");
        try {
            Integer qtd = scanner.nextInt();
            for (int i = 0; i < bancoNomes.size(); i++) {
                if (banco.get(0).get(i).equals(nome.toLowerCase().trim())) {
                    if ((Integer) banco.get(2).get(i) >= qtd) {
                        Integer subtracao = (Integer) banco.get(2).get(i) - qtd;
                        banco.get(2).set(i, subtracao);

                        System.out.format("Foram vendidos %d produtos \n", qtd);
                        System.out.format("Existem no estoque agora %d produtos \n", subtracao);
                    } else {
                        System.out.println("Não é possível vender esta qunatidade");
                    }
                } else {
                    System.out.println("Produto não encontrado");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Favor inserir um valor válido");
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList> banco = iniciarBanco();
        int op;
        try {
            do {
                System.out.println("================Menu================");
                System.out.println("Escolha o numero corresponde a operação que deseja fazer");
                System.out.println("1 - Cadastrar produtos");
                System.out.println("2 - Consultar produtos");
                System.out.println("3 - Adicionar produtos");
                System.out.println("4 - Vender produto");
                System.out.println("0 - SAIR");
                op = scanner.nextInt();

                if (op == 1) {
                    cadastrarProdutoNome(banco.get(0));
                    cadastrarProdutoValor(banco.get(1));
                    cadastrarProdutoQuantidade(banco.get(2));
                } else if (op == 2) {
                    consultarProduto(banco);
                } else if (op == 3) {
                    adicionarNovoEstoque(banco);
                } else if (op == 4) {
                    venderProduto(banco);
                }
            } while (op != 0);
            System.out.println("============PROGRAMA ENCERRADO============");
        } catch (InputMismatchException e) {
            System.out.println("Favor inserir um valor válido");
        }
    }
}

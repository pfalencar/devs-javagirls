package com.djg.emprestalivro.Main;

import com.djg.emprestalivro.dominios.Emprestimo;
import com.djg.emprestalivro.dominios.Livro;
import com.djg.emprestalivro.dominios.Usuario;
import com.djg.emprestalivro.dominios.ValidaEmprestimo;

import java.util.Date;
import java.util.Scanner;

public class TestaUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Escreva seu nascimento: ");
        String nascimento = scanner.nextLine();
        System.out.println("Escreva seu endereco: ");
        String endereco = scanner.nextLine();

        Usuario usuario = new Usuario(nome, nascimento, endereco);
//        System.out.println(usuario.toString());

        System.out.println("Escreva seu nome do livro: ");
        String nomeLivro = scanner.nextLine();
        System.out.println("Escreva seu nome do autor: ");
        String nomeAutor = scanner.nextLine();

        Livro livro = new Livro(nomeLivro, nomeAutor);
//        System.out.println(livro.toString());

        boolean isDatasInvalidas = true;

        while (isDatasInvalidas) {
            System.out.println("Digite a data de empréstimo: ");
            String dtEmprestimo = scanner.nextLine();
            System.out.println("Digite a data de devolução: ");
            String dtDevolucao = scanner.nextLine();

            ValidaEmprestimo ve = new ValidaEmprestimo();
            Date emprestimo = ve.convertStringToDate(dtEmprestimo);
            Date devolucao = ve.convertStringToDate(dtDevolucao);

            if (ve.compararDatas(emprestimo, devolucao)) {
                Emprestimo e = new Emprestimo(usuario, livro, emprestimo, devolucao);
                System.out.print("Parabéns data empréstimo veio antes da devolução.");
                isDatasInvalidas = false;
            }  else {
                System.out.println("Errou!!!");
            }
        }
    }
}

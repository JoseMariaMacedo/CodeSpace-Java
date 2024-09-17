package com.primeiro_projeto;

import java.util.Scanner;

public class PrimeiroProgramaExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, mundo! Meu primeiro código em Java");
        System.out.println(nome);
        scanner.close();
    }
}

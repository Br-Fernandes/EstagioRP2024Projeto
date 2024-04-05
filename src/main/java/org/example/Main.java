package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QUESTÃO 01");

        System.out.println("Insira um número qualquer");
        int numero = sc.nextInt();

        if (verificaFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        System.out.println("\n");
        /*QUESTÃO 02*/

        System.out.println("QUESTÃO 02");

        String entrada = "Ola, mundo!";
        System.out.println("A string original é: " + entrada);
        String saida = inverteString(entrada);
        System.out.println("A string invertida é: " + saida);

    }

    public static boolean verificaFibonacci(int numero) {
        int a = 0;
        int b = 1;
        while (b < numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == numero;
    }

    public static String inverteString(String texto) {
        char[] caracteres = texto.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (fim > inicio) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            fim--;
            inicio++;
        }
        return new String(caracteres);
    }

}
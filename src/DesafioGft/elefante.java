package DesafioGft;

import java.util.Scanner;

/*
Escreva um programa onde o usuário digite um valor inteiro e o
programa escreva a música do “Elefante incomoda” correspondente ao
valor digitado:
Exemplo: Usuário digitou o no 3
Saída: Incomoda Incomoda Incomoda muito mais
 */
public class elefante {
    private static Object incomoda;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int i = scan.nextInt();

        for (int j = i; i <= 10; i = i + 0) {

            System.out.print("(incomoda*j) ");
            System.out.print("muito mais");


        }
    }
}

package DesafioGft;

import java.util.Scanner;

/*
Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Soma
2. IMC
3. Sair
Digite a opção desejada:
Na opção 1: receber dois números, calcular e mostrar a soma.
Na opção 2: receber peso e altura, calcular e mostrar o seguinte resultado:
a) Se menor que 18.5 mostrar o resultado e escrever “Peso abaixo do
normal”.
b) Se entre 18.5 e 25 mostrar o resultado e escrever “Peso normal”.
c) Se maior que 25 até 30 mostrar o resultado e escrever “Sobre o peso”.
d) Se maior que 30 até 35 mostrar o resultado e escrever “Grau de
obesidade I”.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.
 */
public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Digite seu peso (emkg) e a sua altura (em metros): ");
        scan (massa, altura);

      int imc = massa/ (altura * altura);

        if (imc >= 18.5 && imc <25)
            System.out.println(" Peso normal");
        else if (imc >= 25 && imc <30)
            System.out.println(" Sobrepeso");
        else if (imc >= 30 && imc <35)
            System.out.println(" Grau de obesidade I");
    }
}

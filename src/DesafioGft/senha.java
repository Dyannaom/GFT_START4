package DesafioGft;

import java.util.Scanner;

public class senha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int senha = 2018;

        System.out.println("Informe a senha: ");
        senha = Integer.parseInt(scan.next());


        loop:
        if (senha == 2018) {
            System.out.println("Acesso garantido");

        } else {
            System.out.println("Senha inválida");

        }

    }
    }
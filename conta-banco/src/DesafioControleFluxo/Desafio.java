package DesafioControleFluxo;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            double saldo = 0.0;

            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Consultar Saldo");
                System.out.println("0. Encerrar");
                int opcao = terminal.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor a ser depositado:");
                        double deposito = terminal.nextDouble();
                        saldo += deposito;
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser sacado:");
                        double saque = terminal.nextDouble();
                        if (saldo >= saque) {
                            saldo -= saque;
                            System.out.println("Saldo atual: " + saldo);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    case 3:
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");

                }
            }
        }
    }
}

    
 

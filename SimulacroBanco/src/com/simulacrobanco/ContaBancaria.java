package com.simulacrobanco;

import java.util.Scanner;

public class ContaBancaria {
    private Scanner scanner = new Scanner(System.in);
    private short agencia;
    private short conta;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        System.out.println("App Banco SIMULACRO, iniciando...");

        System.out.print("Qual sua agência? ");
        this.agencia = scanner.nextShort();

        System.out.print("Qual sua conta? ");
        this.conta = scanner.nextShort();

        System.out.print("Seu nome... ");
        this.titular = scanner.next();

        System.out.print("Saldo? ");
        scanner.nextLine();
        this.saldo = scanner.nextDouble();
    }

    public void greeter() {
        System.out.println(
                "Olá " + this.titular + " obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + this.agencia + " conta " + this.conta + " seu saldo " + this.saldo + " " +
                "já está disponível para saque."
        );
    }
}

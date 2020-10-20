package com.company.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("insira os dados do funcionario");
        System.out.print("nome: ");
        String nome = input.nextLine();
        System.out.print("Salario bruto: ");
        double salarioBruto = input.nextDouble();
        System.out.print("Imposto: ");
        double imposto = input.nextDouble();

        Empregado empregado = new Empregado(nome,salarioBruto,imposto);

        System.out.println();
        System.out.println("Empregado" + empregado);
        System.out.println();
        System.out.println("qual a porcentagem para o aumento de salario?");
       //double porcentagem = input.nextDouble();
        empregado.aumentoSalarial(input.nextDouble());
        System.out.println();
        System.out.println("dados atualizados: " + empregado);

        input.close();
    }
}

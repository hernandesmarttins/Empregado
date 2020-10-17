package com.company.aplication;

public class Empregado {
    private String nome;
    private double salarioBruto, imposto ;

    public Empregado(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentoSalarial(float tax){
        salarioBruto += salarioBruto * tax /100.0;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() +
                ", $" + String.format("%.2f",);
    }
   // return name + ", $ " + String.format("%.2f", netSalary());
}

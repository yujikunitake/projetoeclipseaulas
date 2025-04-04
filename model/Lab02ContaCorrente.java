package model;

public class Lab02ContaCorrente {
    private int numAge;
    private int numConta;
    private String nome;
    private double saldo;

    public int getNumAge(){
        return numAge;
    }

    public void setNumAge(int numAge){
        this.numAge = numAge;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void imprimir(){
        System.out.printf("Agência: %d\nConta: %d\nNome: %s\nSaldo: R$%f",
                this.getNumAge(),
                this.getNumConta(),
                this.getNome(),
                this.getSaldo());
    }

}

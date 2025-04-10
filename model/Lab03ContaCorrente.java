package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab03ContaCorrente {
    private int numAge;
    private int numConta;
    private String nome;
    private double saldo;

    public Lab03ContaCorrente(int numAge, int numConta){
        this.numAge = numAge;
        this.numConta = numConta;

        recuperar();
    }

    public Lab03ContaCorrente(int numAge, int numConta, String nome, double saldo){
        this.numAge = numAge;
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    private void recuperar(){
        FileReader      tArq1;
        BufferedReader  tArq2;
        int             tQtde = 4;

        try {
            tArq1 = new FileReader (getNumAge() + "." + getNumConta() + ".dat");
            tArq2 = new BufferedReader (tArq1);

            String [] tLinha = new String [tQtde];
            for (int i = 0; i < tQtde; i++){
                tLinha [i] = tArq2.readLine();
            }

            tArq2.close();
            setNumAge(Integer.parseInt(tLinha [0]));
            setNumConta(Integer.parseInt(tLinha [1]));
            setNome(tLinha [2]);
            setSaldo(Double.parseDouble(tLinha [3]));
        }
        catch (IOException tExcept)		{
            tExcept.printStackTrace();
        }
    }

    public boolean gravar (){
        FileWriter  tArq1;
        PrintWriter tArq2;

        try {
            tArq1 = new FileWriter (getNumAge() + "." + getNumConta() + ".dat");
            tArq2 = new PrintWriter (tArq1);
            tArq2.println (getNumAge());
            tArq2.println (getNumConta());
            tArq2.println (getNome());
            tArq2.println (getSaldo());

            tArq2.close();

            return true;
        }

        catch (IOException tExcept)		{
            tExcept.printStackTrace();
            return false;
        }

    }

    public int getNumAge(){
        return this.numAge;
    }

    public void setNumAge(int numAge){
        this.numAge = numAge;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
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

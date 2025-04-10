package view;

import java.util.Scanner;

import model.Lab02ContaCorrente;

public class Lab02Sistema {
    Lab02ContaCorrente minhaConta = new Lab02ContaCorrente();

    public static void main(String[] args) {
        new Lab02Sistema().executarLab();
    }

    private void executarLab() {
        int opcao = 0;
        while (opcao != 9) {
            Scanner leia = new Scanner(System.in);

            System.out.println("1 - Cadastramento");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Mostrar dados da Conta");
            System.out.println("9 - Fim");
            System.out.println("Digite uma opção: ");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    execCadastramento();
                    break;
                case 2:
                    execSaque();
                    break;
                case 3:
                    execDeposito();
                    break;
                case 4:
                    execConsulta();
                    break;
                default:
                    break;
            }
        }
    }

    public void execCadastramento() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int agencia = leia.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = leia.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String nome = leia.next();

        System.out.println("Digite o saldo da conta: ");
        double saldo = leia.nextDouble();

        System.out.println("Confirme o cadastramento(S/N). ");
        String conf_cad = leia.next();

        if (conf_cad.equalsIgnoreCase("s")) {
            this.minhaConta.setNumAge(agencia);
            this.minhaConta.setNumConta(conta);
            this.minhaConta.setNome(nome);
            this.minhaConta.setSaldo(saldo);
            System.out.println("Cadastro realizado com sucesso!");
        } else if (conf_cad.equalsIgnoreCase("n")) {
            System.out.println("Cadastro cancelado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void execSaque() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int agencia = leia.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = leia.nextInt();

        System.out.println("Digite o valor do saque: ");
        double saque = leia.nextDouble();

        System.out.println("Confirme o saque(S/N): ");
        String conf_saque = leia.next();

        if (conf_saque.equalsIgnoreCase("s")) {
            int podeSacar = this.minhaConta.sacar(saque);
            if (podeSacar == 1) {
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else if (conf_saque.equalsIgnoreCase("n")) {
            System.out.println("Saque cancelado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void execDeposito() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int agencia = leia.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = leia.nextInt();

        System.out.println("Digite o valor do depósito: ");
        double deposito = leia.nextDouble();

        System.out.println("Confirme o depósito(S/N): ");
        String conf_dep = leia.next();

        if (conf_dep.equalsIgnoreCase("s")) {
            this.minhaConta.depositar(deposito);
            System.out.println("Depósito realizado com sucesso!");
        } else if (conf_dep.equalsIgnoreCase("n")) {
            System.out.println("Depósito cancelado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void execConsulta() {
        this.minhaConta.imprimir();
    }

}

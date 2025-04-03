package view;

import java.util.Scanner;

public class Lab01Sistema{
    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 9){
            Scanner leia = new Scanner(System.in);

            System.out.println("1 - Cadastramento");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("9 - Fim");
            System.out.println("Digite uma opção: ");

            opcao = leia.nextInt();

            switch (opcao){
                case 1:
                    execCadastramento();
                    break;
                case 2:
                    execSaque();
                    break;
                case 3:
                    execDeposito();
                    break;
                default:
                    break;
            }
        }
    }

    public static void execCadastramento(){
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

        if (conf_cad.equalsIgnoreCase("s")){
            System.out.println("Cadastro realizado com sucesso!");
        }
        else if (conf_cad.equalsIgnoreCase("n")){
            System.out.println("Cadastro cancelado com sucesso!");
        }
        else {
            System.out.println("Opção inválida!");
        }
    }

    public static void execSaque(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int agencia = leia.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = leia.nextInt();

        System.out.println("Digite o valor do saque: ");
        double saque = leia.nextDouble();

        System.out.println("Confirme o saque(S/N): ");
        String conf_saque = leia.next();

        if (conf_saque.equalsIgnoreCase("s")){
            System.out.println("Saque realizado com sucesso!");
        }
        else if (conf_saque.equalsIgnoreCase("n")){
            System.out.println("Saque cancelado com sucesso!");
        }
        else {
            System.out.println("Opção inválida!");
        }
    }

    public static void execDeposito(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int agencia = leia.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = leia.nextInt();

        System.out.println("Digite o valor do depósito: ");
        double deposito = leia.nextDouble();

        System.out.println("Confirme o depósito(S/N): ");
        String conf_dep = leia.next();

        if (conf_dep.equalsIgnoreCase("s")){
            System.out.println("Depósito realizado com sucesso!");
        }
        else if (conf_dep.equalsIgnoreCase("n")){
            System.out.println("Depósito cancelado com sucesso!");
        }
        else {
            System.out.println("Opção inválida!");
        }
    }

}

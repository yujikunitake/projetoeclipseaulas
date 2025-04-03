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
                    break;
                case 3:
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
        double saldo = leia.nextInt();

        System.out.println("Confirme o cadastramento(S/N). ");
        String cad = leia.next();

        if (cad.equalsIgnoreCase("s")){
            System.out.println("Cadastro realizado com sucesso!");
        }

    }
}

package Application;

import java.util.Scanner;

import Entities.Usuario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nome:");
		String nome = sc.next();
		System.out.print("Sobrenome:");
		String sobrenome = sc.next();
		System.out.print("CPF:");
		String CPF = sc.next();
		System.out.print("Saldo:");
		double saldo = sc.nextDouble();
		
		Usuario usuario = new Usuario(nome,sobrenome,CPF,saldo);
		
		while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depósito");
            System.out.println("3. Saque");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            
            if (opcao == 1) {
                System.out.println(usuario.consultarSaldo());
            } else if (opcao == 2) {
                System.out.print("Quantos deseja depositar? R$ ");
                double deposito = sc.nextDouble();
                usuario.deposito(deposito);
                System.out.println(usuario.consultarSaldo());
            } else if (opcao == 3) {
                System.out.print("Quantos deseja sacar? R$ ");
                double saque = sc.nextDouble();
                usuario.saque(saque);
                System.out.println(usuario.consultarSaldo());
            } else if (opcao == 4) {
                System.out.println("Saindo... Obrigado por usar o sistema bancário.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

		
		sc.close();

	}

}

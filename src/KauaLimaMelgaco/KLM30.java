package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM30 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                   *");
		System.out.println("*  Classe : KLM30 - Exercício 30: Menu até escolher sair          *");
		System.out.println("*******************************************************************");

		Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Mostrar Data (exemplo)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Olá, usuário!");
            } else if (opcao == 2) {
                System.out.println("Hoje é um ótimo dia para programar!");
            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }

        sc.close();
	}

}

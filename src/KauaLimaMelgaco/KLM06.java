package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM06 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                            *");
		System.out.println("*  Classe : KLM06 - Exercício 6: Múltiplo de 3 e/ou 5      *");
		System.out.println("************************************************************");

		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();

	        if (numero % 3 == 0 && numero % 5 == 0) {
	            System.out.println("O número é múltiplo de 3 e 5.");
	        } else if (numero % 3 == 0) {
	            System.out.println("O número é múltiplo de 3.");
	        } else if (numero % 5 == 0) {
	            System.out.println("O número é múltiplo de 5.");
	        } else {
	            System.out.println("O número não é múltiplo de 3 nem de 5.");
	        }

	        sc.close();

	}

}

package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM37 {

	public static void main(String[] args) {
		
		System.out.println("***************************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                           *");
		System.out.println("*  Classe : KLM37 - Exercício 37: Soma até o número ser múltiplo de 10    *");
		System.out.println("***************************************************************************");
		
		  Scanner sc = new Scanner(System.in);
	        int numero;
	        int soma = 0;

	        do {
	            System.out.print("Digite um número: ");
	            numero = sc.nextInt();
	            soma += numero;
	        } while (numero % 10 != 0);

	        System.out.println("Soma total: " + soma);
	        sc.close();
		

	}

}

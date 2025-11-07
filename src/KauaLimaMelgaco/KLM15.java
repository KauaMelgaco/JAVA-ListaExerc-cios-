package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM15 {

	public static void main(String[] args) {
		
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                            *");
		System.out.println("*  Classe : KLM15 - Exercício 15: Fatorial de um número    *");
		System.out.println("************************************************************");

		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número para calcular o fatorial: ");
	        int numero = sc.nextInt();

	        long fatorial = 1;

	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }

	        System.out.println("O fatorial de " + numero + " é: " + fatorial);

	        sc.close();
	    }
		
		
		
		
	}




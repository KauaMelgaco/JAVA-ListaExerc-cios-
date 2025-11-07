package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM12 {

	public static void main(String[] args) {
		
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                            *");
		System.out.println("*  Classe : KLM12 - Exercício 12: Tabuada de um número     *");
		System.out.println("************************************************************");
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número para ver sua tabuada: ");
	        int numero = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }

	        sc.close();

	}

}

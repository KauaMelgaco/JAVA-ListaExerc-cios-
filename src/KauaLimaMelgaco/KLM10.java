package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM10 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                            *");
		System.out.println("*  Classe : KLM10 - Exercício 10: Ano bissexto             *");
		System.out.println("************************************************************");
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um ano: ");
	        int ano = sc.nextInt();

	        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
	            System.out.println(ano + " é um ano bissexto.");
	        } else {
	            System.out.println(ano + " não é um ano bissexto.");
	        }

	        sc.close();
	

	}

}

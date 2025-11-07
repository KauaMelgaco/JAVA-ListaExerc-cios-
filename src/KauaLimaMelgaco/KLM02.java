package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM02 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                            *");
		System.out.println("*  Classe : KLM02 - Exercício 2: Par ou Ímpar              *");
		System.out.println("************************************************************");
		
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite um número : ");
		        int numero = sc.nextInt();

		        if (numero % 2 == 0) {
		            System.out.println("O número é par.");
		        } else {
		            System.out.println("O número é ímpar.");
		        }

		        sc.close();
		    }
		}
	

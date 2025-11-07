package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM01 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:002438                             *");
		System.out.println("*  Classe : KLM01 - Exercício 1: Número positivo ou negativo");
		System.out.println("************************************************************");
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite um número: ");
		        double numero = sc.nextDouble();

		        if (numero > 0) {
		            System.out.println("O número é positivo.");
		        } else if (numero < 0) {
		            System.out.println("O número é negativo.");
		        } else {
		            System.out.println("O número é zero.");
		        }

		        sc.close();
		    }

	}


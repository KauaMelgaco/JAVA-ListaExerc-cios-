package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM07 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                            *");
		System.out.println("*  Classe : KLM07 - Exercício 7: Triângulo válido          *");
		System.out.println("************************************************************");
	
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o lado A: ");
	        double a = sc.nextDouble();

	        System.out.print("Digite o lado B: ");
	        double b = sc.nextDouble();

	        System.out.print("Digite o lado C: ");
	        double c = sc.nextDouble();

	        if (a < b + c && b < a + c && c < a + b) {
	            System.out.println("É um triângulo válido!");
	        } else {
	            System.out.println("Não é um triângulo válido.");
	        }

	        sc.close();

	}

}

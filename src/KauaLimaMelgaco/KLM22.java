package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM22 {

	public static void main(String[] args) {

		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                   *");
		System.out.println("*  Classe : KLM22 - Exercício 22: Soma de números até digitar zero*");
		System.out.println("*******************************************************************");

		Scanner sc = new Scanner(System.in);
		int numero;
		int soma = 0;

		System.out.println("Digite números para somar (0 para sair):");
		numero = sc.nextInt();

		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}

		System.out.println("A soma dos números digitados é: " + soma);
		sc.close();
	}

}

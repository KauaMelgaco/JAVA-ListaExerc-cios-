package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM25 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                   *");
		System.out.println("*  Classe : KLM25 - Exercício 25: Tabuada com while               *");
		System.out.println("*******************************************************************");

		Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        sc.close();
	}

}

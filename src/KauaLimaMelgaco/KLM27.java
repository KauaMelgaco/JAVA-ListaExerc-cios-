package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM27 {

	public static void main(String[] args) {
		System.out.println("**************************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                          *");
		System.out.println("*  Classe : KLM27 - Exercício 27: Quantidade de números ímpares digitados*");
		System.out.println("**************************************************************************");

		Scanner sc = new Scanner(System.in);

        int contador = 1;
        int impares = 0;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 != 0) {
                impares++;
            }

            contador++;
        }

        System.out.println("Você digitou " + impares + " números ímpares.");
        sc.close();
	}

}

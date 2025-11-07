package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM32 {

	public static void main(String[] args) {
		
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                   *");
		System.out.println("*  Classe : KLM32 - Exercício 32: Tabuada de um número            *");
		System.out.println("*******************************************************************");
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        int i = 1;

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        sc.close();

		
	}

}

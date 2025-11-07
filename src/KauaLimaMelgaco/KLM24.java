package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM24 {

	public static void main(String[] args) {
		System.out.println("********************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                    *");
		System.out.println("*  Classe : KLM24 - Exercício 24: Verificar se um número é positivo*");
		System.out.println("********************************************************************");
		
		Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Você digitou um número positivo: " + numero);
        sc.close();
	}
	

}

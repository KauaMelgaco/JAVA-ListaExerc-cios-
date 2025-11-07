package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM39 {

	public static void main(String[] args) {
		
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                   *");
		System.out.println("*  Classe : KLM39 - Exercício 39:    Validar número entre 1 e 5   *");
		System.out.println("*******************************************************************");
		
	    Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 5);

        System.out.println("Número válido digitado: " + numero);
        sc.close();
    }
	}


package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM40 {

	public static void main(String[] args) {
		
		System.out.println("***************************************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                                       *");
		System.out.println("*  Classe : KLM40 - Exercício 40: Ler números e mostrar o maior (até digitar negativo)*");
		System.out.println("***************************************************************************************");
	
		Scanner sc = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;

        do {
            System.out.print("Digite um número (negativo para parar): ");
            numero = sc.nextInt();

            if (numero >= 0 && numero > maior) {
                maior = numero;
            }
        } while (numero >= 0);

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }

        sc.close();
	}

}

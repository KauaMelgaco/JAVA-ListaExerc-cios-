package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM05 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                            *");
		System.out.println("*  Classe : KLM05 - Exercício 5: Notas e aprovação         *");
		System.out.println("************************************************************");

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado! Média: " + media);
        } else if (media >= 5) {
            System.out.println("Recuperação! Média: " + media);
        } else {
            System.out.println("Reprovado! Média: " + media);
        }

        sc.close();
	}

}

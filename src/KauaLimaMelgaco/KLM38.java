package KauaLimaMelgaco;

import java.util.Scanner;

public class KLM38 {

	public static void main(String[] args) {
		
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Kauã Lima RA:0024384                                   *");
		System.out.println("*  Classe : KLM38 - Exercício 38:     Confirmar saída com 's'     *");
		System.out.println("*******************************************************************");
		
		  Scanner sc = new Scanner(System.in);
	        char resposta;

	        do {
	            System.out.println("Você deseja sair do programa? (s/n)");
	            resposta = sc.next().charAt(0);
	        } while (resposta != 's' && resposta != 'S');

	        System.out.println("Saindo do programa...");
	        sc.close();
	    }
		

	

}

package questao01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
		 * caractere * e espaços. A base e altura da escada devem ser iguais ao valor de
		 * n. A última linha não deve conter nenhum espaço.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a altura desejada da escada e tecle enter: ");
		try {
			montaEscada(entrada);
		} catch (Exception e) {
			System.out.println("Entrada inválida!!! ");
		} 

	}

	private static void montaEscada(Scanner entrada) {
		int n;
		int linha;
		int coluna;
		n = entrada.nextInt();
		while(n <= 0) {
			System.out.println("Número inválido, entre com a altura desejada e tecle enter: ");
			n = entrada.nextInt();
		}

		for (linha = 1; linha <= n; linha++) {
			for (coluna = n; coluna > 0; coluna--) {
				if (coluna <= linha)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

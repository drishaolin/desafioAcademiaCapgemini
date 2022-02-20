package questao03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de
		 * uma palavra podem ser realocadas para formar a outra palavra. Dada uma string
		 * qualquer, desenvolva um algoritmo que encontre o número de pares de
		 * substrings que são anagramas.
		 * 
		 */

		String palavra;
		int contador = 0;
		
		Scanner entradaPalavra = new Scanner(System.in);
		
		System.out.println("Digite a palavra para saber quantas substrings anagramas ela possui:");
		palavra = entradaPalavra.next();

		List<String> substringsDePalavra = listarSubstr(palavra);

		for (int i = 0; i < substringsDePalavra.size() - 1; i++) {
			for (int j = i + 1; j < substringsDePalavra.size(); j++) {
				if (substringsDePalavra.get(i).length() == substringsDePalavra.get(j).length()) {
					if(verificaAnagramas(substringsDePalavra.get(i), substringsDePalavra.get(j))) {
						contador++;
					};
				}

			}
		}
		System.out.println("Números de pares de substrings anagramas: " + contador);
		entradaPalavra.close();

	}

	private static List<String> listarSubstr(String palavra) {
		List<String> arrayDeSubstrings = new ArrayList<>();
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i + 1; j <= palavra.length(); j++) {
				if (palavra == palavra.substring(i, j)) {
					continue;
				}
				arrayDeSubstrings.add(palavra.substring(i, j));
			}
		}
		return arrayDeSubstrings;
	}

	private static boolean verificaAnagramas(String str1, String str2) {
		char caracteresStr1[] = str1.toCharArray();
		char caracteresStr2[] = str2.toCharArray();

		Arrays.sort(caracteresStr1);
		Arrays.sort(caracteresStr2);

		for (int i = 0; i < caracteresStr1.length; i++) {
			if (caracteresStr1[i] != caracteresStr2[i]) {
				return false;
			}
		}
		return true;
	}

}

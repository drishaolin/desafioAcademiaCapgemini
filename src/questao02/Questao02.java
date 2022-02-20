package questao02;

import java.util.List;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		/*
		 * Débora se inscreveu em uma rede social para se manter em contato com seus
		 * amigos. A página de cadastro exigia o preenchimento dos campos de nome e
		 * senha, porém a senha precisa ser forte. O site considera uma senha forte
		 * quando ela satisfaz os seguintes critérios: Possui no mínimo 6 caracteres.
		 * Contém no mínimo 1 digito. Contém no mínimo 1 letra em minúsculo. Contém no
		 * mínimo 1 letra em maiúsculo. Contém no mínimo 1 caractere especial. Os
		 * caracteres especiais são: !@#$%^&*()-+ Construa um algoritmo que informe qual
		 * é o número mínimo de caracteres que devem ser adicionados para uma string
		 * qualquer ser considerada segura.
		 */

		ValidadorDeSenha validador = new ValidadorDeSenha();

		String senha;
		boolean senhaInvalida = true;
		Scanner entradaSenha = new Scanner(System.in);

		while(senhaInvalida) {
			System.out.println("Cadastre sua senha: ");
			senha = entradaSenha.next();
			
			List<String> mensagensErro = validador.valida(senha);
			if (mensagensErro.isEmpty()) {
				System.out.println("Senha registrada com sucesso!!!");
				senhaInvalida = false;
				entradaSenha.close();
				
			} else {
				for (String mensagem : mensagensErro) {
					System.out.println(mensagem);
				}
			}
			
		}

	}
}

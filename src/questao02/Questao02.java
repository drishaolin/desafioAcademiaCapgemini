package questao02;

import java.util.List;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		/*
		 * D�bora se inscreveu em uma rede social para se manter em contato com seus
		 * amigos. A p�gina de cadastro exigia o preenchimento dos campos de nome e
		 * senha, por�m a senha precisa ser forte. O site considera uma senha forte
		 * quando ela satisfaz os seguintes crit�rios: Possui no m�nimo 6 caracteres.
		 * Cont�m no m�nimo 1 digito. Cont�m no m�nimo 1 letra em min�sculo. Cont�m no
		 * m�nimo 1 letra em mai�sculo. Cont�m no m�nimo 1 caractere especial. Os
		 * caracteres especiais s�o: !@#$%^&*()-+ Construa um algoritmo que informe qual
		 * � o n�mero m�nimo de caracteres que devem ser adicionados para uma string
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

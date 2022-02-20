package questao02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ValidadorDeSenha {
	private static final Integer TAMANHO_MINIMO = 6;

	public List<String> valida(String senha) {
		List<String> listaMensagens = new ArrayList<>();
		validaTamanho(senha,listaMensagens);
		validaDigito(senha,listaMensagens);
		validaMinuscula(senha,listaMensagens);
		validaMaiuscula(senha,listaMensagens);
		validaCaracterEspecial(senha,listaMensagens);
		return listaMensagens;
		
	}

	private void validaTamanho(String senha, List<String> listaMensagens ) {

		if (senha.length() < TAMANHO_MINIMO) {
			int caracteresFaltantes = ValidadorDeSenha.TAMANHO_MINIMO - senha.length();
			listaMensagens.add("Faltam " + caracteresFaltantes + " caracteres para "
					+ "completar sua senha");
		}
	}

	private void validaDigito(String senha, List<String> listaMensagens) {

		if (!Pattern.matches(".*[0-9].*", senha)) {
			
			listaMensagens.add("Sua senha deve conter no mínimo 1 dígito.");
		}
	}
	
	private void validaMinuscula(String senha, List<String> listaMensagens) {
		if(!Pattern.matches(".*[a-z].*", senha)) {
			listaMensagens.add("Sua senha deve conter no mínimo 1 letra minúscula.");
		}
	}
	
	private void validaMaiuscula(String senha, List<String> listaMensagens) {
		if(!Pattern.matches(".*[A-Z].*", senha)) {
			listaMensagens.add("Sua senha deve conter no mínimo 1 letra maiúscula.");
		}
	}
	
	private void validaCaracterEspecial(String senha, List<String> listaMensagens) {
		if(!Pattern.matches(".*[!@#$%^&*()-+].*", senha)) {
			listaMensagens.add("Sua senha deve conter no mínimo 1 dos seguintes caracteres especiais: "
					+ "! @ # $ % ^ & * ( ) - + ");
		}
	}

}

package main;

public class UsuarioNegocio {

	private UsuarioRepositorio rep = new UsuarioRepositorio();

	public boolean cadastrarUsuario(Usuario usuario) {

		// Valida se algum campo é null
		if (usuario.getNome() == null || usuario.getEmail() == null || usuario.getSenha() == null
				|| usuario.getCpf() == null || usuario.getContaCorrente() < 0 || usuario.getAgencia() < 0
				|| usuario.getBanco() == null || usuario.getTipo() == null) {
			return false;
		}

		// Valida se o tipo do perfil informado é válido
		if (usuario.getTipo() != "Consumidor" && usuario.getTipo() != "Motorista") {
			return false;
		}

		// Valida se o user do tipo motorista não possui habilitação igual a nula
		if (usuario.getTipo() == "Motorista") {
			if (usuario.getHabilitacao() == null) {
				return false;
			}
		}

		rep.adicionarUsuario(usuario);

		return true;
	}
	
	public boolean removerUsuario(String cpf) {

		for (Usuario user : rep.listarUsuarios()) {
			if (user.getCpf().equals(cpf)) {
				rep.removerUsuario(user);
				return true;
			}
		}
		
		return false;
	}

	public boolean realizarLogin(String cpf, String senha) {

		for (Usuario user : rep.listarUsuarios()) {
			if (user.getCpf().equals(cpf)
					&& user.getSenha().equals(senha)) {
				return true;
			} else {
				System.out.println("CPF ou senha informados estão inválidos.");
			}
		}

		return false;
	}

}

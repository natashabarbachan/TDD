package main;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {

	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public boolean adicionarUsuario(Usuario user) {
		return this.usuarios.add(user);
	}
	
	public List<Usuario> listarUsuarios() {
		return this.usuarios;
	}
	
	public boolean removerUsuario(Usuario user) {
		return this.usuarios.remove(user);
	}
}

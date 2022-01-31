package test;

import org.junit.Assert;
import org.junit.Test;

import main.Usuario;
import main.UsuarioNegocio;

public class UsuarioTest {
	UsuarioNegocio un = new UsuarioNegocio();

	@Test
	public void t5_verificaCadastroUsuarioConsumidorValido() {

		boolean resultado = un.cadastrarUsuario(new Usuario("Natasha", "natasha@gmail.com", "121415@Natasha",
				"41651119023", 0735652, 5936, "Bradesco", "PE", "Consumidor", ""));

		Assert.assertEquals(true, resultado);
	}

	@Test
	public void t6_verificaCadastroUsuarioMotoristaValido() {

		boolean resultado = un.cadastrarUsuario(new Usuario("Joao", "joao@gmail.com", "121415@Joao", "75553584094",
				82913, 4095, "Itau", "PE", "Motorista", "73275703954"));

		Assert.assertEquals(true, resultado);
	}

	@Test
	public void t7_verificaCadastroUsuarioInvalido() {

		boolean resultado = un.cadastrarUsuario(new Usuario("Joao Silva", "joao@gmail.com", "121415@Joao", null, 00000,
				0000, null, null, "Motorista", null));

		Assert.assertEquals(false, resultado);
	}

	@Test
	public void t8_validarRemoverUsuarioPorCpf() {
		un.cadastrarUsuario(new Usuario("Pedro", "pedro@gmail.com", "121415@CompraFacil", "12664063014", 82313, 4000,
				"Bradesco", "PE", "Consumidor", ""));
		 
		boolean resultado = un.removerUsuario("12664063014");
		
		Assert.assertEquals(true, resultado);
	}
}
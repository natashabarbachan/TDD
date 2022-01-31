package test;

import org.junit.Assert;
import org.junit.Test;

import main.Usuario;
import main.UsuarioNegocio;

public class LoginTest {

	UsuarioNegocio un = new UsuarioNegocio();

	@Test
	public void t3_VerificaLogin() {

		un.cadastrarUsuario(new Usuario("Pedro", "pedro@gmail.com", "121415@CompraFacil", "12664063014", 82313, 4000,
				"Bradesco", "PE", "Consumidor", ""));

		boolean resultado = un.realizarLogin("12664063014", "121415@CompraFacil");

		Assert.assertEquals(true, resultado);
	}

	@Test
	public void t4_VerificaLoginCredenciaisInvalidas() {

		un.cadastrarUsuario(new Usuario("Pedro", "pedro@gmail.com", "121415@Pedro", "12664063014", 82313, 4000,
				"Bradesco", "PE", "Consumidor", ""));

		boolean resultado = un.realizarLogin("00000000001", "121415@Pedro");

		Assert.assertEquals(false, resultado);
	}

}

package test;

import org.junit.Assert;
import org.junit.Test;

import main.Produto;
import main.ProdutoNegocio;

public class ProdutoTest {

	ProdutoNegocio pn = new ProdutoNegocio();
	
	@Test
	public void t10_validarQtdProdutoPorCategoria() {		
		
		pn.cadastrarProduto(new Produto("Tv",
				"Samsung",
				"Tv LCD 32 polegadas",
				"Eletrônicos",
				10));
		
		pn.cadastrarProduto(new Produto("Carne Bovina",
				"BoiMeuBoi",
				"Carne boa do interior!",
				"Aves e Carnes",
				5));
		
		pn.cadastrarProduto(new Produto("PS5",
				"PlayStation",
				"PS5 novinho!",
				"Eletrônicos",
				15));

		int qtAtual = pn.listarProdutoPorCategoria("Eletrônicos").size();

		Assert.assertEquals(2, qtAtual);
	}
	
	@Test
	public void t12_validarBuscaProdutoValida() {
		
		pn.cadastrarProduto(new Produto("Banana",
				"Banana Pacovan",
				"Banana da Terra",
				"Alimentos",
				10));

		boolean resultado = pn.verificaProdutoPorNomeOuMarca("Banana Pacovan");

		Assert.assertEquals(true, resultado);
	}
	
	@Test
	public void t13_validarBuscaProdutoInvalida() {
		
		pn.cadastrarProduto(new Produto("Banana",
				"Banana Pacovan",
				"Banana da Terra",
				"Alimentos",
				10));

		boolean resultado = pn.verificaProdutoPorNomeOuMarca("Sabonete");

		Assert.assertEquals(false, resultado);
	}
}

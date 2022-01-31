package main;

import java.util.ArrayList;
import java.util.List;

public class ProdutoNegocio {

	private ProdutoRepositorio rep = new ProdutoRepositorio();

	public boolean cadastrarProduto(Produto produto) {
		rep.adicionarProduto(produto);

		return true;
	}
	
	public List<Produto> listarProdutoPorCategoria(String categoria) {
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		for (Produto produto : rep.listarProdutos()) {
			if (produto.getCategoria().equals(categoria)) {
				listaProdutos.add(produto);
			}
		}
		
		return listaProdutos;
	}
	
	public boolean verificaProdutoPorNomeOuMarca(String texto) {
		
		for (Produto produto : rep.listarProdutos()) {
			if (produto.getNome().equals(texto) || produto.getMarca().equals(texto)) {
				return true;
			} else {
				System.out.println("Produto ou marca não encontrada");
			}
		}
		return false;
	}
}

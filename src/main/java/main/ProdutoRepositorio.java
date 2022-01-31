package main;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio {

	private List<Produto> produtos = new ArrayList<Produto>();
	
	public boolean adicionarProduto(Produto produto) {
		return this.produtos.add(produto);
	}
	
	public List<Produto> listarProdutos() {
		return this.produtos;
	}
	
	public boolean removerProduto(Produto produto) {
		return this.produtos.remove(produto);
	}
}

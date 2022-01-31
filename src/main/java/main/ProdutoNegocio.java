package main;

public class ProdutoNegocio {

	private ProdutoRepositorio rep = new ProdutoRepositorio();

	public boolean cadastrarProduto(Produto produto) {

		rep.adicionarProduto(produto);

		return true;
	}
	
//	public boolean removerUsuario(String cpf) {
//
//		for (Usuario user : rep.listarUsuarios()) {
//			if (user.getCpf().equals(cpf)) {
//				rep.removerUsuario(user);
//				return true;
//			}
//		}
//		
//		return false;
//	}
}

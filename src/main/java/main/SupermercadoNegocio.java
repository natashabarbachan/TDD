package main;

public class SupermercadoNegocio {

	private final SupermercadoRepositorio rep = new SupermercadoRepositorio();

	public boolean cadastrarSupermercado(Supermercado supermercado) {
		rep.adicionarSupermercado(supermercado);

		return true;
	}

	public boolean removerSupermercado(String nome) {

		for (Supermercado market : rep.listarSupermercados()) {
			if (market.getNome().equals(nome)) {
				rep.removerSupermercado(market);
				return true;
			}
		}

		return false;
	}

	public boolean adicionarProduto(String nome, Produto produto) {
        
		for (Supermercado market : rep.listarSupermercados()) {
			
			if (market.getNome().equals(nome)) {
//                rep.cadastrarProdutos(produto);
                return true;
            } else {
				System.out.println("Supermercado informado não existe");
			}
		}

		return false;
    }
}

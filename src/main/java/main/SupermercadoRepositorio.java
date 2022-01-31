package main;

import java.util.ArrayList;
import java.util.List;

public class SupermercadoRepositorio {

private List<Supermercado> supermercados = new ArrayList<Supermercado>();
	
	public boolean adicionarSupermercado(Supermercado supermercado) {
		return this.supermercados.add(supermercado);
	}
	
	public List<Supermercado> listarSupermercados() {
		return this.supermercados;
	}
	
	public boolean removerSupermercado(Supermercado supermercado) {
		return this.supermercados.remove(supermercado);
	}
}

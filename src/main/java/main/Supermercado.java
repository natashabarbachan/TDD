package main;

import java.util.ArrayList;

public class Supermercado {

	private String nome;
	private String telefone;	
    private ArrayList<Produto> listaProdutos;
        	
	public Supermercado(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
        
    public boolean cadastrarProduto(Produto produto){
    	listaProdutos.add(produto);
        return true;
    }
}

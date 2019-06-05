package br.com.zup.modelo;

import java.util.List;

public class Biblioteca {

	private String nome;
	private String endereço;
	private List<Livros>  listaLivros;
	private List<Artigos> listaArtigos;
	
	public Biblioteca(String nome, String endereço, List<Livros> listaLivros) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.listaLivros = listaLivros;
	}
	

	
}
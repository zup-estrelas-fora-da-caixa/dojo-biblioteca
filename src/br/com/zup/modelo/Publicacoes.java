package br.com.zup.modelo;

import java.util.List;

public abstract class Publicacoes {

	// Atributos
	
	private String dataPub;
	private String titulo;

	private List<Publicacoes> referencias;
	private List<Autores> autores;

	// Construtor
	public Publicacoes(String dataPub, String titulo, List<Publicacoes> referencias, List<Autores> autores) {
		super();
		this.dataPub = dataPub;
		this.titulo = titulo;
		this.referencias = referencias;
		this.autores = autores;
	}

	// Getters and Setters
	public String getDataPub() {
		return dataPub;
	}

	public void setDataPub(String dataPub) {
		this.dataPub = dataPub;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Publicacoes> getReferencias() {
		return referencias;
	}

	public void setReferencias(List<Publicacoes> referencias) {
		this.referencias = referencias;
	}

	public List<Autores> getAutores() {
		return autores;
	}

	public void setAutores(List<Autores> autores) {
		this.autores = autores;
	}

}

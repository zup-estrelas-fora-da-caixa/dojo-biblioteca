package br.com.zup.modelo;

import java.util.List;

public class Livros extends Publicacoes {

	private String editora;
	private String isbn;
	private String Edicao;
	
	
	// Contrutores
	public Livros(String dataPub, String titulo, List<Publicacoes> referencias, 
			List<Autores> autores, String editora,
			String isbn, String edicao) {
		super(dataPub, titulo, referencias, autores);
		this.editora = editora;
		this.isbn = isbn;
		this.Edicao = edicao;
	}


	// Getters and Setters
	public String getEditora() {
		return editora;
	}



	public void setEditora(String editora) {
		this.editora = editora;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getEdicao() {
		return Edicao;
	}



	public void setEdicao(String edicao) {
		Edicao = edicao;
	}
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Título do livro -> " + super.getTitulo();
		modelo += "\nEdição -> " + this.getTitulo();
		modelo += "\nData -> " + super.getDataPub();
		modelo += "\nEditora -> " + this.getEdicao();
		modelo += "\nISBN -> "  +this.getIsbn();
		modelo += "\n lista de autores -> " + super.getAutores();
		return modelo; 
	}
	
}

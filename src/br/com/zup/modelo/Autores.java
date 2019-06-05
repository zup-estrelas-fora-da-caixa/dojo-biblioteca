package br.com.zup.modelo;

public class Autores {
	
	// Atributos
	private String nome;
	private String titulacao;
	
	public Autores(String nome, String titulacao) {
		super();
		this.nome = nome;
		this.titulacao = titulacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() { 
		String modelo = "";
		modelo += "Nome do autor -> " + this.getNome() + "\n";
		modelo += "Titulação do Autor -> " + this.getTitulacao() + "\n";
		return modelo;
	}
	
	
	
		
}

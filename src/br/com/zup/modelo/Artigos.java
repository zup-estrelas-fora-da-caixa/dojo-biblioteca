package br.com.zup.modelo;

import java.util.List;

public class Artigos extends Publicacoes {

	private String resumo;

	
	//Construtor
	public Artigos(String dataPub, String titulo, List<Publicacoes> referencias, 
			List<Autores> autores, String resumo) {
		super(dataPub, titulo, referencias, autores);
		this.resumo = resumo;
	}


	public String getResumo() {
		return resumo;
	}


	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String toString() {
		String modelo = "";
		//precisa dos supers
		
		modelo += "\nData:" + super.getDataPub();
		modelo += "\ntitulo" + super.getTitulo();
		modelo += "\nResumo " + this.getResumo();
		
		return modelo;
	}
	

	
}

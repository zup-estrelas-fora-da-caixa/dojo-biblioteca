package br.com.zup.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.zup.modelo.Autores;
import br.com.zup.modelo.Livros;
import br.com.zup.modelo.Publicacoes;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Lista autores
		List<Autores> autores = new ArrayList<Autores>();
		List<Publicacoes> referencias = new ArrayList<Publicacoes>();

		// Criando autores
		Autores primeiroAutor = new Autores("Isaque Newtow", "Engenheiro");
		Autores segundoAutor = new Autores("Joãozinho", "Médico");
		Autores terceiroAutor = new Autores("Maria", "Desenhista");

		autores.add(primeiroAutor);
		autores.add(segundoAutor);
		autores.add(terceiroAutor);

		//System.out.println(autores);

		List<Livros> listaLivros = new ArrayList<Livros>();

		Livros livro1 = new Livros("12/2/2002", "baba", referencias, autores, "ali", "2345667888", "bhhu");
		listaLivros.add(livro1);
		
		
		System.out.println(listaLivros);
		
		
	}

}

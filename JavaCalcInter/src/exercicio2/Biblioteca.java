package exercicio2;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Publicacao> publicacao = new ArrayList<Publicacao>();
	
	public void addPublicacao(Livro livro) {
		this.publicacao.add(livro);
	}

	public void addPublicacao(Artigo artigo) {
		this.publicacao.add(artigo);
	}

	public void listarAcervo() {
		for(int i=0;i<publicacao.size();i++) {
			System.out.println("Item "+i+":");
			System.out.println("Título: "+publicacao.get(i).getTitulo());
			System.out.println("Autor: "+publicacao.get(i).getAutor()+"\n");
		}
	}

	public void imprimirItem(int i) {
		publicacao.get(i).imprimir();
	}
	
}
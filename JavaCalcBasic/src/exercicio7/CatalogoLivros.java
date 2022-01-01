package exercicio7;

import java.util.ArrayList;

public class CatalogoLivros {

	ArrayList<Livro> numlivros = new ArrayList<Livro>();

	public void imprimirLivros() {

		System.out.println("-------- Listagem de Livros --------");
		if(numlivros.size()==0) {
			System.out.println("\n    Não há livros cadastrados!\n");
		}else {
			for(int i=0;i<numlivros.size();i++) {
				System.out.println("Posição: "+ i);
				System.out.println("Código: "+ numlivros.get(i).getCodigo());
				System.out.println("Título: "+ numlivros.get(i).getTitulo());
				System.out.println("Autor: "+ numlivros.get(i).getAutor());
				System.out.println("Resumo: "+ numlivros.get(i).getResumo());
				System.out.println("Num. Páginas: "+ numlivros.get(i).getPaginas()+"\n");

			}
		}
		System.out.println("------------------------------------");
	}

	public void adicionar(Livro livro) {
		numlivros.add(livro);
	}

	public void remover(int i) {
		numlivros.remove(i);
	}

}
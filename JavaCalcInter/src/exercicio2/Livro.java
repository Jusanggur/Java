package exercicio2;

import java.util.ArrayList;

public class Livro extends Publicacao{

	private ArrayList<Capitulo> capitulo = new ArrayList<Capitulo>();

	public Livro(String autor, String titulo, int ano) {
		super(autor, titulo, ano);
	}

	public void addCapitulo(Capitulo capitulo) {
		this.capitulo.add(capitulo);
	}

	@Override
	public void imprimir() {
		System.out.println("---- LIVRO ----");
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Ano: "+ano);
		int aux=1;
		for(int i=0;i<capitulo.size();i++) {
			System.out.println("Capítulo "+ aux +": "+capitulo.get(i).getCapitulo());
			System.out.println(capitulo.get(i).getTexto());
			aux++;
		}
		System.out.println("");
	}
	
}

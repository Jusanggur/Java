package exercicio2;

import java.util.ArrayList;

public class Artigo extends Publicacao{

	private ArrayList<Secao> secao = new ArrayList<Secao>();

	public Artigo(String autor, String titulo, int ano) {
		super(autor, titulo, ano);
	}

	public void addSecao(Secao secao) {
		this.secao.add(secao);
	}

	@Override
	public void imprimir() {
		System.out.println("---- ARTIGO ----");
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Ano: "+ano);
		int aux=1;
		for(int i=0;i<secao.size();i++) {
			System.out.println("Seção "+ aux +": "+secao.get(i).getSecao());
			System.out.println(secao.get(i).getConteudo());
			aux++;
		}
	}

}
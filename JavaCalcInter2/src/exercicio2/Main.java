package exercicio2;

public class Main {
	public static void main(String[] args) {
		
		Livro livro = new Livro("autor 1", "titulo 1", 2000);
		livro.addCapitulo(new Capitulo("Capitulo", "Texto"));
		livro.addCapitulo(new Capitulo("Capitulo", "Texto"));
		
		Artigo artigo = new Artigo("autor 2", "titulo 2", 2019);
		artigo.addSecao(new Secao("Secao", "Conteúdo"));
		artigo.addSecao(new Secao("Secao", "Conteúdo"));
		artigo.addSecao(new Secao("Secao", "Conteúdo"));
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.addPublicacao(livro);
		biblioteca.addPublicacao(artigo);
		
		biblioteca.listarAcervo();
		
		biblioteca.imprimirItem(0);
		
		biblioteca.imprimirItem(1);
		

	}
}
//SAIDA ESPERADA
//Item 0:
//Título: titulo 1
//Autor: autor 1
//
//Item 1:
//Título: titulo 2
//Autor: autor 2
//
//---- LIVRO ----
//Título:titulo 1
//Autor: autor 1
//Ano: 2000
//Capítulo 1: Capitulo
//Texto
//Capítulo 2: Capitulo
//Texto
//
//---- ARTIGO ----
//Título:titulo 2
//Autor: autor 2
//Ano: 2019
//Seção 1: Secao
//Conteúdo
//Seção 2: Secao
//Conteúdo
//Seção 3: Secao
//Conteúdo
//

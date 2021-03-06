package exercicio2;

public abstract class Publicacao {
	String autor, titulo;
	int ano;
	
	public Publicacao(String autor, String titulo, int ano) {
		this.autor = autor;
		this.titulo = titulo;
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public abstract void imprimir();

}

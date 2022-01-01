package exercicio7;

public class Livro {

	private int Codigo, Paginas;
	private String Autor, Resumo, Titulo;

	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}
	public int getPaginas() {
		return Paginas;
	}
	public void setPaginas(int paginas) {
		this.Paginas = paginas;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		this.Autor = autor;
	}
	public String getResumo() {
		return Resumo;
	}
	public void setResumo(String resumo) {
		this.Resumo = resumo;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}


}
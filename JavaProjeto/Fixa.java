package Projeto;


public class Fixa extends Despesa{
	String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return super.toString() +" " +"["+categoria+"]";
	}

	@Override
	public void detalharDespesa() {
		System.out.println("\nTipo: Renda Fixa" );
		System.out.println("Nome: " + getNome());
		System.out.printf("Valor: R$ %.2f \n", getValor());
		System.out.println("Categoria: "+ getCategoria() + "\n");
		
	}

}

package exercicio1;

public class Professor extends Pessoa {
	
	private int siape;

	public Professor(String nome, int idade, int siape) {
		super(nome, idade);
		this.siape = siape;
	}

	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Siape: " + siape);
	}
	
}


public class Item {
	// Possui dois atributos: o valor e o nome
	private double Valor;
	private string Nome;
	
	public Item(double Valor, string Nome) {
		this.Valor = Valor;
		this.Nome = Nome;
	}
	
	public double getValor() {
		return Valor;
	}
	public string getNome() {
		return Nome;
	}
	
}

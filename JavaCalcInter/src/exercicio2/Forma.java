package exercicio2;

public class Forma {
	
	private double medida[];
	
	public Forma() {
		
	}
	
	public Forma(int numMedidas) {
		medida = new double[numMedidas]; 
	}

	public double getMedida(int i) { 
		return medida[i];
	}

	public void setMedida(int i, double m) { 
		medida[i] = m;
	}
	
	public double perimetro() {
		return -1;	
	}

	public double area() {
		return -1;
	}

	public String info() {
		return "Sem forma definida";
	}
}

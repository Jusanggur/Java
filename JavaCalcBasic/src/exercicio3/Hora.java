package exercicio3;

public class Hora {
	
	private int i, j, k;

	public void setHorario(int i, int j, int k) {
		this.i = i;
		this.j = j; 
		this.k = k;
	}
	
	public void imprimir() {
		System.out.println(i+":"+j+":"+k);
	}

	public void periodo(){
		if(i>=18) {
			System.out.println("Eh noite!");
		}else if(i<18) {
			System.out.println("Eh dia!");
		}
	}
	
}
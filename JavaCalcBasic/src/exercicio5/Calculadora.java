package exercicio5;

public class Calculadora {

	private boolean Resultado;
	private int ResultadoI;

	public boolean ehPar(int i) {
		if(i%2==0) {
			Resultado = true;
		}else {
			Resultado = false;
		}
		return Resultado;
	}

	public boolean ehImpar(int i) {
		if(i%2!=0) {
			Resultado = true;
		}else {
			Resultado = false;
		}
		return Resultado;
	}

	public boolean ehPrimo(int i) {
		int cont=0;
		for(int aux=1;aux<=i;aux++) {
			if(i%aux==0) {
				cont++;
			}
		}
		if(cont==2) {
			Resultado = true;
		}else {
			Resultado = false;
		}
		return Resultado;
	}

	public int fatorial(int i) {
		int ResultadoI=1;
		for(int aux=1;aux<=i;aux++) {
			ResultadoI=ResultadoI*aux;	
		}
		return ResultadoI;
	}

	public int somar(int i, int j) {
		ResultadoI = i+j;
		return ResultadoI;
	}

	public int subtrair(int i, int j) {
		ResultadoI = i-j;
		return ResultadoI;
	}

	public int multiplicar(int i, int j) {
		ResultadoI = i*j;
		return ResultadoI;
	}

	public int dividir(int i, int j) {
		ResultadoI = i/j;
		return ResultadoI;
	}

}
package exercicio5;


public class Main {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		if(calculadora.ehPar(4)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	

		if(!calculadora.ehPar(5)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}			

		if(calculadora.ehImpar(5)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	

		if(!calculadora.ehImpar(6)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if(calculadora.ehPrimo(7)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		

		if(!calculadora.ehPrimo(8)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	

		if(calculadora.fatorial(5)==120) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		

		if(calculadora.fatorial(4)==24) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	

		if(calculadora.somar(1, 1)==2) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		

		if(calculadora.subtrair(1, 1)==0) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		

		if(calculadora.multiplicar(4, 2)==8) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		

		if(calculadora.dividir(4, 2)==2) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		
	}
}
//SAIDA ESPERADA
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK

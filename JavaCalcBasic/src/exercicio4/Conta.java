package exercicio4;

public class Conta {

	private String Titular;
	private int Conta;
	private double Saldo;
	
	public Conta(int Conta, String Titular) {
		this.Conta = Conta;
		this.Titular = Titular;	
	}

	public void sacar(int i) {
		if(Saldo<=0) {
			System.out.println("O saque se encontra indisponivel");
		}else {
			Saldo=Saldo-i;
			System.out.println("Saque efetuado com sucesso");
		}
	}

	public void depositar(int i) {
		Saldo=Saldo+i;
		System.out.println("Deposito efetuado com sucesso");
	}
	

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void imprimir() {
		System.out.println("Informacoes da Conta");
		System.out.println("Titular: "+Titular);
		System.out.println("Conta: "+Conta);
		System.out.println("Saldo: "+Saldo);
	}
	
}
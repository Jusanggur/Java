package Prova2;

public class ContaPoupanca extends Conta {


	private int varia�ao;
	
	public ContaPoupanca(int numConta, double saldo) {
		super(numConta, saldo);
		this.varia�ao = 51;
	}

	public int getVaria�ao() {
		return varia�ao;
	}

	public void setVaria�ao(int varia�ao) {
		this.varia�ao = varia�ao;
	}

	@Override
	public void infoConta() {
		System.out.println("INFORMA��O DETALHADA DA CONTA POUPAN�A");
		System.out.println("N�MERO DA CONTA: "+getNumConta());
		System.out.println("VARIA��O: "+getVaria�ao());
		System.out.println("SALDO: "+getSaldo());
	}

}

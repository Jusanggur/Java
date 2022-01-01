package exercicio6;

public class Aluno {

	private String Nome;
	private double Soma, Media;
	private int Faltas;
	private int cont, aux, ii=1;
	private int Prova[] = new int[4];

	public Aluno(String nome) {
		this.Nome = nome;
	}

	public void addNota(int nota) {
		this.Soma = this.Soma + nota;
		Prova[aux] = nota;
		aux++;
		this.cont++;
	}

	public int getFaltas() {
		return Faltas;
	}

	public void setFaltas(int faltas) {
		this.Faltas = faltas;
	}

	public double media() {
		return Media;
	}

	public void verStatus() {
		System.out.println("Status do "+Nome);
		System.out.println("Números de faltas: "+Faltas);
		Media = this.Soma/this.cont;
		if(Faltas>20) {
			System.out.println("Reprovado por falta");
		} else {
			if(Media>=6) {
				System.out.println("Aprovado com média "+Media);
			}else {
				System.out.println("Reprovado por nota");
			}
		}
	}

	public void listarNotas() {
		for(int i=0;i<Prova.length;i++) {
			if(Prova[i]!=0) {
				System.out.println("Prova "+ ii +": "+Prova[i]);
				ii++;
			}
		}
	}

}
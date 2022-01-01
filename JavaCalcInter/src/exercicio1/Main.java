package exercicio1;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa;
		
		pessoa = new Pessoa("Joao", 18);
		pessoa.imprimir();
		
		pessoa = new Aluno("Joao", 20, 12345);
		pessoa.imprimir();
		
		pessoa = new Professor("Joao", 30, 54321);
		pessoa.imprimir();
		
	}

}

//Output
//Nome: Joao
//Idade: 18
//Nome: Joao
//Idade: 20
//Matricula: 12345
//Nome: Joao
//Idade: 30
//SIAPE: 54321

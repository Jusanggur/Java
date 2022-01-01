package exercicio3;


public class Main {
	public static void main(String[] args) {
		ListaFuncionario listaFuncionario = new ListaFuncionario();
		Funcionario funcionario = new Gerente(3000,"Mario","RH");
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.calculaBonificacao());
		listaFuncionario.addFuncionario(funcionario);

		funcionario = new Programador(2000, "Maria","Informática");
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.calculaBonificacao());
		listaFuncionario.addFuncionario(funcionario);

		funcionario = new Programador(1800, "João","Informática");
		listaFuncionario.addFuncionario(funcionario);
		
		funcionario = new Programador(3800, "Joana","Informática");
		listaFuncionario.addFuncionario(funcionario);
		
		listaFuncionario.listarFuncionarios();

	}
}
//SAÍDA ESPERADA
//3000.0
//1500.0
//2000.0
//200.0
//Nome: Mario
//Salário: 3000.0
//Bonificação: 1500.0
//Departamento: RH
//Nome: Maria
//Salário: 2000.0
//Bonificação: 200.0
//Departamento: Informática
//Nome: João
//Salário: 1800.0
//Bonificação: 180.0
//Departamento: Informática
//Nome: Joana
//Salário: 3800.0
//Bonificação: 380.0
//Departamento: Informática
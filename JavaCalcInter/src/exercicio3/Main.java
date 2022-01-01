package exercicio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Paulo", 40, "Masculino"));
		pessoas.add(new Pessoa("Mario", 43, "Masculino"));
		
		pessoas.add(new Cliente("João", 30, "Masculino", 500, 1989));
		pessoas.add(new Cliente("Pedro", 20, "Masculino", 300, 1999));
		
		pessoas.add(new Funcionario("Maria", 50, "Feminino", 5000, 123460));
		pessoas.add(new Funcionario("Mariana", 20, "Feminino", 4500, 123461));
		 
		pessoas.add(new Vendedor("Tiago", 33, "Masculino", 3000, 123456,10000, 20));
		pessoas.add(new Vendedor("Joana", 35, "Feminino", 3500,123457,15000, 30));
		
		pessoas.add(new Gerente("José", 41, "Masculino", 6000, 123458,"Compras") );
		pessoas.add(new Gerente("Madalena", 45, "Feminino", 6500,123459,"RH"));
		
		for (Pessoa pessoa : pessoas) {
			pessoa.print();
			System.out.println("");
		}
	}

}
//SAÍDA ESPERADA
//Nome: Paulo
//Idade: 40
//Sexo: Masculino
//
//Nome: Mario
//Idade: 43
//Sexo: Masculino
//
//Nome: João
//Idade: 30
//Sexo: Masculino
//Valor da dívida: 500.0
//Ano de Nascimento: 1989
//
//Nome: Pedro
//Idade: 20
//Sexo: Masculino
//Valor da dívida: 300.0
//Ano de Nascimento: 1999
//
//Nome: Maria
//Idade: 50
//Sexo: Feminino
//Matrícula: 123460
//Salário Bruto: 5000.0
//Desconto INSS: 500.0
//Salário Líquido: 4500.0
//
//Nome: Mariana
//Idade: 20
//Sexo: Feminino
//Matrícula: 123461
//Salário Bruto: 4500.0
//Desconto INSS: 450.0
//Salário Líquido: 4050.0
//
//Nome: Tiago
//Idade: 33
//Sexo: Masculino
//Matrícula: 123456
//Salário Bruto: 3000.0
//Desconto INSS: 300.0
//Salário Líquido: 2700.0
//Valor das vendas: 10000.0
//Quantidade de Vendas: 20
//
//Nome: Joana
//Idade: 35
//Sexo: Feminino
//Matrícula: 123457
//Salário Bruto: 3500.0
//Desconto INSS: 350.0
//Salário Líquido: 3150.0
//Valor das vendas: 15000.0
//Quantidade de Vendas: 30
//
//Nome: José
//Idade: 41
//Sexo: Masculino
//Matrícula: 123458
//Salário Bruto: 6000.0
//Desconto INSS: 600.0
//Salário Líquido: 5400.0
//Nome da Gerência: Compras
//
//Nome: Madalena
//Idade: 45
//Sexo: Feminino
//Matrícula: 123459
//Salário Bruto: 6500.0
//Desconto INSS: 650.0
//Salário Líquido: 5850.0
//Nome da Gerência: RH
//


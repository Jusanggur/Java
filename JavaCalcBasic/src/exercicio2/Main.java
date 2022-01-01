package exercicio2;

public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Jo�o", "email",123456,123);
		aluno.imprimir();

		Aluno aluno2 = new Aluno();
		aluno2.setEmail("email");
		aluno2.setMatricula(456);
		aluno2.setNome("Maria");
		aluno2.setTelefone(789101112);
		aluno2.imprimir();
	}

}
//SAIDA ESPERADA
//Nome: João
//Matrícula: 123
//Email: email
//Telefone: 123456
//Nome: Maria
//Matrícula: 456
//Email: email
//Telefone: 789101112
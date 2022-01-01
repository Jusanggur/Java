package exercicio3;

import java.util.ArrayList;

public class ListaFuncionario {

	private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();

	public void addFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);		
	}

	public void listarFuncionarios() {
		for(int i=0;i<funcionario.size();i++) {
			funcionario.get(i).imprimir();
		}
	}	
	
}
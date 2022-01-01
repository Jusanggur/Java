package exercicio3;


public class Main {

	public static void main(String args[]) {

		Hora hora = new Hora(); 
		hora.setHorario(15, 30, 10); 
		System.out.print("Hora: ");
		hora.imprimir(); 
		hora.setHorario(18, 30, 20); 
		System.out.print("Hora: ");
		hora.imprimir(); 
		hora.periodo();
		hora.setHorario(17, 30, 20);
		System.out.print("Hora: ");
		hora.imprimir(); 
		hora.periodo();
		
	}

}
//SAIDA ESPERADA
//Hora: 15:30:10
//Hora: 18:30:20
//Eh noite!
//Hora: 17:30:20
//Eh dia!
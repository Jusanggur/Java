package Projeto;


import java.util.ArrayList;

public class GerenciadorDespesas {

	private ArrayList<String> categorias;
	private ArrayList<Despesa> despesas;
	private String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
			"Outubro", "Novembro", "Dezembro" };

	public GerenciadorDespesas() {
		despesas = new ArrayList<Despesa>();
		categorias = new ArrayList<String>();
		categorias.add("Habitação");
		categorias.add("Transporte");
		categorias.add("Saúde");
		categorias.add("Educação");
		categorias.add("Outros");
	}

	public void listaCategorias() {
		System.out.println("------- Categorias Cadastradas -------\n");

		for (int i = 0; i < categorias.size(); i++) {
			System.out.println((i + 1) + " " + categorias.get(i));
		}
		System.out.println();
	}

	public void listarMeses() {
		for (int i = 0; i < meses.length; i++) {
			System.out.println((i + 1) + " " + meses[i]);
		}
	}

	public int numCategorias() {
		return categorias.size();
	}

	public int numDespesas() {
		return despesas.size();
	}

	public int numDespesasFixas() {
		int count = 0;
		for (Despesa despesa : despesas) {
			if (despesa instanceof Fixa)
				count++;
		}
		return count;
	}

	public int numDespesasVariaveis() {
		int count = 0;
		for (Despesa despesa : despesas) {
			if (despesa instanceof Variavel)
				count++;
		}
		return count;
	}

	public String getCategoria(int posicao) {
		return categorias.get(posicao);
	}

	public String getMes(int posicao) {
		return meses[posicao];
	}

	public boolean adicionarCategoria(String novaCategoria) {
		return categorias.add(novaCategoria);
	}

	public boolean adicionarDespesa(Despesa novaDespesa) {
		return despesas.add(novaDespesa);
	}

	public boolean removerCategoria(int posicao) {
		if (posicao >= 0 && posicao < categorias.size()) {
			categorias.remove(posicao);
			return true;
		}
		return false;
	}

	public boolean removerDespesa(int posicao) {
		if (posicao >= 0 && posicao < despesas.size()) {
			despesas.remove(posicao);
			return true;
		}
		return false;
	}

	public void imprimirDespesas() {
		System.out.println("-------- Listagem de Despesas --------\n");

		if (despesas.size() > 0) {
			for (int i = 0; i < despesas.size(); i++) {
				System.out.print("Posição " + (i + 1) + ": ");
				System.out.println(despesas.get(i));
			}

		} else {
			System.out.println("Não há despesas cadastradas!");
		}

		System.out.println();
	}

	public void imprimirPorMes() {
		System.out.println("--------- Despesas Por Mês ---------");
		// --------- Despesas Por Mês ---------
		// =========
		// JANEIRO
		// =========
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// ===========
		// FEVEREIRO
		// ===========
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// =======
		// MARÇO
		// =======
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// =======
		// ABRIL
		// =======
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// ======
		// MAIO
		// ======
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// =======
		// JUNHO
		// =======
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// =======
		// JULHO
		// =======
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// ========
		// AGOSTO
		// ========
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// ==========
		// SETEMBRO
		// ==========
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// =========
		// OUTUBRO
		// =========
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		// + Lanche R$ 15.0
		// + Compras R$ 50.0
		//
		// Total Gasto R$ 415.00
		// ------------------------------------
		// ==========
		// NOVEMBRO
		// ==========
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		// ==========
		// DEZEMBRO
		// ==========
		// + Luz R$ 100.0 [Habitação]
		// + Unimed R$ 250.0 [Saúde]
		//
		// Total Gasto R$ 350.00
		// ------------------------------------
		//
		// Total Gasto No Ano R$ 4265.00

	}

	public void imprimirDespesasFixas() {
		// ---------------MENU-----------------
		// 1 - Adicionar Despesa
		// 2 - Detalhar Despesa
		// 3 - Listar Despesas
		// 4 - Listar Despesas Fixas
		// 5 - Listar Despesas Variáveis
		// 6 - Listar Despesas por Mês
		// 7 - Remover Despesa
		// 8 - Listar Categoria
		// 9 - Adicionar Categoria
		// 10 - Remover Categoria
		// 0 - Sair
		// ------------------------------------
		// Digite opção:
		// 4
		// ---------- Despesas Fixas ----------
		//
		// Luz R$ 100.0 [Habitação]
		// Unimed R$ 250.0 [Saúde]

	}

	public void imprimirDespesasVariaveis() {
		System.out.println("-------- Despesas Variáveis --------\n");

		if (despesas.size() > 0 && numDespesasVariaveis() > 0) {
			for (int i = 0; i < despesas.size(); i++) {
				if (despesas.get(i) instanceof Variavel) {
					System.out.println(despesas.get(i));
				}
			}
		} else {
			System.out.println("Não há despesas variáveis cadastradas!");
		}

		System.out.println();
	}

	public Despesa getDespesa(int pos) {
		return despesas.get(pos);
	}

}

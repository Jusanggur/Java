
import	java.until.ArrayList;

public class CarrinhoDeCompras {
	ArrayList<Item> Itens = new ArrayList<Item>();
	private int a = 0
			
	public void addItem(Item item){
		// Adiciona um item no carrinho
		if((i > item.size)||(0 > item.size())) {
			System.out.println("Posicao Invalida");
		}
		else {
			
		}
	}

	public void removeItem(int pos){
		// Remove um item no carrinho	
		i--;
		System.out.println("Item Removido" + item.get(i).getNome());
		item.remove(i);
	}

	public double valorTotal(){
		// Retorna o valor de todos os itens do carrinho	
		double ValorDaCompra = 0;
		for( i = 0; i < item.size(); i++ ) {
			ValorDaCompra = ValorDaCompra + Item.get(i).getValor();
		}
		System.out.println(ValorDaCompra);
		return 0;
	}

	public void imprimirCarrinho(){
		// Imprime todos os itens do carrinho
		if(item.size() == 0) {
			System.out.println("Carrinho ta vazio ze");
		}
		else {
			for( int i = 0; i < Item.size(); i++) {
				a++;
				System.out.println("Item" + a + ":" + Item.get(i).getNome() + "$:" + Iem.get(i).getValor());
			}
			a = 0;
		}
	}

}

package exe4;

public class Main {

	public static void main(String[] args) {

		Produto calca = new Produto ("Calça cargo", 120.0, 10);
		Produto camiseta = new Produto ("Camiseta oversized", 75.0, 15);
		
		calca.comprarProduto(2);
		camiseta.comprarProduto(8);
		
		
	}

}

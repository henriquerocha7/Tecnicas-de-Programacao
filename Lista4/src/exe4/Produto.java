package exe4;

public class Produto {
  
	private String nome;
	private double preco;
	private int    quantidade;
	
	public Produto (String nome, double preco, int quantidade) {
		this.nome = nome;
		if (preco < 100) {
			this.preco = preco;
		}else if(preco >= 100 && preco < 200) {
			this.preco = preco - (preco * 0.1);
		}else if(preco >= 200 && preco < 500) {
			this.preco = preco - (preco * 0.2);
		}else {
			this.preco = preco - (preco * 0.25);
		}
		this.quantidade = quantidade;
	}
	
	public void comprarProduto(int quantidade) {
		if(quantidade < this.quantidade) {
			this.quantidade -= quantidade;
			System.out.println("Produto retirado: " +nome+ " - Valor com desconto: R$ "+ preco);
			System.out.println("Itens restantes: "+ this.quantidade);
			}else {
				System.out.println("Produtos insuficientes.");
			}
	}
	
	
	
	
	
	
	
	
}

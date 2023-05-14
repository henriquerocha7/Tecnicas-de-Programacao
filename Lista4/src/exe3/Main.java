package exe3;

public class Main {

	public static void main(String[] args) {
	
		Fatura fatura = new Fatura (4, "Peito de frango", 5, 15.0, 75.0);
	
	System.out.println(fatura.c.descricao);
	
	System.out.println("Preço unitário: "+ fatura.getPrecoUnitario());
	System.out.println("Quantidade: "+ fatura.getQuantidade());
	System.out.println("Valor total: "+fatura.getValorFatura());
	System.out.println("Item com desconto: "+fatura.desconto(15.0, 10));
	
	System.out.println("Valor total com desconto: "+fatura.descontoTotal(13.49));
	
	
	}

}

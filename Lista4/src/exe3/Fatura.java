package exe3;

public class Fatura {

	protected double precoTotal;
	
	Item c = new Item ();
			
	public Fatura (int numero, String descricao, int quantidade, double precoUnitario, double precoTotal ) {
		this.precoTotal = precoTotal;
		this.c.numero = numero;
		this.c.descricao = descricao;
		if(quantidade < 0) {
			this.c.quantidade = 0;
		}else{
			this.c.quantidade = quantidade;
		}
		if(precoUnitario < 0 ) {
			this.c.precoUnitario = 0;
		}else {
			this.c.precoUnitario = precoUnitario;
		}
	}
	
	public int getNumero() {
		return c.numero;
	}
	public void setNumero(int numero) {
		this.c.numero = numero;
	}
	public String getDescricao() {
		return c.descricao;
	}
	public void setDescricao(String descricao) {
		this.c.descricao = descricao;
	}
	public int getQuantidade() {
		return c.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.c.quantidade = quantidade;
	}
	public double getPrecoUnitario() {
		return c.precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.c.precoUnitario = precoUnitario;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public double getValorFatura() {
		return (this.c.precoUnitario * this.c.quantidade);
	}
	
	public double desconto(double precoUnitario, float desconto) {
		double precoComDesconto = precoUnitario;
		if (precoUnitario > 0 && desconto > 0)
			precoComDesconto = precoUnitario - (precoUnitario * (desconto/100));
		else {
			precoComDesconto = 0;
		}

		return precoComDesconto;
	}
	
	public double descontoTotal(double precoComDesconto) {
		double precoComDescontoTotal = precoComDesconto * c.quantidade;
		
		return precoComDescontoTotal;
	}
	
}
package exe6;

public class Ingresso {

	public double valor;
	public int quantidade;
	
	public Ingresso (double valor) {
		this.valor = valor;
	}
	
	public Ingresso (double valor, int quantidade) {
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public String toString() {
		return "O valor do ingresso é: R$ "+this.valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade  = quantidade;
	}
	
	
}

package exe6;

public class IngressoVIP extends Ingresso {

	private double valorAdicional;
	public int quantidade;
	
	public IngressoVIP(double valor, double valorAdicional, int quantidade) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public String toString() {
		return "O valor do ingresso VIP é: R$ "+ (getValor() + valorAdicional);
	}
	
	public double getValorVIP() {
		return getValor() + valorAdicional;
	}
	
	
	
}

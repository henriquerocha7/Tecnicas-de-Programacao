package exe10_11_12;

public class Vendedor extends Empregado {
	
	protected double valorVendas;
	protected double comissao;

	public Vendedor(String nome, int idade, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.comissao = comissao * valorVendas;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		this.valorVendas = valorVendas;
	}

	public double calcularSalario() {
		double salario;
		salario = salarioBase - (getSalarioBase() * getImposto());
		salario += comissao;
	
		return salario;
	}
	

}

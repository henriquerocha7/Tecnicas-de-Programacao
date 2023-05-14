package exe10_11_12;

public class Operario extends Empregado {

	protected double valorProducao;
	protected double comissao;
	
	public Operario(String nome, int idade, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.comissao = comissao * valorProducao;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		this.valorProducao = valorProducao;
	}

	public double calcularSalario() {
		double salario;
		salario = salarioBase - (getSalarioBase() * getImposto());
		salario += comissao;
	
		return salario;
	}
	
}

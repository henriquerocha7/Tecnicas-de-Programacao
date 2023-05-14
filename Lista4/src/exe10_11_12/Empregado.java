package exe10_11_12;

public class Empregado extends Pessoa {

	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	
	public Empregado(String nome, int idade, int codigoSetor, double salarioBase, double imposto) {
		super(nome, idade);
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario() {
		double salario;
		salario = salarioBase - (getSalarioBase() * getImposto());
	
		return salario;
	}
}

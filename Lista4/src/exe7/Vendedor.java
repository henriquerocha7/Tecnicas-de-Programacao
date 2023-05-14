package exe7;

public class Vendedor extends Empregado {
	
	public double comissao;
	
	public Vendedor(String nome, float salario, double comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}
	
	public float calcularSalario () {
		return salario += salario * comissao;
	}
	
	public String toString () {
		return "Vendedor - Nome: " +nome+ " -- Salário sem comissão: R$ " +salario+ " -- Salário com comissão: R$ " +(salario +(salario * comissao));
	}
}

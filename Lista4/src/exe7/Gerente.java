package exe7;

public class Gerente extends Empregado {

	public int departamento;
	
	public Gerente(String nome, float salario, int departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}
	
	public String getNome () {
		return super.getNome();
	}
	public void setNome (String nome) {
		super.setNome(nome);
	}
	
	public float getSalario () {
		return super.getSalario();
	} 
	public void setSalario (float salario) {
		super.setSalario(salario);
	}
	
	public int getDepartamento () {
		return departamento;
	}
	public void setDepartamento (int departamento) {
		this.departamento = departamento;
	}
	
	public String toString () {
		return "Gerente - Nome: " +nome+ " -- Salário: R$ " +salario+ " -- Departamento: " +departamento;
	}
	
	
	
	
}

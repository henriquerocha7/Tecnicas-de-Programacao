package biblioteca;

public class Professor extends Cliente {

	public Professor(int matricula, String nome, float tps) {
		super(matricula, nome, tps);
		this.tipo = "Professor";
		this.publicacoesSimultaneas = 10;
	}
	
	public int verificarDias() {
		return 20;
	}

	public double darDesconto() {
		return 0;
	}

}

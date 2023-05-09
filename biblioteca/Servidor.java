package biblioteca;

public class Servidor extends Cliente {

	public Servidor(int matricula, String nome, float tps) {
		super(matricula, nome, tps);
		this.tipo = "Servidor";
		this.publicacoesSimultaneas = 7;
	}

	public int verificarDias() {
		return 15;
	}

	public double darDesconto() {
		return 0;
	}

}

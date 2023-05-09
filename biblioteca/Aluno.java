package biblioteca;

public class Aluno extends Cliente {

	public Aluno(int matricula, String nome, float tps) {
		super(matricula, nome, tps);
		this.tipo = "Aluno";
		this.publicacoesSimultaneas = 5;
		}

	public int verificarDias() {
		return 10;
	}

	public double darDesconto() {
		return 1;
	}

}

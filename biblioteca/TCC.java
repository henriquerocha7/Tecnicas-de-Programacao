package biblioteca;

public class TCC extends Publicacao {

	public TCC(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo = "TCC";
	}

	@Override
	public double darDesconto() {
		// TODO Auto-generated method stub
		return 0;
	}

}

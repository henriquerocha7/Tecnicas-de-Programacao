package biblioteca;

public class Revista extends Publicacao {

	public Revista(String titulo, int ano, String autor, int quantidadeDisponivel) {
		super(titulo, ano, autor, quantidadeDisponivel);
		this.tipo = "Revista";
	}

	@Override
	public double darDesconto() {
		// TODO Auto-generated method stub
		return 0;
	}

}

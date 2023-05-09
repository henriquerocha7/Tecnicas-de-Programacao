package biblioteca;
import java.util.ArrayList;

public abstract class Cliente implements VerificarDias, Desconto {

	protected int matricula;
	protected String nome;
	protected double tps = 0;
	protected String tipo;
	protected int publicacoesSimultaneas;
	protected ArrayList<Publicacao> publiPegas;
	
	public Cliente (int matricula, String nome, float tps) {
		this.matricula = matricula;
		this.nome = nome;
		this.tps = tps;
		publiPegas = new ArrayList<Publicacao>();
	}
	
	public void addPublicacao (Publicacao p) {
		publiPegas.add(p);
	}
	
	public ArrayList<Publicacao> getPubliPegas () {
		return publiPegas;
	}
	
	public double divida() {
		if(tipo == "Aluno") {
			tps += 10;
			return tps;
		}else if(tipo == "Professor") {
			tps += 25;
			return tps;
		}else if(tipo == "Servidor") {
			tps += 15;
		return tps;
		}else {
			return 0;
		}
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
		
	public double getTps() {
		return tps;
	}
	public void setTps(double tps) {
		this.tps = tps;
	}
	
	public int getPublicacoesSimultaneas() {
		return publicacoesSimultaneas;
	}
	public void setPublicacoesSimultaneas(int publicacoesSimultaneas) {
		this.publicacoesSimultaneas = publicacoesSimultaneas;
	}
	
	public void imprimirListaDePublicacoesPegas () {
		for (Publicacao p : publiPegas) {
			System.out.println(p.titulo);
		}
	}
	
	public void consultaMatricula (int matricula) {
		for (Publicacao p : publiPegas) {
			if(this.matricula == matricula) {
				System.out.println("Cliente: " +nome+ "\n Publicações:");
				for (int i = 0; i <publiPegas.size(); i++) {
					System.out.println(publiPegas.get(i).titulo);
				}
			}
		}
	}
	
}

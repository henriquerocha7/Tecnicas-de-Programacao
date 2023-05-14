package exe14;

public class Main {

	public static void main(String[] args) {

		Pessoa AlbertEinster = new Pessoa (0, 14, 3, 1879, "Albert");
		Pessoa IssacNewton = new Pessoa (0, 4, 1, 1643, "Issac");
		
		AlbertEinster.calcularIdade();
		IssacNewton.calcularIdade();
		
		System.out.println(AlbertEinster.informaIdade());
		System.out.println(IssacNewton.informaIdade());
		
	}

}

package exe2;

public class Main {

	public static void main(String[] args) {

		Empregado empregado1 = new Empregado ("Henrique", "Rocha", 3500);
		Empregado empregado2 = new Empregado ("Bruna", "Xavier", 3750);
		
		empregado1.imprimirSalarioAnual();
		empregado2.imprimirSalarioAnual();
		
		empregado1.setSalarioMensal(3850);
		empregado2.setSalarioMensal(4125);
	
		empregado1.imprimirSalarioAnual();
		empregado2.imprimirSalarioAnual();
	}
}

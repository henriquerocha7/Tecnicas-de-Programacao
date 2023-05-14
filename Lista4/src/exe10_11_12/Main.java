package exe10_11_12;

public class Main {

	public static void main(String[] args) {

		Pessoa empregado = new Empregado("Carlos", 25, 111, 2500, 0.1);
		Pessoa operario = new Operario("Rafael", 31, 118, 3000, 0.1, 1500, 0.15);
		Pessoa vendedor = new Vendedor("Robert", 34, 224, 1500, 0.1, 1000, 0.1);
		
		System.out.println("Sálario empregado: R$ " +empregado.calcularSalario());
		System.out.println("Sálario operario: R$ " +operario.calcularSalario());
		System.out.println("Sálario vendedor: R$ " +vendedor.calcularSalario());
		
	}
}

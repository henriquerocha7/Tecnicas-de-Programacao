package exe9;

public class Quadrado extends Forma {

	public Quadrado(double altura, double base) {
		super(altura, base);
		this.tipo = "Quadrado";
	}

	public String calcularArea() {
		if (base == altura) {
		area = base * altura;
		}else {
			System.out.println("O poligono não é um quadrado.");
		}
		return "A área do " +tipo+ " é: " +area;
	}
	
	public String imprimirNome() {
		return tipo;
	}
}

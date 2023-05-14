package exe9;

public class Circulo extends Forma {

	public Circulo(double raio) {
		super(raio);
		this.tipo = "Circulo";
	}

	
	public String imprimirNome() {
		return tipo;
	}
	public String calcularArea() {
		area = Math.PI * (Math.pow(raio, 2));
		return "A área do " +tipo+ " é: " +area;
	}
}

package exe9;

public abstract class Forma {

	public double area;
	public double altura;
	public double base;
	public double raio;
	public String tipo;
	
	public Forma(double raio) {
		this.raio = raio;
	}
	
	public Forma(double altura, double comprimento) {
		super();
		this.altura = altura;
		this.base = comprimento;
	}

	public String calcularArea() {
		return "A área do " +tipo+ " é: " +area;
	}
	
	public String imprimirNome() {
		return tipo;
	}
	
}
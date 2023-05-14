package exe9;

public class Retangulo extends Forma {

	public Retangulo(double altura, double base) {
		super(altura, base);
		this.tipo = "Retangulo";
	}

	public String calcularArea() {
		area = base * altura;
		
		return "A área do " +tipo+ " é: " +area;
	}
	
	public String imprimirNome() {
		return tipo;
	}
	

}

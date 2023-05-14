package exe9;

public class Triangulo extends Forma {

	public Triangulo(double altura, double comprimento) {
		super(altura, comprimento);
		this.tipo = "Triângulo";
	}
	
	public String calcularArea() {
		area = (base * altura)/2;
		
		return "A área do " +tipo+ " é: " +area;
	}
	
	public String imprimirNome() {
		return tipo;
	}

}
